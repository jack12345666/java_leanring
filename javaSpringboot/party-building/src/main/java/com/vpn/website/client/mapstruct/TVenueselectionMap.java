package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TVenueselectionDTO;
import com.vpn.website.client.model.TVenueselection;
import org.mapstruct.Mapper;

/**
 * @author fml
 * @date 2020/8/13 21:31
 */
@Mapper(componentModel = "spring")
public interface TVenueselectionMap {
    TVenueselectionDTO doToDto(TVenueselection tVenueselection);
}
