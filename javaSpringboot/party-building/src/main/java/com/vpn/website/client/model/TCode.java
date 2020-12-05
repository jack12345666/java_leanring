package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 编码表
 */
@ApiModel(value = "com-vpn-website-client-model-TCode")
@Data
@TableName(value = "t_code")
public class TCode implements Serializable {

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "编号")
    private String id;

    /**
     * 名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 类型
     */
    @TableField(value = "category")
    @ApiModelProperty(value = "类型")
    private String category;

    /**
     * 简称
     */
    @TableField(value = "simple")
    @ApiModelProperty(value = "简称")
    private String simple;

    /**
     * 显示顺序
     */
    @TableField(value = "displayNo")
    @ApiModelProperty(value = "显示顺序")
    private Integer displayNo;

    /**
     * 是否有效
     */
    @TableField(value = "isValid")
    @ApiModelProperty(value = "是否有效")
    private Integer isValid;


    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_CATEGORY = "category";

    public static final String COL_SIMPLE = "simple";

    public static final String COL_DISPLAYNO = "displayNo";

    public static final String COL_ISVALID = "isValid";

}
