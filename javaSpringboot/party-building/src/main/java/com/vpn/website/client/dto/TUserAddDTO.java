package com.vpn.website.client.dto;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/15 9:40
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 用户表
 */
@Data
public class TUserAddDTO {
    /**
     * 序号
     */
    @ApiModelProperty(value = "序号")
    private Integer id;

    /**
     * 账号
     */
    @ApiModelProperty(value = "账号")
    private String no;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    private String nickname;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 盐值
     */
    @ApiModelProperty(value = "盐值")
    private String salt;

    /**
     * 电子邮件
     */
    @ApiModelProperty(value = "电子邮件")
    private String email;

    /**
     * 手机
     */
    @ApiModelProperty(value = "手机")
    private String mobile;

    /**
     * 身份证
     */
    @ApiModelProperty(value = "身份证")
    private String idCard;

    /**
     * 性别 0未知 1男 2女
     */
    @ApiModelProperty(value = "性别 0未知 1男 2女")
    private Integer gender;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 是否实名认证
     */
    @ApiModelProperty(value = "是否实名认证")
    private Integer isAuthenticated;

    /**
     * 实名认证时间
     */
    @ApiModelProperty(value = "实名认证时间")
    private Date authenticationTime;

    /**
     * 审核人序号
     */
    @ApiModelProperty(value = "审核人序号")
    private Integer examinant;

    /**
     * 审核时间
     */
    @ApiModelProperty(value = "审核时间")
    private Date examTime;

    /**
     * 状态编号
     */
    @ApiModelProperty(value = "状态编号")
    private String statusId;

    /**
     * 状态名称
     */
    @ApiModelProperty(value = "状态名称")
    private String statusName;

    /**
     * 外部序号
     */
    @ApiModelProperty(value = "外部序号")
    private Integer foreignId;


}

