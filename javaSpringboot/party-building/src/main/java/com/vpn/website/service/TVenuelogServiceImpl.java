package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TVenuelogDTO;
import com.vpn.website.client.mapper.TVenuelogMapper;
import com.vpn.website.client.mapstruct.TVenuelogMap;
import com.vpn.website.client.model.TVenuelog;
import com.vpn.website.client.query.TVenuelogQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 14:14
 */
@Service
public class TVenuelogServiceImpl extends ServiceImpl<TVenuelogMapper, TVenuelog> implements TVenuelogService  {
    @Autowired
    private TVenuelogMap tVenuelogMap;

    @Autowired
    TVenuelogMapper tVenuelogMapper;

    @Override
    public PageBean<TVenuelogDTO> listPage(TVenuelogQuery query) {

        Page<TVenuelog> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TVenuelogDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tVenuelogMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
