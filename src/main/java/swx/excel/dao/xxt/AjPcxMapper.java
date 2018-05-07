package swx.excel.dao.xxt;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import swx.excel.domain.AjpcPcx;
import swx.excel.domain.AjpcPcxExample;

import java.util.List;
@Repository
public interface AjPcxMapper {
    long countByExample(AjpcPcxExample example);

    int deleteByExample(AjpcPcxExample example);

    int deleteByPrimaryKey(String pcxbm);

    int insert(AjpcPcx record);

    int insertSelective(AjpcPcx record);

    List<AjpcPcx> selectByExample(AjpcPcxExample example);

    AjpcPcx selectByPrimaryKey(String pcxbm);

    int updateByExampleSelective(@Param("record") AjpcPcx record, @Param("example") AjpcPcxExample example);

    int updateByExample(@Param("record") AjpcPcx record, @Param("example") AjpcPcxExample example);

    int updateByPrimaryKeySelective(AjpcPcx record);

    int updateByPrimaryKey(AjpcPcx record);
}