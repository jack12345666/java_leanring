package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "com-vpn-website-client-model-TVenueselection")
@Data
@TableName(value = "t_venueselection")
public class TVenueselection {

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "序号")
    private Integer id;

    @TableField(value = "no")
    @ApiModelProperty(value = "编号")
    private String no;

    @TableField(value = "contactName")
    @ApiModelProperty(value = "联系人姓名")
    private String contactName;

    @TableField(value = "contactMobile")
    @ApiModelProperty(value = "联系人手机号码")
    private String contactMobile;

    @TableField(value = "contactEmail")
    @ApiModelProperty(value = "联系人电子邮箱")
    private String contactEmail;

    @TableField(value = "contactPosition")
    @ApiModelProperty(value = "联系人职位")
    private String contactPosition;

    @TableField(value = "areaIds")
    @ApiModelProperty(value = "区域序号，分号分割")
    private String areaIds;

    @TableField(value = "areaNames")
    @ApiModelProperty(value = "区域名称，分号分割")
    private String areaNames;

    @TableField(value = "venueCategoryIds")
    @ApiModelProperty(value = "场地类型序号，分号分割")
    private String venueCategoryIds;

    @TableField(value = "venueCategoryNames")
    @ApiModelProperty(value = "场地类型名称，分号分割")
    private String venueCategoryNames;

    @TableField(value = "areaSection")
    @ApiModelProperty(value = "面积区间")
    private String areaSection;

    @TableField(value = "orderDescription")
    @ApiModelProperty(value = "需求描述")
    private String orderDescription;

    @TableField(value = "venueId")
    @ApiModelProperty(value = "场地序号")
    private Integer venueId;

    @TableField(value = "venueName")
    @ApiModelProperty(value = "场地名称")
    private String venueName;

    @TableField(value = "createTime", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @TableField(value = "updateTime", fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @TableField(value = "userId")
    @ApiModelProperty(value = "用户序号")
    private Integer userId;

    @TableField(value = "userName")
    @ApiModelProperty(value = "用户姓名")
    private String userName;

    @TableField(value = "userMobile")
    @ApiModelProperty(value = "用户手机号码")
    private String userMobile;

    @TableField(value = "outerStatus")
    @ApiModelProperty(value = "选址状态")
    private String outerStatus;

    @TableField(value = "employeeId")
    @ApiModelProperty(value = "管理员序号")
    private Integer employeeId;

    @TableField(value = "employeeName")
    @ApiModelProperty(value = "管理员姓名")
    private String employeeName;

    @TableField(value = "operateTime")
    @ApiModelProperty(value = "操作时间")
    private Date operateTime;

    @TableField(value = "innerStatus")
    @ApiModelProperty(value = "操作状态")
    private String innerStatus;

    public static final String COL_ID = "id";

    public static final String COL_NO = "no";

    public static final String COL_CONTACTNAME = "contactName";

    public static final String COL_CONTACTMOBILE = "contactMobile";

    public static final String COL_CONTACTEMAIL = "contactEmail";

    public static final String COL_CONTACTPOSITION = "contactPosition";

    public static final String COL_AREAIDS = "areaIds";

    public static final String COL_AREANAMES = "areaNames";

    public static final String COL_VENUECATEGORYIDS = "venueCategoryIds";

    public static final String COL_VENUECATEGORYNAMES = "venueCategoryNames";

    public static final String COL_AREASECTION = "areaSection";

    public static final String COL_ORDERDESCRIPTION = "orderDescription";

    public static final String COL_VENUEID = "venueId";

    public static final String COL_VENUENAME = "venueName";

    public static final String COL_CREATETIME = "createTime";

    public static final String COL_UPDATETIME = "updateTime";

    public static final String COL_USERID = "userId";

    public static final String COL_USERNAME = "userName";

    public static final String COL_USERMOBILE = "userMobile";

    public static final String COL_OUTERSTATUS = "outerStatus";

    public static final String COL_EMPLOYEEID = "employeeId";

    public static final String COL_EMPLOYEENAME = "employeeName";

    public static final String COL_OPERATETIME = "operateTime";

    public static final String COL_INNERSTATUS = "innerStatus";


}
