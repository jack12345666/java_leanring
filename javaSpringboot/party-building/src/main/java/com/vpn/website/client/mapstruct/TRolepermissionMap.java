package com.vpn.website.client.mapstruct;

/**
 * @author fml
 * @date 2020/8/16 18:27
 */

import com.vpn.website.client.dto.TRolePermissionDTO;
import com.vpn.website.client.model.TRolepermission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TRolepermissionMap {
    TRolePermissionDTO doToDto(TRolepermission tRolepermission);
}
