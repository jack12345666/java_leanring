package com.vpn.website.client.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vpn.website.client.dto.TAreaDTO;
import com.vpn.website.client.model.TArea;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
/**
 * @Author: fengmingliang
 * @Date: 2020/8/18 14:49
 */
@Mapper
public interface TAreaMapper extends BaseMapper<TArea> {

    List<TArea> getName();
}
