package swx.excel.convert;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import swx.excel.dao.lxt.ZdpccxMapper;
import swx.excel.dao.xxt.AjpcZdpccxMapper;
import swx.excel.domain.AjpcZdpccx;
import swx.excel.domain.Zdpccx;
import swx.excel.domain.ZdpccxExample;

import java.util.List;

/**
 * @author caomin
 * @date 2018/1/17
 * @说明 转换自动评查程序
 */
@Component
public class ConvertZdpccx {

    @Autowired
    AjpcZdpccxMapper ajpcZdpccxMapper;

    @Autowired
    ZdpccxMapper zdpccxMapper;


    /**
     * 转换 自动评查表
     */
    public  void  convert(){
        ZdpccxExample ajpcZdpccxExample = new ZdpccxExample();
        ajpcZdpccxExample.createCriteria().andZdpcCxmcLike("%重庆%");
        List<Zdpccx> ajpcZdpccxes = zdpccxMapper.selectByExample(ajpcZdpccxExample);
        ajpcZdpccxes.stream().forEach(data->{
            AjpcZdpccx ajpcZdpccx = new AjpcZdpccx();
            BeanUtils.copyProperties(data,ajpcZdpccx);
            ajpcZdpccx.setSm(data.getZdpcCxsm());
            ajpcZdpccxMapper.insertSelective(ajpcZdpccx);
        });
    }


}
