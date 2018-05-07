package swx.excel.excel;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import swx.excel.dao.lxt.OldLBPZB_MBMOldapper;
import swx.excel.dao.lxt.OldXT_PCXFL_MBOldMapper;
import swx.excel.dao.lxt.OldPCX_MBOldMapper;
import swx.excel.domain.LBPZB_MB;
import swx.excel.domain.PCXFL_MB;
import swx.excel.domain.PCX_MB;

import java.math.BigDecimal;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 * 写入数据
 *
 * @caomin
 * @create 2017-12-26 14:57
 **/
@Component
public class ExcelWrite {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    OldLBPZB_MBMOldapper lbpzb_mbMapper;



    @Autowired
    OldXT_PCXFL_MBOldMapper pcxfl_mbMapper;

    @Autowired
    OldPCX_MBOldMapper pcx_mbMapper;


    @Autowired
    ExcelParser excelParser;
    /**
     *
     * 写类别配置表 模板表  XT_PC_LBPZB_MB
     */
    public LBPZB_MB writelbpzb(String pclbzmc,String pcflbm) {
        ArrayList<String> pcflbms = new ArrayList<>();
        pcflbms.add("001");
        pcflbms.add("002");
        pcflbms.add("003");

        Date date = DateTime.now().toLocalDate().toDate();
        LBPZB_MB lbpzb_mb=new LBPZB_MB();
        lbpzb_mb.setPclbZmc(pclbzmc);
        lbpzb_mb.setPclbBm(getPzbmbMaxPclbBm());
        lbpzb_mb.setSfqy("Y");
        lbpzb_mb.setCjsj(date);
        lbpzb_mb.setDwbm("370000");
        lbpzb_mb.setPcFlbm(pcflbm);

        lbpzb_mbMapper.insertSelective(lbpzb_mb);
        return lbpzb_mb;
    }


    /**
     * 往XT_PC_PCXFL_MB写数据
     * @param pcxflmc 评查项分类名称
     * @param pclbbm 评查类别编码
     * @param pcxflfbm 评查项分类 父编码
     *                 todo 分值
     *
     * @return
     */
    public PCXFL_MB writePcxflmb(String pcxflmc,String pclbbm,String pcxflfbm){
        PCXFL_MB pcxfl_mb=new PCXFL_MB();
        pcxfl_mb.setPcxflMc(pcxflmc);
        pcxfl_mb.setPcxflFbm(pcxflfbm);
        pcxfl_mb.setPclbBm(pclbbm);
        pcxfl_mb.setPcxflBm(getPcxFlbmMaxPclbBm());
        pcxfl_mbMapper.insertSelective(pcxfl_mb);
        return pcxfl_mb;
    }


    /**
     * 写评查项模板
     * @param excelModel
     * @param pclbbm
     * @param pcxflbm
     * @return
     */
    public PCX_MB writePcxmb(ExcelModel excelModel,String pclbbm,String pcxflbm) {
        PCX_MB pcxMb=new PCX_MB();
        /**
         * 设置评查项内容
         */
        String pcxMc = excelParser.getPcxMc(excelModel);
        pcxMb.setPcxMc(pcxMc);

        pcxMb.setPcxBm(getPcxBm());
        String kfz = excelModel.getKfz();
        if (StringUtils.isEmpty(kfz)){
            kfz="0";
        }
        pcxMb.setFzGd(new BigDecimal(kfz));
        pcxMb.setFzJsz(new BigDecimal(0));
        pcxMb.setFzQsz(new BigDecimal(0));
        pcxMb.setGxlbMc(excelModel.getCwdj());
        pcxMb.setPclbBm(pclbbm);
        pcxMb.setPcxflBm(pcxflbm);
        pcxMb.setPcxLx(new BigDecimal(-1));
        pcxMb.setPcxBz(excelModel.getFlyj());
        pcx_mbMapper.insertSelective(pcxMb);
        return pcxMb;
    }










    /**
     * 获取编号  XT_PC_LBPZB_MB
     * @return
     */
    private String getPzbmbMaxPclbBm() {
        //return UUID.randomUUID().toString().substring(0,16);
        String sql="select max(PCLB_BM) AS  bm FROM XT_PC_LBPZB_MB";
        Map<String, Object> result = jdbcTemplate.queryForMap(sql);
        if (!result.isEmpty()){
            String bm = (String) result.get("bm");
            if (StringUtils.isEmpty(bm)){
                return "3700000000000001";
            }
            try {
                long l = NumberFormat.getInstance().parse(bm.trim()).longValue() + 1;
                return Long.toString(l);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return "3700000000000000000001";
    }




    /**
     * 获取编号  XT_PC_PCXFL_MB
     * @return
     */
    private String getPcxFlbmMaxPclbBm() {
       // return UUID.randomUUID().toString().substring(0,16);
        String sql="select max(PCXFL_BM) AS  bm FROM XT_PC_PCXFL_MB";
        Map<String, Object> result = jdbcTemplate.queryForMap(sql);
        if (!result.isEmpty()){
            String bm = (String) result.get("bm");
            if (StringUtils.isEmpty(bm)){
                return "3700000000000000000001";
            }
            try {
                return getStringBuffer(bm);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    /**
     * 获取编号  XT_PC_PCX_MB
     * @return
     */
   private String getPcxBm(){
       //return getKey();
        String sql="select max(PCX_BM) AS  bm FROM XT_PC_PCX_MB";
        Map<String, Object> result = jdbcTemplate.queryForMap(sql);
        if (!result.isEmpty()){
            String bm = (String) result.get("bm");
            if (StringUtils.isEmpty(bm)){
                return "3700000000000000000001";
            }
            try {
               return getStringBuffer(bm);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return "3700000000000000000001";
    }


    private String getStringBuffer(String bm) throws ParseException {
        NumberFormat instance = NumberFormat.getInstance();
        BigDecimal bigDecimal = new BigDecimal(bm);
        BigDecimal add = bigDecimal.add(new BigDecimal(1));
        return instance.format(add, new StringBuffer(), new FieldPosition(0)).toString().replaceAll(",","");
    }

}
