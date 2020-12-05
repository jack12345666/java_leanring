package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TVenueDTO;
import com.vpn.website.client.model.TVenue;
import com.vpn.website.client.query.TVenueQuery;
import com.vpn.website.common.base.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/13 10:54
 */
public interface TVenueService extends IService<TVenue> {
    PageBean<TVenueDTO> listPage(TVenueQuery query);

     // Map<String, Object> selectVenue(Integer page, Integer limit);

    /*List<TVenue> selectAllTVenue();

    int addTVenue(TVenue tVenue);

    int deleteTVenue(Integer id);

    int updateTVenue(TVenue tCode);

    TVenue findById(Integer id);*/
    List<TVenue> getCountryName(Integer countryId);
}
