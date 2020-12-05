package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TRoleDTO;
import com.vpn.website.client.model.TRole;
import com.vpn.website.client.query.TRoleQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @author fml
 * @date 2020/8/16 18:58
 */
public interface TRoleService extends IService<TRole> {
    PageBean<TRoleDTO> listPage(TRoleQuery query);
}
