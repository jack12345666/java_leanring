package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/15 9:31
 */
@Data
public class TEmployeeDTO {
    /**
     * 序号
     */
    @ApiModelProperty(value = "序号")
    private Integer id;

    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private String no;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

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
     * 部门序号
     */
    @ApiModelProperty(value = "部门序号")
    private Integer deptId;

    /**
     * 部门名称
     */
    @ApiModelProperty(value = "部门名称")
    private String deptName;

    /**
     * 性别 0未知 1男 2女
     */
    @ApiModelProperty(value = "性别 0未知 1男 2女")
    private Integer gender;

    /**
     * 头像地址
     */
    @ApiModelProperty(value = "头像地址")
    private String avatar;

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
     * 电话
     */
    @ApiModelProperty(value = "电话")
    private String tel;

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
     * 编辑人序号
     */
    @ApiModelProperty(value = "编辑人序号")
    private Integer editorId;

    /**
     * 编辑时间
     */
    @ApiModelProperty(value = "编辑时间")
    private Date editTime;

    /**
     * 最后登录时间
     */
    @ApiModelProperty(value = "最后登录时间")
    private Date lastTime;

    /**
     * 最后登录IP
     */
    @ApiModelProperty(value = "最后登录IP")
    private String lastIP;

    /**
     * 钉钉userid
     */
    @ApiModelProperty(value = "钉钉userid")
    private String dingUserId;

    /**
     * 钉钉企业id
     */
    @ApiModelProperty(value = "钉钉企业id")
    private String dingCorpId;

    /**
     * 状态Id
     */
    @ApiModelProperty(value = "状态编号")
    private String statusId;

    /**
     * 状态名称
     */
    @ApiModelProperty(value = "状态名称")
    private String statusName;
}
