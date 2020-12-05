package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 通用多级分类表
 */
@ApiModel(value = "com-vpn-website-client-model-TCommoncategory")
@Data
@TableName(value = "t_commoncategory")
public class TCommoncategory {

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "序号")
    private Integer id;

    /**
     * 编号
     */
    @TableField(value = "no")
    @ApiModelProperty(value = "编号")
    private String no;

    /**
     * 名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 上级序号
     */
    @TableField(value = "parentId")
    @ApiModelProperty(value = "上级序号")
    private Integer parentId;

    /**
     * 上级名称
     */
    @TableField(value = "parentName")
    @ApiModelProperty(value = "上级名称")
    private String parentName;

    /**
     * 类型
     */
    @TableField(value = "category")
    @ApiModelProperty(value = "类型")
    private String category;

    /**
     * 显示顺序
     */
    @TableField(value = "displayNo")
    @ApiModelProperty(value = "显示顺序")
    private Integer displayNo;

    /**
     * 排序等级
     */
    @TableField(value = "rankLevel")
    @ApiModelProperty(value = "排序等级")
    private Integer rankLevel;

    /**
     * 备注
     */
    @TableField(value = "comment")
    @ApiModelProperty(value = "备注")
    private String comment;

    /**
     * 是否有效
     */
    @TableField(value = "isValid")
    @ApiModelProperty(value = "是否有效")
    private Integer isValid;

    public static final String COL_ID = "id";

    public static final String COL_NO = "no";

    public static final String COL_NAME = "name";

    public static final String COL_PARENTID = "parentId";

    public static final String COL_PARENTNAME = "parentName";

    public static final String COL_CATEGORY = "category";

    public static final String COL_DISPLAYNO = "displayNo";

    public static final String COL_RANKLEVEL = "rankLevel";

    public static final String COL_COMMENT = "comment";

    public static final String COL_ISVALID = "isValid";


}
