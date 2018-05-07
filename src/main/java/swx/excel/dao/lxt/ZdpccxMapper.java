package swx.excel.dao.lxt;

import org.apache.ibatis.annotations.Param;
import swx.excel.domain.Zdpccx;
import swx.excel.domain.ZdpccxExample;
import swx.excel.domain.ZdpccxKey;

import java.util.List;

public interface ZdpccxMapper {
    long countByExample(ZdpccxExample example);

    int deleteByExample(ZdpccxExample example);

    int deleteByPrimaryKey(ZdpccxKey key);

    int insert(Zdpccx record);

    int insertSelective(Zdpccx record);

    List<Zdpccx> selectByExample(ZdpccxExample example);

    Zdpccx selectByPrimaryKey(ZdpccxKey key);

    int updateByExampleSelective(@Param("record") Zdpccx record, @Param("example") ZdpccxExample example);

    int updateByExample(@Param("record") Zdpccx record, @Param("example") ZdpccxExample example);

    int updateByPrimaryKeySelective(Zdpccx record);

    int updateByPrimaryKey(Zdpccx record);
}