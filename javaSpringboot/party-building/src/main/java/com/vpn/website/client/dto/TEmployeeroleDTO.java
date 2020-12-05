package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author fml
 * @date 2020/8/16 18:17
 */
@Data
public class TEmployeeroleDTO {
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
