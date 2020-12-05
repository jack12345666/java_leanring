package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 权限表
 */
@Data
public class TPermissionDTO implements Serializable {

    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private String id;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String category;

    /**
     * 上级编号
     */
    @ApiModelProperty(value = "上级编号")
    private String parentId;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String comment;

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