package com.vpn.website.client.dto;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/15 9:44
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 角色表
 */
@Data
public class TEmployeeroleAddDTO {
    /**
     * 员工序号
     */
    @ApiModelProperty(value = "员工序号")
    private Integer employee;

    /**
     * 角色序号
     */
    @ApiModelProperty(value = "角色序号")
    private Integer role;

}

