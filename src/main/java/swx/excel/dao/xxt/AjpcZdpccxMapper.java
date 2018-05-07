package swx.excel.dao.xxt;

import org.apache.ibatis.annotations.Param;
import swx.excel.domain.AjpcZdpccx;
import swx.excel.domain.AjpcZdpccxExample;

import java.util.List;

public interface AjpcZdpccxMapper {
    long countByExample(AjpcZdpccxExample example);

    int deleteByExample(AjpcZdpccxExample example);

    int deleteByPrimaryKey(String zdpcCxbm);

    int insert(AjpcZdpccx record);

    int insertSelective(AjpcZdpccx record);

    List<AjpcZdpccx> selectByExample(AjpcZdpccxExample example);

    AjpcZdpccx selectByPrimaryKey(String zdpcCxbm);

    int updateByExampleSelective(@Param("record") AjpcZdpccx record, @Param("example") AjpcZdpccxExample example);

    int updateByExample(@Param("record") AjpcZdpccx record, @Param("example") AjpcZdpccxExample example);

    int updateByPrimaryKeySelective(AjpcZdpccx record);

    int updateByPrimaryKey(AjpcZdpccx record);
}