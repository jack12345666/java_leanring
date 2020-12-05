package com.vpn.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vpn.website.client.dto.TVenuedetailDTO;
import com.vpn.website.client.model.TVenuedetail;
import com.vpn.website.client.query.TVenuedetailQuery;
import com.vpn.website.common.base.PageBean;

import java.util.List;

/**
 * @author fml
 * @date 2020/8/13 21:23
 */
public interface TVenuedetailService extends IService<TVenuedetail> {
    PageBean<TVenuedetailDTO> listPage(TVenuedetailQuery query);
/*
    List<TVenuedetail> selectAllTVenuedetail();

    int addTVenuedetail(TVenuedetail tVenuedetail);

    int deleteTVenuedetail(Integer id);

    int updateTVenuedetail(TVenuedetail tVenuedetail);

    TVenuedetail findById(Integer id);*/
}
