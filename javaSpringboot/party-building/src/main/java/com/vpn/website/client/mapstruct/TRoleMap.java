package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TRoleDTO;
import com.vpn.website.client.model.TRole;
import org.mapstruct.Mapper;

/**
 * @author fml
 * @date 2020/8/16 18:27
 */
@Mapper(componentModel = "spring")
public interface TRoleMap {
    TRoleDTO doToDto(TRole tRole);
}
