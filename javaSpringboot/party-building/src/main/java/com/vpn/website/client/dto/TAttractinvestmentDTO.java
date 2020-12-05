package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <p>
 * 委托招商信息表
 * </p>
 *
 * @author fml
 * @since 2020-08-18
 */
@Data
public class TAttractinvestmentDTO {

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
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称")
    private String name;
    /**
     * 国别编号
     */
    @ApiModelProperty(value = "国别编号")
    private String nationId;
    /**
     * 国别名称
     */
    @ApiModelProperty(value = "国别名称")
    private String nationName;
    /**
     * 省份编号
     */
    @ApiModelProperty(value = "省份编号")
    private String provinceId;
    /**
     * 省份名称
     */
    @ApiModelProperty(value = "省份名称")
    private String provinceName;
    /**
     * 城市编号
     */
    @ApiModelProperty(value = "城市编号")
    private String cityId;
    /**
     * 城市名称
     */
    @ApiModelProperty(value = "城市名称")
    private String cityName;
    /**
     * 区县编号
     */
    @ApiModelProperty(value = "区县编号")
    private String countryId;
    /**
     * 区县名称
     */
    @ApiModelProperty(value = "区县名称")
    private String countryName;
    /**
     * 场地类型编号（分号分割）
     */
    @ApiModelProperty(value = "场地类型编号（分号分割）")
    private String siteCategoryIds;
    /**
     * 场地类型名称（分号分割）
     */
    @ApiModelProperty(value = "场地类型名称（分号分割）")
    private String siteCategoryNames;
    /**
     * 面积区间
     */
    @ApiModelProperty(value = "面积区间")
    private String areaSection;
    /**
     * 行业编号（分号分割）
     */
    @ApiModelProperty(value = "行业编号（分号分割）")
    private String industryIds;
    /**
     * 行业名称（分号分割）
     */
    @ApiModelProperty(value = "行业名称（分号分割）")
    private String industryNames;
    /**
     * 目标机构（分号分割）
     */
    @ApiModelProperty(value = "目标机构（分号分割）")
    private String targetOrganizations;
    /**
     * 委托方名称
     */
    @ApiModelProperty(value = "委托方名称")
    private String clientName;
    /**
     * 联系人姓名
     */
    @ApiModelProperty(value = "联系人姓名")
    private String contactName;
    /**
     * 联系人手机号码
     */
    @ApiModelProperty(value = "联系人手机号码")
    private String contactMobile;
    /**
     * 联系人电子邮箱
     */
    @ApiModelProperty(value = "联系人电子邮箱")
    private String contactEmail;
    /**
     * 联系人职位
     */
    @ApiModelProperty(value = "联系人职位")
    private String contactPosition;
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
     * 用户序号
     */
    @ApiModelProperty(value = "用户序号")
    private Integer userId;
    /**
     * 用户姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String userName;
    /**
     * 用户手机号码
     */
    @ApiModelProperty(value = "用户手机号码")
    private String userMobile;
    /**
     * 委托状态
     */
    @ApiModelProperty(value = "委托状态")
    private String outerStatus;
    /**
     * 管理员序号
     */
    @ApiModelProperty(value = "管理员序号")
    private Integer employeeId;
    /**
     * 管理员姓名
     */
    @ApiModelProperty(value = "管理员姓名")
    private String employeeName;
    /**
     * 操作时间
     */
    @ApiModelProperty(value = "操作时间")
    private Date operateTime;
    /**
     * 操作状态
     */
    @ApiModelProperty(value = "操作状态")
    private String innerStatus;


}


