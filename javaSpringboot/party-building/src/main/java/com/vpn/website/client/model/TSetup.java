package com.vpn.website.client.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 系统配置表
 */
@ApiModel(value = "com-vpn-website-client-model-TSetup")
@Data
@TableName(value = "t_setup")
public class TSetup {
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
     * 值
     */
    @TableField(value = "setupValue")
    @ApiModelProperty(value = "值")
    private String setupValue;

    /**
     * 备注
     */
    @TableField(value = "comment")
    @ApiModelProperty(value = "备注")
    private String comment;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_SETUPVALUE = "setupValue";

    public static final String COL_COMMENT = "comment";
}
