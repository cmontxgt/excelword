package swx.excel.dao.lxt;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import swx.excel.domain.XT_PC_PCXFL_MB;
import swx.excel.domain.XT_PC_PCXFL_MBExample;

import java.util.List;
@Repository
public interface XT_PC_PCXFL_MBMapper {
    long countByExample(XT_PC_PCXFL_MBExample example);

    int deleteByExample(XT_PC_PCXFL_MBExample example);

    int deleteByPrimaryKey(String pcxflBm);

    int insert(XT_PC_PCXFL_MB record);

    int insertSelective(XT_PC_PCXFL_MB record);

    List<XT_PC_PCXFL_MB> selectByExample(XT_PC_PCXFL_MBExample example);

    XT_PC_PCXFL_MB selectByPrimaryKey(String pcxflBm);

    int updateByExampleSelective(@Param("record") XT_PC_PCXFL_MB record, @Param("example") XT_PC_PCXFL_MBExample example);

    int updateByExample(@Param("record") XT_PC_PCXFL_MB record, @Param("example") XT_PC_PCXFL_MBExample example);

    int updateByPrimaryKeySelective(XT_PC_PCXFL_MB record);

    int updateByPrimaryKey(XT_PC_PCXFL_MB record);
}