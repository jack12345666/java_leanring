package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TCodecategoryDTO;
import com.vpn.website.client.model.TCodecategory;
import com.vpn.website.client.model.TVenuedetail;
import org.mapstruct.Mapper;

/**
 * @author fml
 * @date 2020/8/16 18:25
 */
@Mapper(componentModel = "spring")
public interface TCodecategoryMap {
    TCodecategoryDTO doToDto(TCodecategory tCodecategory);
}
