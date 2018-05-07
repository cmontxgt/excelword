package swx.excel.convert;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import swx.excel.dao.lxt.XT_PC_LBPZB_MBMapper;
import swx.excel.dao.lxt.XT_PC_PCXFL_MBMapper;
import swx.excel.dao.lxt.XT_PC_PCX_MBMapper;
import swx.excel.dao.xxt.AjPcxMapper;
import swx.excel.dao.xxt.AjPcxflMapper;
import swx.excel.dao.xxt.AjXtPcMbMapper;
import swx.excel.domain.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author caomin
 * @date 2018/1/17
 * @说明 164旧数据转换到163
 */
@Component
public class LxtConvertToNew {


    @Autowired
    XT_PC_LBPZB_MBMapper xt_pc_lbpzb_mbMapper;

    @Autowired
    XT_PC_PCXFL_MBMapper pcPcxflMbMapper;

    @Autowired
    XT_PC_PCX_MBMapper pcPcxMbMapper;


    @Autowired
    AjXtPcMbMapper ajXtPcMbMapper;

    @Autowired
    AjPcxflMapper ajPcxflMapper;

    @Autowired
    AjPcxMapper ajPcxMapper;

    /**
     * 模板
     */
    public void convert(){
        XT_PC_LBPZB_MBExample example = new XT_PC_LBPZB_MBExample();

        ArrayList<String> pcmbbmList = new ArrayList<>();
        pcmbbmList.add("5200000000000221");
        pcmbbmList.add("5200000000000220");
        pcmbbmList.add("3700000000000191");
        pcmbbmList.add("3700000000000192");
        


/*
        pcmbbmList.add("3700000000000185");
        pcmbbmList.add("3700000000000178");
        pcmbbmList.add("3700000000000180");
        pcmbbmList.add("3700000000000175");

        pcmbbmList.add("3700000000000186");
        pcmbbmList.add("3700000000000183");
        pcmbbmList.add("3700000000000181");
        pcmbbmList.add("3700000000000174");*/
        example.createCriteria().andPclbBmIn(pcmbbmList);
        List<XT_PC_LBPZB_MB> mbList = xt_pc_lbpzb_mbMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(mbList)){
            mbList.stream().forEach(data->{
                //写评查模板
                AjXtPcMb ajXtPcMb=new AjXtPcMb();
                String pclbBm = data.getPclbBm();
                String replace = pclbBm.replace("370000000", "370000001");
                ajXtPcMb.setPcmbbm(replace);

                ajXtPcMb.setPcmbmc(data.getPclbZmc());
                ajXtPcMb.setDwbm(data.getDwbm());
                ajXtPcMb.setPcflbm(data.getPcFlbm());
                ajXtPcMb.setSfqy(data.getSfqy());
                ajXtPcMb.setCjsj(data.getCjsj());
                ajXtPcMb.setSm("0504cq");
                String pclbBz = data.getPclbBz();
                if (!StringUtils.isEmpty(pclbBz)){
                    ajXtPcMb.setPcmbnr(pclbBz.getBytes());
                }
                ajXtPcMb.setXh(new BigDecimal(99));
                ajXtPcMb.setPcmblx("0");
                convertPcxfl(data);
                ajXtPcMbMapper.insertSelective(ajXtPcMb);
            });
        }
    }

    /**
     * 评查分类
     * @param mb
     */
    private void convertPcxfl(XT_PC_LBPZB_MB mb){

        XT_PC_PCXFL_MBExample example = new XT_PC_PCXFL_MBExample();
        String pcmbbm = mb.getPclbBm();
        example.createCriteria().andPclbBmEqualTo(pcmbbm).andPcxflFbmIsNull();
        List<XT_PC_PCXFL_MB> pcxflMbs = pcPcxflMbMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(pcxflMbs)){
            pcxflMbs.stream().forEach(data->{
                String pcxflBm = data.getPcxflBm();
                //获取生成新的flbm
                String newPcxflbm = savePcxfl( data,null);
                String replace = pcmbbm.replace("370000000", "370000001");
                convertPcxflChild(pcmbbm,pcxflBm,newPcxflbm);
                savePcx(data,newPcxflbm);
            });
        }
    }

    /**
     * 评查子分类
     * @param
     * @param pcxflfbm
     * @param newPcxflbm
     */
    private void convertPcxflChild(String pcmbbm, String pcxflfbm, String newPcxflbm){
        //找儿子
        XT_PC_PCXFL_MBExample example = new XT_PC_PCXFL_MBExample();
        example.createCriteria().andPclbBmEqualTo(pcmbbm).andPcxflFbmEqualTo(pcxflfbm);

        List<XT_PC_PCXFL_MB> pcxflMbs = pcPcxflMbMapper.selectByExample(example);

        if (!CollectionUtils.isEmpty(pcxflMbs)){
            for (XT_PC_PCXFL_MB data : pcxflMbs) {
                XT_PC_PCXFL_MB temp=data;
                String pcxflBm = data.getPcxflBm();
                String s = savePcxfl( data, newPcxflbm);
                savePcx(temp,s);
                convertPcxflChild(pcmbbm,pcxflBm, s);
            }
        }
    }


    /**
     * 保存分类
     * @param data 数据
     * @param newPcxflbm 现父编码
     * @return 分类编码
     */
    private String savePcxfl(XT_PC_PCXFL_MB data, String newPcxflbm) {
        String pcflbmPrefix=data.getPclbBm();
        AjpcPcxfl ajpcPcxfl = new AjpcPcxfl();
        //生成新的flbm
        String pcxflBm = data.getPcxflBm();
        String pcflbmSufix = pcxflBm.substring(pcxflBm.length() - 4, pcxflBm.length());

        String pcxflbmTemp = pcflbmPrefix + pcflbmSufix;

        ajpcPcxfl.setPcxflbm(pcxflbmTemp);
        ajpcPcxfl.setPcxflmc(data.getPcxflMc());

        if (newPcxflbm!=null){
            ajpcPcxfl.setPcxflfbm(newPcxflbm);
        }
        //保存数据
        ajpcPcxfl.setPcmbbm(data.getPclbBm());
        String replace = ajpcPcxfl.getPcxflbm().replace("370000000", "370000001");
        ajpcPcxfl.setPcxflbm(replace);
        ajpcPcxfl.setPcmbbm(ajpcPcxfl.getPcmbbm().replace("370000000", "370000001"));
        ajpcPcxfl.setPcjlbm("0504cq");
        ajpcPcxfl.setXh(data.getSx());
        String pcxflfbm = ajpcPcxfl.getPcxflfbm();
        if (!StringUtils.isEmpty(pcxflfbm)){
            ajpcPcxfl.setPcxflfbm(pcxflfbm.replace("370000000", "370000001"));
        }
        ajpcPcxfl.setSftj(data.getSftj());
        ajpcPcxfl.setSm(data.getPcxflBz());
        ajPcxflMapper.insertSelective(ajpcPcxfl);
        return pcxflbmTemp;
    }


    /**
     * 写pcx 表
     * @param pcxflMb
     * @param pcxflbm
     */
    public void savePcx(XT_PC_PCXFL_MB pcxflMb, String pcxflbm){
        String pcbmPrefix=pcxflMb.getPclbBm();
        String pcmbbm = pcxflMb.getPclbBm();
        XT_PC_PCX_MBExample pcx_mbExample = new XT_PC_PCX_MBExample();
        pcx_mbExample.createCriteria().andPclbBmEqualTo(pcmbbm)
                .andPcxflBmEqualTo(pcxflMb.getPcxflBm());
        List<XT_PC_PCX_MB> pcxMbList = pcPcxMbMapper.selectByExample(pcx_mbExample);
        pcxMbList.stream().forEach(data->{
            AjpcPcx ajpcPcx = new AjpcPcx();
            BeanUtils.copyProperties(data,ajpcPcx);
            String pcxBm = data.getPcxBm();
            String pcxbmSurffix = pcxBm.substring(pcxBm.length() - 4, pcxBm.length());
            ajpcPcx.setPcxbm(pcbmPrefix+pcxbmSurffix);
            ajpcPcx.setXh(data.getSx());
            ajpcPcx.setPcxmc(data.getPcxMc());
            ajpcPcx.setPcxflbm(pcxflbm.replace("370000000", "370000001"));
            String replace = ajpcPcx.getPcxbm().replace("370000000", "370000001");
            ajpcPcx.setPcxbm(replace);
            ajpcPcx.setBz(data.getPcxBz());
            ajpcPcx.setMrz("0504cq");
            ajpcPcx.setPcmbbm(pcmbbm.replace("370000000", "370000001"));
            ajPcxMapper.insertSelective(ajpcPcx);
        });
    }

    public void test(){
        HashSet set=new HashSet();
        XT_PC_PCXFL_MBExample example = new XT_PC_PCXFL_MBExample();
        example.createCriteria().andPcxflFbmIsNotNull();

        List<XT_PC_PCXFL_MB> pcxflMbs = pcPcxflMbMapper.selectByExample(example);

        AjpcPcxflExample ajpcPcxflExample = new AjpcPcxflExample();
        AjpcPcxflExample.Criteria criteria = ajpcPcxflExample.createCriteria().andPcxflfbmIsNotNull().andPcjlbmLike("%164数据%");
        List<AjpcPcxfl> ajpcPcxfls = ajPcxflMapper.selectByExample(ajpcPcxflExample);


        ajpcPcxfls.stream().forEach(data->{
            set.add(data.getPcxflmc());
        });
        pcxflMbs.stream().forEach(data->{
            String pcxflMc = data.getPcxflMc();
            if (set.contains(pcxflMc)){
                set.remove(pcxflMbs);
            }else {
                set.add(pcxflMc);
            }
        });
        System.out.println(set);
    }



}
