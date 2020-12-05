package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TSetupDTO;
import com.vpn.website.client.mapper.TSetupMapper;
import com.vpn.website.client.mapstruct.TSetupMap;
import com.vpn.website.client.model.TSetup;
import com.vpn.website.client.query.TSetupQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/16 18:59
 */
@Service
public class TSetupServiceImpl extends ServiceImpl<TSetupMapper, TSetup> implements TSetupService {
    @Autowired
    private TSetupMap tSetupMap;

   /* @Autowired
    TSetupMapper tSetupMapper;*/

    @Override
    public PageBean<TSetupDTO> listPage(TSetupQuery query) {

        Page<TSetup> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TSetupDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tSetupMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
