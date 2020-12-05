package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/15 9:36
 */
@Data
public class TRoleAddDTO {
    /**
     * 序号
     */
    @ApiModelProperty(value = "序号")
    private Integer id;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String category;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 是否有效
     */
    @ApiModelProperty(value = "是否有效")
    private Integer isValid;

}
