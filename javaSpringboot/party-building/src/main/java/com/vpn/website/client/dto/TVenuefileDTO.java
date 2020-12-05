package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 9:40
 */
@Data
public class TVenuefileDTO {

    @ApiModelProperty(value = "编号")
    private String id;

    @ApiModelProperty(value = "明细序号")
    private long venue;

    @ApiModelProperty(value = "文件类型 0VR 1原始图片 2")
    private long detail;

    @ApiModelProperty(value = "缩略图片")
    private long type;

    @TableField(value = "foreignSource")
    @ApiModelProperty(value = "外部来源")
    private String foreignSource;

    @ApiModelProperty(value = "外部编号")
    private String foreignId;

    @ApiModelProperty(value = "文件标签")
    private String tag;

    @TableField(value = "fileName")
    @ApiModelProperty(value = "文件名称")
    private String fileName;

    @ApiModelProperty(value = "文件路径")
    private String filePath;

    @ApiModelProperty(value = "文件后缀")
    private String fileExt;

    @ApiModelProperty(value = "文件大小")
    private long fileSize;

    @ApiModelProperty(value = "显示顺序")
    private long displayNo;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "用户序号")
    private long userId;

    @ApiModelProperty(value = "用户姓名")
    private String userName;

    @ApiModelProperty(value = "管理员序号")
    private long employeeId;

    @ApiModelProperty(value = "管理员姓名")
    private String employeeName;

    @ApiModelProperty(value = "审核员序号")
    private long examinantId;

    @ApiModelProperty(value = "审核员姓名")
    private String examinantName;

    @ApiModelProperty(value = "审核时间")
    private Date examTime;

    @ApiModelProperty(value = "是否显示")
    private long isShown;

    @ApiModelProperty(value = "是否有效")
    private long isValid;

}
