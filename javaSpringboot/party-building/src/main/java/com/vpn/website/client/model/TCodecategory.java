package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 编码类型表
 */
@ApiModel(value = "com-vpn-website-client-model-TCodecategory")
@Data
@TableName(value = "t_codecategory")
public class TCodecategory {

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
     * 前缀
     */
    @TableField(value = "prefix")
    @ApiModelProperty(value = "前缀")
    private String prefix;

    /**
     * 是否只读
     */
    @TableField(value = "isReadonly")
    @ApiModelProperty(value = "是否只读")
    private Integer isReadonly;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_PREFIX = "prefix";

    public static final String COL_ISREADONLY = "isReadonly";


}
