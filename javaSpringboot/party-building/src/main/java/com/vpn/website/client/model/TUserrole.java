package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户角色表
 */
@ApiModel(value = "com-vpn-website-client-model-TUserrole")
@Data
@TableName(value = "t_userrole")
public class TUserrole {
  /**
   * 用户序号
   */
  @TableId(value = "user", type = IdType.INPUT)
  @ApiModelProperty(value = "用户序号")
  private Integer user;

  /**
   * 角色序号
   */
  @TableId(value = "role", type = IdType.INPUT)
  @ApiModelProperty(value = "角色序号")
  private Integer role;

  public static final String COL_USER = "user";

  public static final String COL_ROLE = "role";
}
