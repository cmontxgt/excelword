package swx.excel.dao.lxt;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import swx.excel.domain.PCXFL_MB;
import swx.excel.domain.PCXFL_MBExample;

import java.util.List;
@Repository
public interface OldXT_PCXFL_MBOldMapper {
    long countByExample(PCXFL_MBExample example);

    int deleteByExample(PCXFL_MBExample example);

    int deleteByPrimaryKey(String pcxflBm);

    int insert(PCXFL_MB record);

    int insertSelective(PCXFL_MB record);

    List<PCXFL_MB> selectByExample(PCXFL_MBExample example);

    PCXFL_MB selectByPrimaryKey(String pcxflBm);

    int updateByExampleSelective(@Param("record") PCXFL_MB record, @Param("example") PCXFL_MBExample example);

    int updateByExample(@Param("record") PCXFL_MB record, @Param("example") PCXFL_MBExample example);

    int updateByPrimaryKeySelective(PCXFL_MB record);

    int updateByPrimaryKey(PCXFL_MB record);
}