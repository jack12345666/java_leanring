package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.mapper.TAttractinvestmentMapper;
import com.vpn.website.client.model.TAttractinvestment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 委托招商信息表 服务实现类
 * </p>
 *
 * @author fml
 * @since 2020-08-18
 */
@Service
public class TAttractinvestmentServiceImpl extends ServiceImpl<TAttractinvestmentMapper, TAttractinvestment> implements TAttractinvestmentService {
    @Autowired
    TAttractinvestmentMapper tAttractinvestmentMapper;

    @Override
    public List<TAttractinvestment> getTargetOrganizations() {
        return tAttractinvestmentMapper.getTargetOrganizations();
    }
}
