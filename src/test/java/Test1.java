import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import swx.excel.excel.ExcelModel;
import swx.excel.utils.ExcelUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @caomin
 * @create 2017-12-25 15:08
 **/

public class Test1 {
    @Autowired
    ExcelUtils excelUtils;


    @org.junit.Test
    public  void  test() throws Exception {
        ArrayList<File> objects = new ArrayList<>();
        String path="d:/test";
        List<File> readfile = readfile(path, objects);
        System.out.println(readfile);
    }
    /**
     * 读取某个文件夹下的所有文件
     */
    public List<File> readfile(String filepath, List<File> result) throws  Exception {
        if (result==null){
            result=new ArrayList<>();
        }
        File file = new File(filepath);
        if (file.isFile()) {
            result.add(file);
        }else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                readfile(file1.getAbsolutePath(),result);
            }
        }
        return result;
    }

    @Test
    public void testJson(){

        String text="{\n" +
                "\"100000030190\":\"变更强制措施审批表\",\n" +
                "\"100000030252\":\"报请逮捕书\",\n" +
                "\"100000030179\":\"逮捕犯罪嫌疑人意见书\",\n" +
                "}";
        ExcelModel excelModel = new ExcelModel();
        excelModel.setWsbm(text);
        excelModel.setPcbz("监视居住或取保候审需要逮捕的，未制作《变更强制措施审批表》、《报请逮捕书》、《逮捕犯罪嫌疑人意见书》及相关审批表、审批表无承办人意见、领导审批意见及数字签名的");


        String pcbz = excelModel.getPcbz();
        String wsbm = excelModel.getWsbm();
        Object parse = JSON.parse(wsbm);
        if (parse instanceof JSONObject){
            JSONObject jsonObject= (JSONObject) parse;
            for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
                String wsmbmc = (String) entry.getValue();
                String wsmbSingle = getWsmbSingle(entry.getKey(), wsmbmc);
                if (wsmbSingle!=null){
                    pcbz=pcbz.replace("《"+wsmbmc+"》",wsmbSingle);
                }
            }
        }

        System.out.println(excelModel);

    }
    /**
     * 生成文书模板的A标签
     * @param key
     * @param value
     * @return
     */
    private String getWsmbSingle(String key,String value){
        if (StringUtils.isEmpty(key)||StringUtils.isEmpty(value)){
            return null;
        }
        String originHead="<a href=# class=pcws onclick=DOPC('{$OpenType$:$文书$,$MBBH$:$";
        StringBuffer result=new StringBuffer(originHead);
        result.append(key+"$}')>《").append(value).append("》</a>");
        return result.toString();
    }


    @Test
    public void test1(){

        String text="00000999999";
        Object parse = JSON.parse(text);
        System.out.println(parse);
    }
    @Test
    public void testSub(){
        String s = "3700000000000152010006";
        String substring = s.substring(s.length() - 4, s.length());
        System.out.println(substring);
    } @Test
    public void ConvertZdpccx(){
        String s = "3700000000000152010006";
        String substring = s.substring(s.length() - 4, s.length());
        System.out.println(substring);
    }

}
