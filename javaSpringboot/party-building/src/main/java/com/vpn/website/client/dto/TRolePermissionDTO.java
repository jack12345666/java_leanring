package com.vpn.website.client.dto;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/15 9:37
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 角色表
 */
@Data
public class TRolePermissionDTO {
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
