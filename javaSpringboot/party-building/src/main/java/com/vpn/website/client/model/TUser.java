package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 用户表
 */
@ApiModel(value = "com-vpn-website-client-model-TUser")
@Data
@TableName(value = "t_user")
public class TUser {
    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "序号")
    private Integer id;

    /**
     * 账号
     */
    @TableField(value = "no")
    @ApiModelProperty(value = "账号")
    private String no;

    /**
     * 姓名
     */
    @TableField(value = "name")
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    @ApiModelProperty(value = "昵称")
    private String nickname;

    /**
     * 密码
     */
    @TableField(value = "password")
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 盐值
     */
    @TableField(value = "salt")
    @ApiModelProperty(value = "盐值")
    private String salt;

    /**
     * 电子邮件
     */
    @TableField(value = "email")
    @ApiModelProperty(value = "电子邮件")
    private String email;

    /**
     * 手机
     */
    @TableField(value = "mobile")
    @ApiModelProperty(value = "手机")
    private String mobile;

    /**
     * 身份证
     */
    @TableField(value = "idCard")
    @ApiModelProperty(value = "身份证")
    private String idCard;

    /**
     * 性别 0未知 1男 2女
     */
    @TableField(value = "gender")
    @ApiModelProperty(value = "性别 0未知 1男 2女")
    private Integer gender;

    /**
     * 头像
     */
    @TableField(value = "avatar")
    @ApiModelProperty(value = "头像")
    private String avatar;

    /**
     * 创建时间
     */
    @TableField(value = "createTime")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime")
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 是否实名认证
     */
    @TableField(value = "isAuthenticated")
    @ApiModelProperty(value = "是否实名认证")
    private Integer isAuthenticated;

    /**
     * 实名认证时间
     */
    @TableField(value = "authenticationTime")
    @ApiModelProperty(value = "实名认证时间")
    private Date authenticationTime;

    /**
     * 审核人序号
     */
    @TableField(value = "examinant")
    @ApiModelProperty(value = "审核人序号")
    private Integer examinant;

    /**
     * 审核时间
     */
    @TableField(value = "examTime")
    @ApiModelProperty(value = "审核时间")
    private Date examTime;

    /**
     * 状态编号
     */
    @TableField(value = "statusId")
    @ApiModelProperty(value = "状态编号")
    private String statusId;

    /**
     * 状态名称
     */
    @TableField(value = "statusName")
    @ApiModelProperty(value = "状态名称")
    private String statusName;

    /**
     * 外部序号
     */
    @TableField(value = "foreignId")
    @ApiModelProperty(value = "外部序号")
    private Integer foreignId;


    public static final String COL_ID = "id";

    public static final String COL_NO = "no";

    public static final String COL_NAME = "name";

    public static final String COL_NICKNAME = "nickname";

    public static final String COL_PASSWORD = "password";

    public static final String COL_SALT = "salt";

    public static final String COL_EMAIL = "email";

    public static final String COL_MOBILE = "mobile";

    public static final String COL_IDCARD = "idCard";

    public static final String COL_GENDER = "gender";

    public static final String COL_AVATAR = "avatar";

    public static final String COL_CREATETIME = "createTime";

    public static final String COL_UPDATETIME = "updateTime";

    public static final String COL_ISAUTHENTICATED = "isAuthenticated";

    public static final String COL_AUTHENTICATIONTIME = "authenticationTime";

    public static final String COL_EXAMINANT = "examinant";

    public static final String COL_EXAMTIME = "examTime";

    public static final String COL_STATUSID = "statusId";

    public static final String COL_STATUSNAME = "statusName";

    public static final String COL_FOREIGNID = "foreignId";


}
