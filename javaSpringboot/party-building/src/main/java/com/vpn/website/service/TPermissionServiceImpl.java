package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TPermissionDTO;
import com.vpn.website.client.mapper.TPermissionMapper;
import com.vpn.website.client.mapstruct.TPermissionMap;
import com.vpn.website.client.model.TPermission;
import com.vpn.website.client.query.TPermissionQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/16 18:57
 */
@Service
public class TPermissionServiceImpl extends ServiceImpl<TPermissionMapper, TPermission> implements TPermissionService {
    @Autowired
    private TPermissionMap tPermissionMap;

  /*  @Autowired
    TPermissionMapper tPermissionMapper;
*/
    @Override
    public PageBean<TPermissionDTO> listPage(TPermissionQuery query) {

        Page<TPermission> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TPermissionDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tPermissionMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
