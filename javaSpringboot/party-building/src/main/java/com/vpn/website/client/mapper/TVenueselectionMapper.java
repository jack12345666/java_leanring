package com.vpn.website.client.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vpn.website.client.model.TVenuedetail;
import com.vpn.website.client.model.TVenueselection;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author fml
 * @date 2020/8/13 21:36
 */
@Mapper
public interface TVenueselectionMapper extends BaseMapper<TVenueselection> {
  /*  List<TVenueselection> selectAllTVenueselection();

    int addTVenueselection(TVenueselection tVenueselection);

    int deleteTVenueselection(Integer id);

    int updateTVenueselection(TVenueselection tVenueselection);

    TVenueselection findById(Integer id);*/
}
