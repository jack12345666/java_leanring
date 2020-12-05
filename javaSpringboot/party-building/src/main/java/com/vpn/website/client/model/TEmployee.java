package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 员工信息表
 */
@ApiModel(value = "com-vpn-website-client-model-TEmployee")
@Data
@TableName(value = "t_employee")
public class TEmployee {

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
     * 姓名
     */
    @TableField(value = "name")
    @ApiModelProperty(value = "姓名")
    private String name;

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
     * 部门序号
     */
    @TableField(value = "deptId")
    @ApiModelProperty(value = "部门序号")
    private Integer deptId;

    /**
     * 部门名称
     */
    @TableField(value = "deptName")
    @ApiModelProperty(value = "部门名称")
    private String deptName;

    /**
     * 性别 0未知 1男 2女
     */
    @TableField(value = "gender")
    @ApiModelProperty(value = "性别 0未知 1男 2女")
    private Integer gender;

    /**
     * 头像地址
     */
    @TableField(value = "avatar")
    @ApiModelProperty(value = "头像地址")
    private String avatar;

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
     * 电话
     */
    @TableField(value = "tel")
    @ApiModelProperty(value = "电话")
    private String tel;

    /**
     * 创建时间
     */
    @TableField(value = "createTime", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime", fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 编辑人序号
     */
    @TableField(value = "editorId", fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "编辑人序号")
    private Integer editorId;

    /**
     * 编辑时间
     */
    @TableField(value = "editTime", fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "编辑时间")
    private Date editTime;

    /**
     * 最后登录时间
     */
    @TableField(value = "lastTime")
    @ApiModelProperty(value = "最后登录时间")
    private Date lastTime;

    /**
     * 最后登录IP
     */
    @TableField(value = "lastIP")
    @ApiModelProperty(value = "最后登录IP")
    private String lastIP;

    /**
     * 钉钉userid
     */
    @TableField(value = "dingUserId")
    @ApiModelProperty(value = "钉钉userid")
    private String dingUserId;

    /**
     * 钉钉企业id
     */
    @TableField(value = "dingCorpId")
    @ApiModelProperty(value = "钉钉企业id")
    private String dingCorpId;

    /**
     * 状态Id
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

    public static final String COL_ID = "id";

    public static final String COL_NO = "no";

    public static final String COL_NAME = "name";

    public static final String COL_PASSWORD = "password";

    public static final String COL_SALT = "salt";

    public static final String COL_DEPTID = "deptId";

    public static final String COL_DEPTNAME = "deptName";

    public static final String COL_GENDER = "gender";

    public static final String COL_AVATAR = "avatar";

    public static final String COL_EMAIL = "email";

    public static final String COL_MOBILE = "mobile";

    public static final String COL_TEL = "tel";

    public static final String COL_CREATETIME = "createTime";

    public static final String COL_UPDATETIME = "updateTime";

    public static final String COL_EDITORID = "editorId";

    public static final String COL_EDITTIME = "editTime";

    public static final String COL_LASTTIME = "lastTime";

    public static final String COL_LASTIP = "lastIP";

    public static final String COL_DINGUSERID = "dingUserId";

    public static final String COL_DINGCORPID = "dingCorpId";

    public static final String COL_STATUSID = "statusId";

    public static final String COL_STATUSNAME = "statusName";

}
