package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TUserRoleDTO;
import com.vpn.website.client.model.TUserrole;
import org.mapstruct.Mapper;

/**
 * @author fml
 * @date 2020/8/16 18:28
 */
@Mapper(componentModel = "spring")
public interface TUserroleMap {
    TUserRoleDTO doToDto(TUserrole tUserrole);
}
