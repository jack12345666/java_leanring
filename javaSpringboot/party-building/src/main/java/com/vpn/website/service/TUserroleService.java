package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TUserRoleDTO;
import com.vpn.website.client.model.TUserrole;
import com.vpn.website.client.query.TUserroleQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @author fml
 * @date 2020/8/16 18:59
 */
public interface TUserroleService extends IService<TUserrole> {
    PageBean<TUserRoleDTO> listPage(TUserroleQuery query);
}
