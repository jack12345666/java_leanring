package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TUserDTO;
import com.vpn.website.client.mapper.TUserMapper;
import com.vpn.website.client.mapstruct.TUserMap;
import com.vpn.website.client.model.TUser;
import com.vpn.website.client.query.TUserQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/16 18:59
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {
    @Autowired
    private TUserMap tUserMap;

    /*@Autowired
    TUserMapper tUserMapper;*/

    @Override
    public PageBean<TUserDTO> listPage(TUserQuery query) {

        Page<TUser> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TUserDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tUserMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }
}
