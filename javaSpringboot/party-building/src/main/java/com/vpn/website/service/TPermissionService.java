package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TPermissionDTO;
import com.vpn.website.client.model.TPermission;
import com.vpn.website.client.query.TPermissionQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @author fml
 * @date 2020/8/16 18:57
 */
public interface TPermissionService extends IService<TPermission> {
    PageBean<TPermissionDTO> listPage(TPermissionQuery query);
}
