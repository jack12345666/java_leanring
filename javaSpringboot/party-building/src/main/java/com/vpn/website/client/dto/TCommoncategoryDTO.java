package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/15 9:45
 */
@Data
public class TCommoncategoryDTO {
    /**
     * 序号
     */
    @ApiModelProperty(value = "序号")
    private Integer id;

    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private String no;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 上级序号
     */
    @ApiModelProperty(value = "上级序号")
    private Integer parentId;

    /**
     * 上级名称
     */
    @ApiModelProperty(value = "上级名称")
    private String parentName;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String category;

    /**
     * 显示顺序
     */
    @ApiModelProperty(value = "显示顺序")
    private Integer displayNo;

    /**
     * 排序等级
     */
    @ApiModelProperty(value = "排序等级")
    private Integer rankLevel;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String comment;

    /**
     * 是否有效
     */
    @ApiModelProperty(value = "是否有效")
    private Integer isValid;
}
