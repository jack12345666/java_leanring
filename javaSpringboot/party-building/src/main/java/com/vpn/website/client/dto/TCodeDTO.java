package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/15 9:30
 */
@Data
@TableName(value = "t_code")
public class TCodeDTO {
    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private String id;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String category;

    /**
     * 简称
     */
    @ApiModelProperty(value = "简称")
    private String simple;

    /**
     * 显示顺序
     */
    @ApiModelProperty(value = "显示顺序")
    private Integer displayNo;

    /**
     * 是否有效
     */
    @ApiModelProperty(value = "是否有效")
    private Integer isValid;
}