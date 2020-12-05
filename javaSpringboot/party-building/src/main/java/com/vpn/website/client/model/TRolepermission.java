package com.vpn.website.client.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 角色权限表
 */
@ApiModel(value = "com-vpn-website-client-model-TRolepermission")
@Data
@TableName(value = "t_rolepermission")
public class TRolepermission {
  /**
   * 角色序号
   */
  @TableId(value = "role", type = IdType.INPUT)
  @ApiModelProperty(value = "角色序号")
  private Integer role;

  /**
   * 权限编号
   */
  @TableId(value = "permission", type = IdType.INPUT)
  @ApiModelProperty(value = "权限编号")
  private String permission;

  public static final String COL_ROLE = "role";

  public static final String COL_PERMISSION = "permission";
}
