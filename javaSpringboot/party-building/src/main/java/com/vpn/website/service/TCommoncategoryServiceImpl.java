package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TCommoncategoryDTO;
import com.vpn.website.client.mapper.TCommoncategoryMapper;
import com.vpn.website.client.mapstruct.TCommoncategoryMap;
import com.vpn.website.client.model.TCommoncategory;
import com.vpn.website.client.query.TCommoncategoryQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/16 18:56
 */
@Service
public class TCommoncategoryServiceImpl extends ServiceImpl<TCommoncategoryMapper, TCommoncategory> implements TCommoncategoryService {
    @Autowired
    private TCommoncategoryMap tCommoncategoryMap;

    /*@Autowired
    TCommoncategoryMapper tCommoncategoryMapper;*/

    @Override
    public PageBean<TCommoncategoryDTO> listPage(TCommoncategoryQuery query) {

        Page<TCommoncategory> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TCommoncategoryDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tCommoncategoryMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
