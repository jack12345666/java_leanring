package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TEmployeeroleDTO;
import com.vpn.website.client.mapper.TEmployeeroleMapper;
import com.vpn.website.client.mapstruct.TEmployeeroleMap;
import com.vpn.website.client.model.TEmployeerole;
import com.vpn.website.client.query.TEmployeeroleQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/16 18:57
 */
@Service
public class TEmployeeroleServiceImpl extends ServiceImpl<TEmployeeroleMapper, TEmployeerole> implements TEmployeeroleService {
    @Autowired
    private TEmployeeroleMap tEmployeeroleMap;

    /*@Autowired
    TEmployeeroleMapper tEmployeeroleMapper;
*/
    @Override
    public PageBean<TEmployeeroleDTO> listPage(TEmployeeroleQuery query) {

        Page<TEmployeerole> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TEmployeeroleDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tEmployeeroleMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
