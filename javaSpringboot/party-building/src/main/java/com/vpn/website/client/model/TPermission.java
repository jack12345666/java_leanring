package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 权限表
 */
@ApiModel(value = "com-vpn-website-client-model-TPermission")
@Data
@TableName(value = "t_permission")
public class TPermission implements Serializable {

  /**
   * 编号
   */
  @TableId(value = "id", type = IdType.INPUT)
  @ApiModelProperty(value = "编号")
  private String id;

  /**
   * 类型
   */
  @TableField(value = "category")
  @ApiModelProperty(value = "类型")
  private String category;

  /**
   * 上级编号
   */
  @TableField(value = "parentId")
  @ApiModelProperty(value = "上级编号")
  private String parentId;

  /**
   * 名称
   */
  @TableField(value = "name")
  @ApiModelProperty(value = "名称")
  private String name;

  /**
   * 备注
   */
  @TableField(value = "comment")
  @ApiModelProperty(value = "备注")
  private String comment;

  /**
   * 显示顺序
   */
  @TableField(value = "displayNo")
  @ApiModelProperty(value = "显示顺序")
  private Integer displayNo;

  /**
   * 是否有效
   */
  @TableLogic
  @TableField(value = "isValid")
  @ApiModelProperty(value = "是否有效")
  private Integer isValid;

  public static final String COL_ID = "id";

  public static final String COL_CATEGORY = "category";

  public static final String COL_PARENTID = "parentId";

  public static final String COL_NAME = "name";

  public static final String COL_COMMENT = "comment";

  public static final String COL_DISPLAYNO = "displayNo";

  public static final String COL_ISVALID = "isValid";

}
