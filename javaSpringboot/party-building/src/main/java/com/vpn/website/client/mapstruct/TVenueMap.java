package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TVenueDTO;
import com.vpn.website.client.model.TVenue;
import org.mapstruct.Mapper;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/13 10:49
 */
@Mapper(componentModel = "spring")
public interface TVenueMap {
    TVenueDTO doToDto(TVenue tVenue);
}
