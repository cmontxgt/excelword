package swx.excel.utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import swx.excel.pojo.PcxflVo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 评查项分类及评查项配置
 *
 * @caomin
 * @create 2018-01-12 9:41
 **/
@Component
public class PcxExcelParser {


    @Autowired
    ExcelUtils excelUtils;

    @Autowired
    MongoTemplate mongoTemplate;


    public void  parser (String path) throws  Exception {
        File file = new File(path);
        Workbook wb = WorkbookFactory.create(file);
        int sheetCount = wb.getNumberOfSheets();
        for (int i = 0; i < sheetCount; i++) {
            int lastRowNum = wb.getSheetAt(i).getLastRowNum();
            ArrayList<PcxflVo>  list= excelUtils.readPcxExcel(wb, i, 0, lastRowNum);
            for (PcxflVo o : list) {
                mongoTemplate.save(o,file.getName());
            }

        }



    }




}
