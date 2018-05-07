package swx.excel.dao.word;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import swx.excel.pojo.WordDto;

import java.util.List;

@Repository
public interface QueryMapper {
    /**
     * 获取某个用户的表 ,
     * @param userName
     * @return
     */
    List<String> getTables(@Param("user") String userName);

    /**
     * 根据表名，获取字段相关的信息。表名大写
     * @param tableName
     * @return
     */

    List<WordDto>getWordList(@Param("tableName")String tableName,@Param("user") String user);



    List<WordDto>getColumns(@Param("tableName")String tableName);
    List<String>getColumnsbz(@Param("tableName")String tableName);

}