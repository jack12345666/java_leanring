package com.vpn.website.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TVenueselectionDTO;
import com.vpn.website.client.mapper.TVenueselectionMapper;
import com.vpn.website.client.mapstruct.TVenueselectionMap;
import com.vpn.website.client.model.TVenueselection;
import com.vpn.website.client.query.TVenueselectionQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fml
 * @date 2020/8/13 21:41
 */
@Service
public class TVenueselectionServiceImpl extends ServiceImpl<TVenueselectionMapper, TVenueselection> implements TVenueselectionService {
    @Autowired
    private TVenueselectionMap tVenueselectionMap;

    @Autowired
    TVenueselectionMapper tVenueselectionMapper;

    @Override
    public PageBean<TVenueselectionDTO> listPage(TVenueselectionQuery query) {

        Page<TVenueselection> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TVenueselectionDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tVenueselectionMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }


   /* @Override
    public List<TVenueselection> selectAllTVenueselection() {
        return tVenueselectionMapper.selectAllTVenueselection();
    }
*/
  /*  @Override
    public int addTVenueselection(TVenueselection tVenueselection) {
        return tVenueselectionMapper.addTVenueselection(tVenueselection);
    }

    @Override
    public int deleteTVenueselection(Integer id) {
        return tVenueselectionMapper.deleteTVenueselection(id);
    }

    @Override
    public int updateTVenueselection(TVenueselection tVenueselection) {
        return tVenueselectionMapper.updateTVenueselection(tVenueselection);
    }

    @Override
    public TVenueselection findById(Integer id) {
        return tVenueselectionMapper.findById(id);
    }*/
}
