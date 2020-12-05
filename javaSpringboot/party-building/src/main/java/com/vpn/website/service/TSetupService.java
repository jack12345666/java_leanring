package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TSetupDTO;
import com.vpn.website.client.model.TSetup;
import com.vpn.website.client.query.TSetupQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @author fml
 * @date 2020/8/16 18:59
 */
public interface TSetupService extends IService<TSetup> {
    PageBean<TSetupDTO> listPage(TSetupQuery query);
}
