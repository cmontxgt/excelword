package swx.excel.dao.lxt;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import swx.excel.domain.XT_PC_LBPZB_MB;
import swx.excel.domain.XT_PC_LBPZB_MBExample;

import java.util.List;
@Repository
public interface XT_PC_LBPZB_MBMapper {
    long countByExample(XT_PC_LBPZB_MBExample example);

    int deleteByExample(XT_PC_LBPZB_MBExample example);

    int deleteByPrimaryKey(String pclbBm);

    int insert(XT_PC_LBPZB_MB record);

    int insertSelective(XT_PC_LBPZB_MB record);

    List<XT_PC_LBPZB_MB> selectByExampleWithBLOBs(XT_PC_LBPZB_MBExample example);

    List<XT_PC_LBPZB_MB> selectByExample(XT_PC_LBPZB_MBExample example);

    XT_PC_LBPZB_MB selectByPrimaryKey(String pclbBm);

    int updateByExampleSelective(@Param("record") XT_PC_LBPZB_MB record, @Param("example") XT_PC_LBPZB_MBExample example);

    int updateByExampleWithBLOBs(@Param("record") XT_PC_LBPZB_MB record, @Param("example") XT_PC_LBPZB_MBExample example);

    int updateByExample(@Param("record") XT_PC_LBPZB_MB record, @Param("example") XT_PC_LBPZB_MBExample example);

    int updateByPrimaryKeySelective(XT_PC_LBPZB_MB record);

    int updateByPrimaryKeyWithBLOBs(XT_PC_LBPZB_MB record);

    int updateByPrimaryKey(XT_PC_LBPZB_MB record);
}