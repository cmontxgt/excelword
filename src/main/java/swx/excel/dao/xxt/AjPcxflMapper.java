package swx.excel.dao.xxt;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import swx.excel.domain.AjpcPcxfl;
import swx.excel.domain.AjpcPcxflExample;

import java.util.List;
@Repository
public interface AjPcxflMapper {
    long countByExample(AjpcPcxflExample example);

    int deleteByExample(AjpcPcxflExample example);

    int deleteByPrimaryKey(String pcxflbm);

    int insert(AjpcPcxfl record);

    int insertSelective(AjpcPcxfl record);

    List<AjpcPcxfl> selectByExample(AjpcPcxflExample example);

    AjpcPcxfl selectByPrimaryKey(String pcxflbm);

    int updateByExampleSelective(@Param("record") AjpcPcxfl record, @Param("example") AjpcPcxflExample example);

    int updateByExample(@Param("record") AjpcPcxfl record, @Param("example") AjpcPcxflExample example);

    int updateByPrimaryKeySelective(AjpcPcxfl record);

    int updateByPrimaryKey(AjpcPcxfl record);
}