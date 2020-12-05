package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TVenuelogDTO;
import com.vpn.website.client.model.TVenuelog;
import com.vpn.website.client.query.TVenuelogQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 14:12
 */
public interface TVenuelogService extends IService<TVenuelog> {
    PageBean<TVenuelogDTO> listPage(TVenuelogQuery query);
}
