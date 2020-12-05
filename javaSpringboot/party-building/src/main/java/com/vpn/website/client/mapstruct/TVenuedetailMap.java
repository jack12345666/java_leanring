package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TVenuedetailDTO;
import com.vpn.website.client.model.TVenuedetail;
import org.mapstruct.Mapper;

/**
 * @author fml
 * @date 2020/8/13 20:38
 */
@Mapper(componentModel = "spring")
public interface TVenuedetailMap {
    TVenuedetailDTO doToDto(TVenuedetail tVenuedetail);
}
