package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TRoleDTO;
import com.vpn.website.client.mapper.TRoleMapper;
import com.vpn.website.client.mapstruct.TRoleMap;
import com.vpn.website.client.model.TRole;
import com.vpn.website.client.query.TRoleQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/16 18:58
 */
@Service
public class TRoleServiceImpl extends ServiceImpl<TRoleMapper, TRole> implements TRoleService {
    @Autowired
    private TRoleMap tRoleMap;

  /*  @Autowired
    TRoleMapper tRoleMapper;*/

    @Override
    public PageBean<TRoleDTO> listPage(TRoleQuery query) {

        Page<TRole> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TRoleDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tRoleMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
