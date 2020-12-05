package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TUserDTO;
import com.vpn.website.client.model.TUser;
import com.vpn.website.client.query.TUserQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @author fml
 * @date 2020/8/16 18:59
 */
public interface TUserService extends IService<TUser> {
    PageBean<TUserDTO> listPage(TUserQuery query);
}
