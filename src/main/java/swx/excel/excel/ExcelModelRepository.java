package swx.excel.excel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * excel Dao
 *
 * @caomin
 * @create 2017-12-25 14:30
 **/
@Repository
public class ExcelModelRepository {

    @Autowired
    MongoTemplate mongoTemplate;


    public void save(ExcelModel model,String collectionName){
        mongoTemplate.save(model,collectionName);
    }

}
