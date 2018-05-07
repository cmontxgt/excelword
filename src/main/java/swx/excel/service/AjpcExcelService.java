package swx.excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import swx.excel.dao.xxt.AjPcxMapper;
import swx.excel.dao.xxt.AjPcxflMapper;
import swx.excel.domain.AjpcPcx;
import swx.excel.domain.AjpcPcxfl;

import swx.excel.pojo.PcxflVo;

import java.math.BigDecimal;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * 解析评查项分类
 *
 * @caomin
 * @create 2018-01-12 11:43
 **/
@Component
public class AjpcExcelService {

    @Autowired
    AjPcxMapper pcxMapper;

    @Autowired
    AjPcxflMapper pcxflMapper;


    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    /**
     * 入库
     * @param pcmbbm 评查模板编码
     * @param collectionName 数据集合名称
     */
    public void writeDb(String pcmbbm, String collectionName){
        Query query = new Query();
        //todo  这里有坑
        //query.addCriteria(Criteria.where("pcxmc").is("empty"));
        List<PcxflVo> pcxflVos = mongoTemplate.find(query, PcxflVo.class, collectionName);
       //写xt_yx_pcxfl
        List<String> collect = pcxflVos.stream().map(PcxflVo::getParent).distinct().collect(Collectors.toList());

        collect.stream().forEach(pcxflmc->{
            {
                System.out.println("评查分类名称:"+pcxflmc);
                AjpcPcxfl pcxFlParent = new AjpcPcxfl();
                pcxFlParent.setPcxflmc(pcxflmc);
                //设置序号
                int i = collect.indexOf(pcxflmc);
                pcxFlParent.setXh(new BigDecimal(i));

                //写顶级评查项分类
                writePcxfl(pcmbbm,pcxFlParent);

                //获取评查分类子分类
                List<PcxflVo> pcxflVos1 = getPcxzfl(collectionName, pcxflmc);
                //去重
                List<String> pcxzflmcList = pcxflVos1.stream().map(PcxflVo::getPcxflmc).distinct().collect(Collectors.toList());
                pcxzflmcList.stream().forEach(pcxflzmc->{
                    {

                        AjpcPcxfl pcxfl = new AjpcPcxfl();
                        pcxfl.setPcxflmc(pcxflzmc);
                        pcxfl.setPcxflfbm(pcxFlParent.getPcxflbm());

                        //设置序号
                        int j = pcxzflmcList.indexOf(pcxflzmc);
                        pcxfl.setXh(new BigDecimal(j));
                        //写评查分类子分类
                        writePcxfl(pcmbbm,pcxfl);
                        System.out.println("评查分类子分类:"+pcxflzmc);
                        //子分类下面的评查项
                        List<PcxflVo> pcxList = writePcx(collectionName, pcxflmc, pcxflzmc);
                        pcxList.stream().forEach(pcxflVo->{
                            {
                                if (!pcxflVo.getPcxmc().equalsIgnoreCase("empty")){
                                    AjpcPcx ajpcPcx = new AjpcPcx();
                                    ajpcPcx.setPcxmc(pcxflVo.getPcxmc());
                                    ajpcPcx.setXh(new BigDecimal(pcxflVo.getXh()));
                                    ajpcPcx.setPcxflbm(pcxfl.getPcxflbm());
                                    ajpcPcx.setPcmbbm(pcmbbm);
                                    ajpcPcx.setSftj("Y");
                                    writePcx(ajpcPcx);
                                }
                            }
                        });
                    }
                });

            }
        });


    }

    /**
     * 获取评查分类子分类
     * @param collectionName
     * @param pcxflmc
     * @return
     */
    private List<PcxflVo> getPcxzfl(String collectionName, String pcxflmc) {
        Query pcxzfl = new Query();
        pcxzfl.addCriteria(Criteria.where("parent").is(pcxflmc));
        return mongoTemplate.find(pcxzfl, PcxflVo.class, collectionName);
    }

    /**
     * 获取 评查项
     * @param collectionName
     * @param parentPcxflMc
     * @param
     * @return
     */
    private  List<PcxflVo> writePcx(String collectionName, String parentPcxflMc,String pcxflzmc) {

            Query pcxQuery = new Query();
            pcxQuery.addCriteria(Criteria.where("parent").is(parentPcxflMc).and("pcxflmc").is(pcxflzmc));
            List<PcxflVo> pcxflVos2 = mongoTemplate.find(pcxQuery, PcxflVo.class, collectionName);
            return pcxflVos2;
    }

    /**
     * 写 pcxfl 表
     * @param pcmbbm
     * @param ajpcPcxfl
     */
    private void writePcxfl(String pcmbbm,AjpcPcxfl ajpcPcxfl ) {
        ajpcPcxfl.setPcxflbm(getPcxflbm(pcmbbm));
        String pcxflmc = ajpcPcxfl.getPcxflmc();
        if ("正确".equalsIgnoreCase(pcxflmc)||"准确".equalsIgnoreCase(pcxflmc)||"规范".equalsIgnoreCase(pcxflmc)||"良好".equalsIgnoreCase(pcxflmc)){
            ajpcPcxfl.setMrz("1");
        }
        ajpcPcxfl.setPcmbbm(pcmbbm);
        ajpcPcxfl.setSm("余杭");
        pcxflMapper.insertSelective(ajpcPcxfl);
    }

    /**
     * 写pcx 表
     * @param pcx
     */
    private void writePcx(AjpcPcx pcx){
        pcx.setPcxbm(getPcxbm(pcx.getPcmbbm()));
        String pcxmc = pcx.getPcxmc();
        if (pcxmc.equalsIgnoreCase("其它")||pcxmc.equalsIgnoreCase("其他")){
            pcx.setPcfs("2");
        }
        pcx.setBz("余杭");
        pcxMapper.insertSelective(pcx);
    }





    /**
     * 获取编号  XT_PC_PCXFL
     * @return
     */
    private String getPcxflbm(String pcmbbm) {

        String sql="select max(PCXFLBM) AS  bm FROM XT_PC_PCXFL WHERE pcmbbm="+pcmbbm;
        Map<String, Object> result = jdbcTemplate.queryForMap(sql);
        String l = getSingResult(pcmbbm, result);
        if (l != null) {
            return l;
        }
        return   pcmbbm+"0001";
    }
    /**
     * 获取编号  XT_PC_PCX
     * @return
     */
    private String getPcxbm(String pcmbbm) {

        String sql="select max(PCXBM) AS  bm FROM XT_PC_PCX WHERE pcmbbm="+pcmbbm;
        Map<String, Object> result = jdbcTemplate.queryForMap(sql);

        String l = getSingResult(pcmbbm, result);
        if (l != null) {
            return l;
        }
        return   pcmbbm+"0001";
    }

    private String getSingResult(String pcmbbm, Map<String, Object> result) {
        if (!result.isEmpty()){
            String bm = (String) result.get("bm");
            if (StringUtils.isEmpty(bm)){
                return pcmbbm+"0001";
            }
            try {
                return getStringBuffer(bm);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    private String getStringBuffer(String bm) throws ParseException {
        NumberFormat instance = NumberFormat.getInstance();
        BigDecimal bigDecimal = new BigDecimal(bm);
        BigDecimal add = bigDecimal.add(new BigDecimal(1));
        return instance.format(add, new StringBuffer(), new FieldPosition(0)).toString().replaceAll(",","");
    }
}
