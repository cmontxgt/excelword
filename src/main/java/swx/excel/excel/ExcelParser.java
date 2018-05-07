package swx.excel.excel;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import swx.excel.utils.ExcelUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

/**
 * excel解析
 *
 * @caomin
 * @create 2017-12-26 9:24
 **/
@Component
public class ExcelParser {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    ExcelUtils excelUtils;


    /**
     * 获取pcx_mc 解析文书模板，手动自动评查内容
     * @param excelModel
     */
    public String  getPcxMc(ExcelModel excelModel){
        //首先解析wsmb
        parserWsmb(excelModel);

        //这里要区分手动评查和自动评查
        String result = parserSd(excelModel);
        return result;

    }




    /**
     * 解析手动评查
     * @return
     */
    private String parserSd(ExcelModel excelModel){

        String origin="<a href=# class=pcsdpc onclick=DOPC('{$OpenType$:$手动评查$,$PCXFZ$:";
        String kfz = excelModel.getKfz();

        if (!StringUtils.isEmpty(kfz)){
            kfz="$"+kfz+"$";
        }else {
            kfz="$"+0.0+"$";
        }
        String pcly=",$PCLY$:";
        String zlbz = excelModel.getZlbz();
        if (!StringUtils.isEmpty(zlbz)){
            zlbz="$"+zlbz+"$";
        }else {
            zlbz="$$";
        }
        String pcxbh=",$PCXBH$:$0003$}')>";
        String ccwb=excelModel.getPcbz()+excelModel.getPcnr();
        String end="</a>";
        String result = origin + kfz + pcly + zlbz + pcxbh + ccwb+end;
        return result;
    }

    /**
     * 解析自动评查
     * @param excelModel
     * @return
     */
    private String parserZd(ExcelModel excelModel){

        String origin="<span class=pczdpc>自动评查项文本</span>";

        String pcnr = excelModel.getPcnr();
        String pcbz = excelModel.getPcbz();
        String result = origin.replace("自动评查项文本", pcnr + pcbz);

        return result;
    }

    /**
     * 解析文书模板内容
     * @param
     * @return
     */
    private void parserWsmb(ExcelModel excelModel){
        String pcbz = excelModel.getPcbz();
        String wsbm = excelModel.getWsbm();
        Object parse = JSON.parse(wsbm);
        if (parse instanceof JSONObject){
            JSONObject jsonObject= (JSONObject) parse;
            for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
                String wsmbmc = (String) entry.getValue();
                String wsmbSingle = getWsmbSingle(entry.getKey(), wsmbmc);
                if (wsmbSingle!=null){
                    pcbz.replace("《"+wsmbmc+"》",wsmbSingle);
                }
            }
        }
        excelModel.setPcbz(pcbz);
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

    /**
     * 获取类别配置模板表
     * @param
     * @return
     * @throws Exception
     */
    public String getpcxpzbmb(String collectionName) throws Exception {
        Query query = new Query().addCriteria(Criteria.where("评查类别").is("lbpzb"));
        ExcelModel one = mongoTemplate.findOne(query, ExcelModel.class,collectionName);
        return one.getPcnr();
    }


    /**
     * 获取一级评查分类模板
     * @param collectionName
     * @return
     */
    public List<String> getPcflmbList(String collectionName){
        ArrayList<String> result = new ArrayList<>();
        Aggregation agg = newAggregation(
                //设置分组字段
                group("评查类别")
                        .count().as("count")//增加COUNT为分组后输出的字段
                        .last("评查内容").as("评查内容")
                        .last("评查类别").as("评查类别")
                        ,
                project("评查内容","评查类别")//重新挑选字段

        );
        AggregationResults<ExcelModel> excelModel = mongoTemplate.aggregate(agg, collectionName, ExcelModel.class);
        for (ExcelModel model : excelModel) {
            result.add(model.getPclb());
        }

        return result;
    }


    /**
     * 评查类别为 pcxfl_mb表记录，根据评查类别。查找子模板分类
     * @param pclb 评查类别名称
     * @return
     */
    public List<ExcelModel> getpcxflmb(String collectionName, String pclb){

        ArrayList<ExcelModel> result = new ArrayList<>();
        Aggregation agg = newAggregation(
                project("评查类别","评查内容")
                //增加publishDate为分组后输出的字段
               , //设置分组字段
                group("评查类别","评查内容")
                        .count().as("count")
               .last("评查类别").as("评查类别")
               .last("评查内容").as("评查内容"),
                match(
                        Criteria.where("count").gte(2)
                ),
                match(
                        Criteria.where("评查类别").is(pclb)
                ),
                project("评查类别","评查内容")//重新挑选字段
        );
        return getResultExcelModels(result, agg,collectionName);

    }


    /**
     * 根据 评查子分类模板，获取所有的评查项模板
     * @param collecitonName
     * @param flbmName
     * @return
     */
    public List<ExcelModel>getpcxmb(String collecitonName,String pclb,String flbmName){
        ArrayList<ExcelModel> result = new ArrayList<>();
        Aggregation agg = newAggregation(
                project("评查类别","评查内容"),
                match(
                        Criteria.where("评查内容").is(flbmName)
                ),
                match(
                        Criteria.where("评查类别").is(pclb)
                )
        );
        return getResultExcelModels(result, agg,collecitonName);
    }

    /**
     * 没有 子评查项分类模板，直接获取所有评查项模板
     * @return
     */
    public List<ExcelModel> getPcxmb(String collectionName,String pclb){

        ArrayList<ExcelModel> result = new ArrayList<>();
        Aggregation agg = newAggregation(
                project("评查类别","评查内容"),
                match(
                        Criteria.where("评查类别").is(pclb)
                )
        );
        return getResultExcelModels(result, agg,collectionName);

    }

    /**
     * 获取完整记录
     * @param result
     * @param agg
     * @return
     */
    private List<ExcelModel> getResultExcelModels(ArrayList<ExcelModel> result, Aggregation agg,String collectionName) {
        AggregationResults<ExcelModel> excelModel = mongoTemplate.aggregate(agg, collectionName, ExcelModel.class);
        List<ExcelModel> mappedResults = excelModel.getMappedResults();
        for (int i = 0; i < mappedResults.size(); i++) {
            ExcelModel map = mappedResults.get(i);
            Query query = new Query().addCriteria(Criteria.where("评查类别").is(map.getPclb())).addCriteria(Criteria.where("评查内容").is(map.getPcnr()));
            ExcelModel one = mongoTemplate.findOne(query, ExcelModel.class,collectionName);
            String cwdj = one.getCwdj();
            if (!StringUtils.isEmpty(cwdj)){
                one.setCwdj(cwdj.replace(".0","")+"级错误");
            }
            result.add(one);

        }
        return result;
    }




}
