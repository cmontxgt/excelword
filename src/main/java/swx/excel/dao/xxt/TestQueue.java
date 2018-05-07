package swx.excel.dao.xxt;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import swx.excel.App;
import swx.excel.convert.ConvertZdpccx;
import swx.excel.convert.LxtConvertToNew;
import swx.excel.service.AjpcExcelService;
import swx.excel.utils.ExcelUtils;
import swx.excel.utils.PcxExcelParser;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @caomin
 * @create 2017-12-25 15:08
 **/
public class TestQueue {


    @org.junit.Test
    public void ConvertZdpccx() {

        Queue queue1=new ArrayDeque();
        Queue queue2=new ArrayDeque();
        queue1.add(1);
        queue1.add(2);
        queue1.add(4);
       while (queue1.size()>1){
           queue2.add(queue1.poll());
       }
        System.out.println(queue1.poll());



    }





}
