package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TVenuelogDTO;
import com.vpn.website.client.model.TVenuelog;
import org.mapstruct.Mapper;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 14:05
 */

@Mapper(componentModel = "spring")
public interface TVenuelogMap {
    TVenuelogDTO doToDto(TVenuelog tVenuelog);
}
