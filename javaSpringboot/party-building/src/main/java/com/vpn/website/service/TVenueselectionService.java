package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TVenueselectionDTO;
import com.vpn.website.client.model.TVenueselection;
import com.vpn.website.client.query.TVenueselectionQuery;
import com.vpn.website.common.base.PageBean;

import java.util.List;

/**
 * @author fml
 * @date 2020/8/13 21:40
 */
public interface TVenueselectionService extends IService<TVenueselection> {
    PageBean<TVenueselectionDTO> listPage(TVenueselectionQuery query);

    //List<TVenueselection> selectAllTVenueselection();

    /*int addTVenueselection(TVenueselection tVenueselection);

    int deleteTVenueselection(Integer id);

    int updateTVenueselection(TVenueselection tVenueselection);

    TVenueselection findById(Integer id);*/
}
