package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TCodeDTO;
import com.vpn.website.client.model.TCode;
import com.vpn.website.client.query.TCodeQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @author fml
 * @date 2020/8/16 18:55
 */
public interface TCodeService extends IService<TCode> {
    PageBean<TCodeDTO> listPage(TCodeQuery query);
}
