package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TEmployeeDTO;
import com.vpn.website.client.model.TEmployee;
import com.vpn.website.client.query.TEmployeeQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @author fml
 * @date 2020/8/16 18:57
 */
public interface TEmployeeService extends IService<TEmployee> {
    PageBean<TEmployeeDTO> listPage(TEmployeeQuery query);
}
