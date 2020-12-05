package com.vpn.website.client.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author fml
 * @date 2020/8/16 18:23
 */
@Data
public class TUserRoleAddDTO {
    /**
     * 用户序号
     */
    @ApiModelProperty(value = "用户序号")
    private Integer user;

    /**
     * 角色序号
     */
    @ApiModelProperty(value = "角色序号")
    private Integer role;
}
