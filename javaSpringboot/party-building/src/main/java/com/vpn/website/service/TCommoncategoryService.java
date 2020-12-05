package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TCommoncategoryDTO;
import com.vpn.website.client.model.TCommoncategory;
import com.vpn.website.client.query.TCommoncategoryQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @author fml
 * @date 2020/8/16 18:56
 */
public interface TCommoncategoryService extends IService<TCommoncategory> {
    PageBean<TCommoncategoryDTO> listPage(TCommoncategoryQuery query);
}
