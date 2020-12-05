package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/15 9:41
 */
@Data
public class TUserRoleDTO {
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
