package swx.excel.dao.lxt;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import swx.excel.domain.LBPZB_MB;
import swx.excel.domain.LBPZB_MBExample;

import java.util.List;

@Repository
public interface OldLBPZB_MBMOldapper {
    long countByExample(LBPZB_MBExample example);

    int deleteByExample(LBPZB_MBExample example);

    int deleteByPrimaryKey(String pclbBm);

    int insert(LBPZB_MB record);

    int insertSelective(LBPZB_MB record);

    List<LBPZB_MB> selectByExampleWithBLOBs(LBPZB_MBExample example);

    List<LBPZB_MB> selectByExample(LBPZB_MBExample example);

    LBPZB_MB selectByPrimaryKey(String pclbBm);

    int updateByExampleSelective(@Param("record") LBPZB_MB record, @Param("example") LBPZB_MBExample example);

    int updateByExampleWithBLOBs(@Param("record") LBPZB_MB record, @Param("example") LBPZB_MBExample example);

    int updateByExample(@Param("record") LBPZB_MB record, @Param("example") LBPZB_MBExample example);

    int updateByPrimaryKeySelective(LBPZB_MB record);

    int updateByPrimaryKeyWithBLOBs(LBPZB_MB record);

    int updateByPrimaryKey(LBPZB_MB record);
}