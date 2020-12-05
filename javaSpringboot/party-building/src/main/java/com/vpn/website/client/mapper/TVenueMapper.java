package com.vpn.website.client.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vpn.website.client.model.TVenue;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/13 10:53
 */
@Mapper
public interface TVenueMapper extends BaseMapper<TVenue> {
   /* List<TVenue> selectAllTVenue();

    int addTVenue(TVenue tVenue);

    int deleteTVenue(Integer id);

    int updateTVenue(TVenue tVenue);

    TVenue findById(Integer id);*/
   List<TVenue> getCountryName(Integer countryId);
}
