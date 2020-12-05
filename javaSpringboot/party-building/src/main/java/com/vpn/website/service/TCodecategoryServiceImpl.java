package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TCodecategoryDTO;
import com.vpn.website.client.mapper.TCodecategoryMapper;
import com.vpn.website.client.mapstruct.TCodecategoryMap;
import com.vpn.website.client.model.TCodecategory;
import com.vpn.website.client.query.TCodecategoryQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/16 18:56
 */
@Service
public class TCodecategoryServiceImpl extends ServiceImpl<TCodecategoryMapper, TCodecategory> implements TCodecategoryService {
    @Autowired
    private TCodecategoryMap tCodecategoryMap;

    /*@Autowired
    TCodecategoryMapper tCodecategoryMapper;*/

    @Override
    public PageBean<TCodecategoryDTO> listPage(TCodecategoryQuery query) {

        Page<TCodecategory> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TCodecategoryDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tCodecategoryMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
