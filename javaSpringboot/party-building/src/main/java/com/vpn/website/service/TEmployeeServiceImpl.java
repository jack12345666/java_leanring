package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TEmployeeDTO;
import com.vpn.website.client.mapper.TEmployeeMapper;
import com.vpn.website.client.mapstruct.TEmployeeMap;
import com.vpn.website.client.model.TEmployee;
import com.vpn.website.client.query.TEmployeeQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/16 18:57
 */
@Service
public class TEmployeeServiceImpl extends ServiceImpl<TEmployeeMapper, TEmployee> implements TEmployeeService {
    @Autowired
    private TEmployeeMap tEmployeeMap;

    /*@Autowired
    TEmployeeMapper tEmployeeMapper;
*/
    @Override
    public PageBean<TEmployeeDTO> listPage(TEmployeeQuery query) {

        Page<TEmployee> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TEmployeeDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tEmployeeMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}