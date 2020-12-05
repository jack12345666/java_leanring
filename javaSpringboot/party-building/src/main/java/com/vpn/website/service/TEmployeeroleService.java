package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TEmployeeroleDTO;
import com.vpn.website.client.model.TEmployeerole;
import com.vpn.website.client.query.TEmployeeroleQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @author fml
 * @date 2020/8/16 18:57
 */
public interface TEmployeeroleService extends IService<TEmployeerole> {
    PageBean<TEmployeeroleDTO> listPage(TEmployeeroleQuery query);
}
