package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TRolePermissionDTO;
import com.vpn.website.client.model.TRolepermission;
import com.vpn.website.client.query.TRolepermissionQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @author fml
 * @date 2020/8/16 18:58
 */
public interface TRolepermissionService extends IService<TRolepermission> {
    PageBean<TRolePermissionDTO> listPage(TRolepermissionQuery query);
}
