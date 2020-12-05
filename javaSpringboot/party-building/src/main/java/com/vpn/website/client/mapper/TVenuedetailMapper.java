package com.vpn.website.client.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vpn.website.client.model.TVenuedetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author fml
 * @date 2020/8/13 21:21
 */
@Mapper
public interface TVenuedetailMapper extends BaseMapper<TVenuedetail> {
  /*  List<TVenuedetail> selectAllTVenuedetail();

    int addTVenuedetail(TVenuedetail tVenuedetail);

    int deleteTVenuedetail(Integer id);

    int updateTVenuedetail(TVenuedetail tVenuedetail);

    TVenuedetail findById(Integer id);*/
}
