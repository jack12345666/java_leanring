package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TCommoncategoryDTO;
import com.vpn.website.client.model.TCommoncategory;
import org.mapstruct.Mapper;

/**
 * @author fml
 * @date 2020/8/16 18:26
 */
@Mapper(componentModel = "spring")
public interface TCommoncategoryMap {
    TCommoncategoryDTO doToDto(TCommoncategory tCommoncategory);
}
