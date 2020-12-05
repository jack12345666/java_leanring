package com.vpn.website.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vpn.website.client.dto.TVenueDTO;
import com.vpn.website.client.mapper.TVenueMapper;
import com.vpn.website.client.mapstruct.TVenueMap;
import com.vpn.website.client.model.TVenue;
import com.vpn.website.client.query.TVenueQuery;
import com.vpn.website.common.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/13 10:56
 */
@Service
public class TVenueServiceImpl extends ServiceImpl<TVenueMapper, TVenue> implements TVenueService {
    @Autowired
    private TVenueMap tVenueMap;

    @Autowired
    TVenueMapper tVenueMapper;

    @Override
    public PageBean<TVenueDTO> listPage(TVenueQuery query) {

        Page<TVenue> page = baseMapper.selectPage(query.buildPage(), query.buildQuery());
        PageBean<TVenueDTO> bean = new PageBean(page, page.getRecords().stream().map(DO -> tVenueMap.doToDto(DO)).collect(Collectors.toList()));
        return bean;
    }

    @Override
    public List<TVenue> getCountryName(Integer countryId) {
        return tVenueMapper.getCountryName(countryId);
    }

  /*  @Override
    public Map<String, Object> selectVenue(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<TVenue> list = tVenueMapper.selectAllTVenue();
        // 获取总记录数
        long total = ((Page) list).getTotal();
        // 获取总页数
        int pages = ((Page) list).getPages();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
        }*/

 /*   @Override
    public List<TVenue> selectAllTVenue() {
        return tVenueMapper.selectAllTVenue();
    }

    @Override
    public int addTVenue(TVenue tVenue) {
        return tVenueMapper.addTVenue(tVenue);
    }

    @Override
    public int deleteTVenue(Integer id) {
        return tVenueMapper.deleteTVenue(id);
    }

    @Override
    public int updateTVenue(TVenue tVenue) {
        return tVenueMapper.updateTVenue(tVenue);
    }

    @Override
    public TVenue findById(Integer id) {
        return tVenueMapper.findById(id);
    }*/
}
