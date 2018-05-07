import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import swx.excel.App;
import swx.excel.convert.ConvertZdpccx;
import swx.excel.convert.LxtConvertToNew;
import swx.excel.service.AjpcExcelService;
import swx.excel.service.ExcelService;
import swx.excel.utils.ExcelUtils;
import swx.excel.utils.PcxExcelParser;

/**
 * @caomin
 * @create 2017-12-25 15:08
 **/
@WebAppConfiguration
@SpringBootTest(classes = App.class)
@RunWith(value= SpringJUnit4ClassRunner.class)
public class Test {
    @Autowired
    ExcelUtils excelUtils;

    @Autowired
    PcxExcelParser pcxExcelParser;

    @Autowired
    AjpcExcelService ajpcExcelService;

    @Autowired
    LxtConvertToNew lxtConvertToNew;

    @Autowired
    ConvertZdpccx convertZdpccx;
    @Autowired
    private ExcelService excelService;





    @org.junit.Test
    public void  test() throws Exception {
        String path="L:\\余杭\\评查项模板\\余杭民事.xlsx";
        String path1="L:\\余杭\\评查项模板\\余杭刑事.xlsx";
        pcxExcelParser.parser(path);
        pcxExcelParser.parser(path1);

    }
    @org.junit.Test
    public void  test1() throws Exception {
        ajpcExcelService.writeDb("3700000020000001","余杭民事.xlsx");
        ajpcExcelService.writeDb("3700000020000002","余杭民事.xlsx");
        ajpcExcelService.writeDb("3700000030000001","余杭民事.xlsx");
        ajpcExcelService.writeDb("3700000010000001","余杭刑事.xlsx");
        ajpcExcelService.writeDb("3700000010000002","余杭刑事.xlsx");
        ajpcExcelService.writeDb("3700000030000002","余杭刑事.xlsx");
    }

    /**
     * 类别配置表模板
     */
    @org.junit.Test
    public void testConvert(){
        lxtConvertToNew.convert();
    }








    @org.junit.Test
    public void ConvertZdpccx(){
        convertZdpccx.convert();
    }





}
