package swx.excel.dao.lxt;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import swx.excel.domain.PCX_MB;
import swx.excel.domain.PCX_MBExample;

import java.util.List;
@Repository
public interface OldPCX_MBOldMapper {
    long countByExample(PCX_MBExample example);

    int deleteByExample(PCX_MBExample example);

    int deleteByPrimaryKey(String pcxBm);

    int insert(PCX_MB record);

    int insertSelective(PCX_MB record);

    List<PCX_MB> selectByExample(PCX_MBExample example);

    PCX_MB selectByPrimaryKey(String pcxBm);

    int updateByExampleSelective(@Param("record") PCX_MB record, @Param("example") PCX_MBExample example);

    int updateByExample(@Param("record") PCX_MB record, @Param("example") PCX_MBExample example);

    int updateByPrimaryKeySelective(PCX_MB record);

    int updateByPrimaryKey(PCX_MB record);
}