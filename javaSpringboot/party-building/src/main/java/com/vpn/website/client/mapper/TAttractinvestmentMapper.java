package com.vpn.website.client.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vpn.website.client.model.TAttractinvestment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 委托招商信息表 Mapper 接口
 * </p>
 *
 * @author fml
 * @since 2020-08-18
 */
@Mapper
public interface TAttractinvestmentMapper extends BaseMapper<TAttractinvestment> {
    List<TAttractinvestment> getTargetOrganizations();
}
