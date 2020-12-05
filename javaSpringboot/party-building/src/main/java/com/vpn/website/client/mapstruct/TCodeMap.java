package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TCodeDTO;
import com.vpn.website.client.model.TCode;
import org.mapstruct.Mapper;

/**
 * @author fml
 * @date 2020/8/16 18:24
 */
@Mapper(componentModel = "spring")
public interface TCodeMap {
    TCodeDTO doToDto(TCode tCode);
}
