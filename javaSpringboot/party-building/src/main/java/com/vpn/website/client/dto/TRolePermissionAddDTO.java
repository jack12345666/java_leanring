package com.vpn.website.client.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author fml
 * @date 2020/8/16 18:21
 */
@Data
public class TRolePermissionAddDTO {
    /**
     * 角色序号
     */
    @ApiModelProperty(value = "角色序号")
    private Integer role;

    /**
     * 权限编号
     */
    @ApiModelProperty(value = "权限编号")
    private String permission;
}
