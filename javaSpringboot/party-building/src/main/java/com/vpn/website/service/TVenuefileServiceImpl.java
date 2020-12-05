package com.vpn.website.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TVenuefileDTO;
import com.vpn.website.client.mapper.TVenuefileMapper;
import com.vpn.website.client.mapstruct.TVenuefileMap;
import com.vpn.website.client.model.TVenuefile;
import com.vpn.website.client.query.TVenuefileQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 9:47
 */
@Service
public class TVenuefileServiceImpl extends ServiceImpl<TVenuefileMapper, TVenuefile> implements TVenuefileService {

    @Autowired
    private TVenuefileMap tVenuefileMap;

    @Autowired
    TVenuefileMapper tVenuefileMapper;

    @Override
    public PageBean<TVenuefileDTO> listPage(TVenuefileQuery query) {

        Page<TVenuefile> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TVenuefileDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tVenuefileMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
