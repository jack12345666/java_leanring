package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TCodecategoryDTO;
import com.vpn.website.client.model.TCodecategory;
import com.vpn.website.client.query.TCodecategoryQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @author fml
 * @date 2020/8/16 18:56
 */
public interface TCodecategoryService extends IService<TCodecategory> {
    PageBean<TCodecategoryDTO> listPage(TCodecategoryQuery query);
}
