package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author fml
 * @date 2020/8/13 21:30
 */
@Data
public class TVenueselectionDTO {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "序号")
    private Integer id;

    @ApiModelProperty(value = "编号")
    private String no;

    @ApiModelProperty(value = "联系人姓名")
    private String contactName;

    @ApiModelProperty(value = "联系人手机号码")
    private String contactMobile;

    @ApiModelProperty(value = "联系人电子邮箱")
    private String contactEmail;

    @ApiModelProperty(value = "联系人职位")
    private String contactPosition;

    @ApiModelProperty(value = "区域序号，分号分割")
    private String areaIds;

    @ApiModelProperty(value = "区域名称，分号分割")
    private String areaNames;

    @ApiModelProperty(value = "场地类型序号，分号分割")
    private String venueCategoryIds;

    @ApiModelProperty(value = "场地类型名称，分号分割")
    private String venueCategoryNames;

    @ApiModelProperty(value = "面积区间")
    private String areaSection;

    @ApiModelProperty(value = "需求描述")
    private String orderDescription;

    @ApiModelProperty(value = "场地序号")
    private Integer venueId;

    @ApiModelProperty(value = "场地名称")
    private String venueName;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "用户序号")
    private Integer userId;

    @ApiModelProperty(value = "用户姓名")
    private String userName;

    @ApiModelProperty(value = "用户手机号码")
    private String userMobile;

    @ApiModelProperty(value = "选址状态")
    private String outerStatus;

    @ApiModelProperty(value = "管理员序号")
    private Integer employeeId;

    @ApiModelProperty(value = "管理员姓名")
    private String employeeName;

    @ApiModelProperty(value = "操作时间")
    private Date operateTime;

    @ApiModelProperty(value = "操作状态")
    private String innerStatus;
}
