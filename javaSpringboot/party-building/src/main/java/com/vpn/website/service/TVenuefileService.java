package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TVenuefileDTO;
import com.vpn.website.client.model.TVenuefile;
import com.vpn.website.client.query.TVenuefileQuery;
import com.vpn.website.common.base.PageBean;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 9:47
 */
public interface TVenuefileService extends IService<TVenuefile> {
    PageBean<TVenuefileDTO> listPage(TVenuefileQuery query);
}
