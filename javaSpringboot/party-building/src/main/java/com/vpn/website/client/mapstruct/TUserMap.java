package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TUserDTO;
import com.vpn.website.client.model.TUser;
import org.mapstruct.Mapper;

/**
 * @author fml
 * @date 2020/8/16 18:28
 */
@Mapper(componentModel = "spring")
public interface TUserMap {
    TUserDTO doToDto(TUser tUser);
}
