package com.vpn.website.client.mapstruct;

/**
 * @author fml
 * @date 2020/8/16 18:27
 */

import com.vpn.website.client.dto.TPermissionDTO;
import com.vpn.website.client.model.TPermission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TPermissionMap {
    TPermissionDTO doToDto(TPermission tPermission);
}
