package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.model.TAttractinvestment;

import java.util.List;

/**
 * <p>
 * 委托招商信息表 服务类
 * </p>
 *
 * @author fml
 * @since 2020-08-18
 */
public interface TAttractinvestmentService extends IService<TAttractinvestment> {
    List<TAttractinvestment> getTargetOrganizations();

}
