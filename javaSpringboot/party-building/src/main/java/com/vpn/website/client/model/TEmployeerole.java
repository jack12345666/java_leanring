package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 员工角色表
 */
@ApiModel(value = "com-vpn-website-client-model-TEmployeerole")
@Data
@TableName(value = "t_employeerole")
public class TEmployeerole {

  /**
   * 员工序号
   */
  @TableId(value = "employee", type = IdType.INPUT)
  @ApiModelProperty(value = "员工序号")
  private Integer employee;

  /**
   * 角色序号
   */
  @TableId(value = "role", type = IdType.INPUT)
  @ApiModelProperty(value = "角色序号")
  private Integer role;

  public static final String COL_EMPLOYEE = "employee";

  public static final String COL_ROLE = "role";


}
