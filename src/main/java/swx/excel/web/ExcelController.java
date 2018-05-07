package swx.excel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swx.excel.excel.ExcelParser;
import swx.excel.utils.ExcelUtils;
import swx.excel.excel.ExcelWrite;
import swx.excel.service.ExcelService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @caomin
 * @create 2017-12-25 15:16
 **/
@RestController
@RequestMapping("/excel")
public class ExcelController implements RejectedExecutionHandler{
    @Autowired
    ExcelWrite excelWrite;

    @Autowired
    ExcelUtils excelUtils;

    @Autowired
    ExcelParser excelParser;

    @Autowired
    ExcelService excelService;


    @RequestMapping("/test")
    public void  setExcelUtils() throws Exception {
        ArrayList<File> files = new ArrayList<>();
        String path="L:\\test\\";
        //解析文件
        excelUtils.readfile(path, files);
        //将结果写入MongoDb
        List<String> collectionNames = excelUtils.readExcelToObj(files);

        //往表里面写数据
        if (!CollectionUtils.isEmpty(collectionNames)){
            for (String collectionName : collectionNames) {
                excelService.write(collectionName,"001");
            }
        }
    }

    @RequestMapping("/write")
    public  void write() throws Exception {

    }


    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

    }
}
