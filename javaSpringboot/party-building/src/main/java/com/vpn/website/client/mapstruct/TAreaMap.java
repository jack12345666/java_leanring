package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TAreaDTO;
import com.vpn.website.client.model.TArea;
import org.mapstruct.Mapper;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/18 14:43
 */
@Mapper(componentModel = "spring")
public interface TAreaMap {
    TAreaDTO doToDto(TArea tArea);
//    TArea doToDto(TAreaDTO tAreaDTO);
}
