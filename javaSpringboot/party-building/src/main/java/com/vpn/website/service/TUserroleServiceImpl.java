package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TUserRoleDTO;
import com.vpn.website.client.mapper.TUserroleMapper;
import com.vpn.website.client.mapstruct.TUserroleMap;
import com.vpn.website.client.model.TUserrole;
import com.vpn.website.client.query.TUserroleQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/16 19:00
 */
@Service
public class TUserroleServiceImpl extends ServiceImpl<TUserroleMapper, TUserrole> implements TUserroleService {
    @Autowired
    private TUserroleMap tUserroleMap;

    /*@Autowired
    TUserroleMapper tUserroleMapper;*/

    @Override
    public PageBean<TUserRoleDTO> listPage(TUserroleQuery query) {

        Page<TUserrole> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TUserRoleDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tUserroleMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
