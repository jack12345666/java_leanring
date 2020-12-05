package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "com-vpn-website-client-model-TVenuefile")
@Data
@TableName(value = "t_venuefile")
public class TVenuefile {

    @TableId(value = "id")
    @ApiModelProperty(value = "编号")
    private String id;

    @TableField(value = "venue")
    @ApiModelProperty(value = "明细序号")
    private long venue;

    @TableField(value = "detail")
    @ApiModelProperty(value = "文件类型 0VR 1原始图片 2")
    private long detail;

    @TableField(value = "type")
    @ApiModelProperty(value = "缩略图片")
    private long type;

    @TableField(value = "foreignSource")
    @ApiModelProperty(value = "外部来源")
    private String foreignSource;

    @TableField(value = "foreignId")
    @ApiModelProperty(value = "外部编号")
    private String foreignId;

    @TableField(value = "tag")
    @ApiModelProperty(value = "文件标签")
    private String tag;

    @TableField(value = "fileName")
    @ApiModelProperty(value = "文件名称")
    private String fileName;

    @TableField(value = "filePath")
    @ApiModelProperty(value = "文件路径")
    private String filePath;

    @TableField(value = "fileExt")
    @ApiModelProperty(value = "文件后缀")
    private String fileExt;

    @TableField(value = "fileSize")
    @ApiModelProperty(value = "文件大小")
    private long fileSize;

    @TableField(value = "displayNo")
    @ApiModelProperty(value = "显示顺序")
    private long displayNo;

    @TableField(value = "createTime", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @TableField(value = "updateTime", fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @TableField(value = "userId")
    @ApiModelProperty(value = "用户序号")
    private long userId;

    @TableField(value = "userName")
    @ApiModelProperty(value = "用户姓名")
    private String userName;

    @TableField(value = "employeeId")
    @ApiModelProperty(value = "管理员序号")
    private long employeeId;

    @TableField(value = "employeeName")
    @ApiModelProperty(value = "管理员姓名")
    private String employeeName;

    @TableField(value = "examinantId")
    @ApiModelProperty(value = "审核员序号")
    private long examinantId;

    @TableField(value = "examinantName")
    @ApiModelProperty(value = "审核员姓名")
    private String examinantName;

    @TableField(value = "examTime")
    @ApiModelProperty(value = "审核时间")
    private Date examTime;

    @TableField(value = "isShown")
    @ApiModelProperty(value = "是否显示")
    private long isShown;

    @TableField(value = "isValid")
    @ApiModelProperty(value = "是否有效")
    private long isValid;


    public static final String COL_ID = "id";

    public static final String COL_VENUE = "venue";

    public static final String COL_DETAIL = "detail";

    public static final String COL_TYPE = "type";

    public static final String COL_FOREIGNSOURCE = "foreignSource";

    public static final String COL_FOREIGNID = "foreignId";

    public static final String COL_TAG = "tag";

    public static final String COL_FILENAME = "fileName";

    public static final String COL_FILEPATH = "filePath";

    public static final String COL_FILEEXT = "fileExt";

    public static final String COL_FILESIZE = "fileSize";

    public static final String COL_DISPLAYNO = "displayNo";

    public static final String COL_CREATETIME = "createTime";

    public static final String COL_UPDATETIME = "updateTime";

    public static final String COL_USERID = "userId";

    public static final String COL_USERNAME = "userName";

    public static final String COL_EMPLOYEEID = "employeeId";

    public static final String COL_EMPLOYEENAME = "employeeName";

    public static final String COL_EXAMINANTID = "examinantId";

    public static final String COL_EXAMINANTNAME = "examinantName";

    public static final String COL_EXAMTIME = "examTime";

    public static final String COL_ISSHOWN = "isShown";

    public static final String COL_ISVALID = "isValid";
}

