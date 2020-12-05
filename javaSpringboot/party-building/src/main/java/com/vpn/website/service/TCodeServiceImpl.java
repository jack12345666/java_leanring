package com.vpn.website.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TCodeDTO;
import com.vpn.website.client.mapper.TCodeMapper;
import com.vpn.website.client.mapstruct.TCodeMap;
import com.vpn.website.client.model.TCode;
import com.vpn.website.client.query.TCodeQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/16 18:55
 */
@Service
public class TCodeServiceImpl extends ServiceImpl<TCodeMapper, TCode> implements TCodeService {
    @Autowired
    private TCodeMap tCodeMap;

    /*@Autowired
    TCodeMapper tCodeMapper;*/

    @Override
    public PageBean<TCodeDTO> listPage(TCodeQuery query) {

        Page<TCode> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TCodeDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tCodeMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
