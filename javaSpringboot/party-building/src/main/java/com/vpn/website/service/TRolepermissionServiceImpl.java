package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TRolePermissionDTO;
import com.vpn.website.client.mapper.TRolepermissionMapper;
import com.vpn.website.client.mapstruct.TRolepermissionMap;
import com.vpn.website.client.model.TRolepermission;
import com.vpn.website.client.query.TRolepermissionQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/16 18:58
 */
@Service
public class TRolepermissionServiceImpl extends ServiceImpl<TRolepermissionMapper, TRolepermission> implements TRolepermissionService {
    @Autowired
    private TRolepermissionMap tRolepermissionMap;

    /*@Autowired
    TRolepermissionMapper tRolepermissionMapper;*/

    @Override
    public PageBean<TRolePermissionDTO> listPage(TRolepermissionQuery query) {

        Page<TRolepermission> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TRolePermissionDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tRolepermissionMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
