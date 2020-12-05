package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TVenuedetailDTO;
import com.vpn.website.client.mapper.TVenuedetailMapper;
import com.vpn.website.client.mapstruct.TVenuedetailMap;
import com.vpn.website.client.model.TVenuedetail;
import com.vpn.website.client.query.TVenuedetailQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/13 21:24
 */
@Service
public class TVenuedetailServiceImpl extends ServiceImpl<TVenuedetailMapper, TVenuedetail> implements TVenuedetailService {
    @Autowired
    private TVenuedetailMap tVenuedetailMap;

    @Autowired
    TVenuedetailMapper tVenuedetailMapper;

    @Override
    public PageBean<TVenuedetailDTO> listPage(TVenuedetailQuery query) {

        Page<TVenuedetail> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TVenuedetailDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tVenuedetailMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }


  /*  @Override
    public List<TVenuedetail> selectAllTVenuedetail() {
        return tVenuedetailMapper.selectAllTVenuedetail();
    }

    @Override
    public int addTVenuedetail(TVenuedetail tVenuedetail) {
        return tVenuedetailMapper.addTVenuedetail(tVenuedetail);
    }

    @Override
    public int deleteTVenuedetail(Integer id) {
        return tVenuedetailMapper.deleteTVenuedetail(id);
    }

    @Override
    public int updateTVenuedetail(TVenuedetail tVenuedetail) {
        return tVenuedetailMapper.updateTVenuedetail(tVenuedetail);
    }

    @Override
    public TVenuedetail findById(Integer id) {
        return tVenuedetailMapper.findById(id);
    }*/
}
