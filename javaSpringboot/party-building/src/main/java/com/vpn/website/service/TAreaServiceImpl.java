package com.vpn.website.service;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TAreaDTO;
import com.vpn.website.client.mapper.TAreaMapper;
import com.vpn.website.client.mapstruct.TAreaMap;
import com.vpn.website.client.model.TArea;
import com.vpn.website.client.query.TAreaQuery;

import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/18 14:51
 */
@Service
public class TAreaServiceImpl extends ServiceImpl<TAreaMapper, TArea> implements TAreaService {

    @Autowired
    private TAreaMap tAreaMap;

    @Autowired
    TAreaMapper tAreaMapper;

    @Override
    public PageBean<TAreaDTO> listPage(TAreaQuery query) {
        Page<TArea> page = tAreaMapper.selectPage(query.buildPage(), query.buildQuery());
        System.out.println("========query.pageSize======"+query.pageSize);
        PageBean<TAreaDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tAreaMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }

    @Override
    public List<TArea> getName() {
        return tAreaMapper.getName();
    }
}
