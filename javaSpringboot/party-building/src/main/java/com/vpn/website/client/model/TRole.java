package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-vpn-website-client-model-TRole")
@Data
@TableName(value = "t_role")
public class TRole {

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "序号")
    private Integer id;

    /**
     * 类型
     */
    @TableField(value = "category")
    @ApiModelProperty(value = "类型")
    private String category;

    /**
     * 名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 是否有效
     */
    @TableField(value = "isValid")
    @ApiModelProperty(value = "是否有效")
    private Integer isValid;

    public static final String COL_ID = "id";

    public static final String COL_CATEGORY = "category";

    public static final String COL_NAME = "name";

    public static final String COL_ISVALID = "isValid";

}
