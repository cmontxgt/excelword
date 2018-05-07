package swx.excel.dao.xxt;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import swx.excel.domain.AjXtPcMb;
import swx.excel.domain.AjXtPcMbExample;

import java.util.List;
@Repository
public interface AjXtPcMbMapper {
    long countByExample(AjXtPcMbExample example);

    int deleteByExample(AjXtPcMbExample example);

    int deleteByPrimaryKey(String pcmbbm);

    int insert(AjXtPcMb record);

    int insertSelective(AjXtPcMb record);

    List<AjXtPcMb> selectByExampleWithBLOBs(AjXtPcMbExample example);

    List<AjXtPcMb> selectByExample(AjXtPcMbExample example);

    AjXtPcMb selectByPrimaryKey(String pcmbbm);

    int updateByExampleSelective(@Param("record") AjXtPcMb record, @Param("example") AjXtPcMbExample example);

    int updateByExampleWithBLOBs(@Param("record") AjXtPcMb record, @Param("example") AjXtPcMbExample example);

    int updateByExample(@Param("record") AjXtPcMb record, @Param("example") AjXtPcMbExample example);

    int updateByPrimaryKeySelective(AjXtPcMb record);

    int updateByPrimaryKeyWithBLOBs(AjXtPcMb record);

    int updateByPrimaryKey(AjXtPcMb record);
}