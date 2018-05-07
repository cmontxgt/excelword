package swx.excel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swx.excel.convert.LxtConvertToNew;
import swx.excel.service.AjpcExcelService;
import swx.excel.utils.ExcelUtils;
import swx.excel.utils.PcxExcelParser;

/**
 * @author caomin
 * @date 2018/1/17
 * @说明 根据Excel生成表数据
 */@RestController
@RequestMapping("/GeneraPcxData")
public class GeneraPcxData {
    @Autowired
    ExcelUtils excelUtils;

    @Autowired
    PcxExcelParser pcxExcelParser;

    @Autowired
    AjpcExcelService ajpcExcelService;
    @Autowired
    private LxtConvertToNew lxtConvertToNew;

    public void  test() throws Exception {
        String path="L:\\余杭\\评查项模板\\余杭民事.xlsx";
        String path1="L:\\余杭\\评查项模板\\余杭刑事.xlsx";
        pcxExcelParser.parser(path);
        pcxExcelParser.parser(path1);

    }

    public void  test1() throws Exception {
        ajpcExcelService.writeDb("3700000030000001","刑事（新）.xlsx");
        ajpcExcelService.writeDb("3700000010000001","刑事（新）.xlsx");
        ajpcExcelService.writeDb("3700000020000001","刑事（新）.xlsx");


        ajpcExcelService.writeDb("3700000030000002","民事（新）.xlsx");
        ajpcExcelService.writeDb("3700000010000002","民事（新）.xlsx");
        ajpcExcelService.writeDb("3700000020000002","民事（新）.xlsx");

    }

    /**
     * 转换以下三个表数据
     *
     *  XT_PC_PCX;
        XT_PC_PCXFL;
        XT_PC_MB;
     */
    @RequestMapping("/testConvert")
    public void testConvert(){
        lxtConvertToNew.convert();
    }
}
