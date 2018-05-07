package swx.excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import swx.excel.domain.LBPZB_MB;
import swx.excel.domain.PCXFL_MB;
import swx.excel.excel.ExcelModel;
import swx.excel.excel.ExcelParser;
import swx.excel.excel.ExcelWrite;

import java.util.List;

/**
 * excel
 *
 * @caomin
 * @create 2017-12-26 16:14
 **/
@Component
public class ExcelService {

    @Autowired
    ExcelWrite excelWrite;

    @Autowired
    ExcelParser excelParser;


    public void write(String collecitonName,String pcflbm) throws Exception {
        //获取顶级配置
        String  pclbzmc= excelParser.getpcxpzbmb(collecitonName);
        /**
         * 写顶级配置表
         */
        LBPZB_MB writelbpzb = excelWrite.writelbpzb(pclbzmc, pcflbm);

        //评查类别编码
        String pclbBm = writelbpzb.getPclbBm();

        //获取模板配置
        List<String> excelModel = excelParser.getPcflmbList(collecitonName);

        //data是评查类别
        excelModel.stream().forEach(data->{
            //写配置模板表,没有父项的
            PCXFL_MB pcxfl_mb = excelWrite.writePcxflmb(data, pclbBm, "");
            String pcxflBm = pcxfl_mb.getPcxflBm();
            //获取评查项分类父编码
            List<ExcelModel> getpcxflbm = excelParser.getpcxflmb(collecitonName,data);
            if (!CollectionUtils.isEmpty(getpcxflbm)){
                getpcxflbm.stream().forEach(
                        zfl->{
                            String pcxmc = zfl.getPcnr();
                            //所有的子模板
                            PCXFL_MB pcxfl_mb1 = excelWrite.writePcxflmb(pcxmc, pclbBm, pcxflBm);
                            //评查项模板的分类编码
                            String pcxflBm1 = pcxfl_mb1.getPcxflBm();
                            //根据子模板，查所有的评查项模板
                            List<ExcelModel> getpcxmb = excelParser.getpcxmb(collecitonName, data, pcxmc);
                            if (!CollectionUtils.isEmpty(getpcxmb)){
                                getpcxmb.stream().forEach(pcx->{
                                    pcx.setPcnr(pcx.getZlbz());
                                    excelWrite.writePcxmb(pcx,pclbBm,pcxflBm1);
                                });
                            }
                        }
                );
            }
            //获取该类别下，所有的评查项分类。
            List<ExcelModel> pcxmb = excelParser.getPcxmb(collecitonName, data);
            if (!CollectionUtils.isEmpty(pcxmb)){
                pcxmb.stream().forEach(pcx->{
                    excelWrite.writePcxmb(pcx,pclbBm,pcxflBm);
                });
            }
        });
    }

}
