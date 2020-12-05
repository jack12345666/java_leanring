package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TVenuefileDTO;
import com.vpn.website.client.model.TVenuefile;
import org.mapstruct.Mapper;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 9:43
 */
@Mapper(componentModel = "spring")
public interface TVenuefileMap {
    TVenuefileDTO doToDto(TVenuefile tVenuefile);
}
