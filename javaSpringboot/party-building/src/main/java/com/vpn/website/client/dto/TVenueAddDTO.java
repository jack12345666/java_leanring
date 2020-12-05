package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/13 10:45
 */

@Data
public class TVenueAddDTO {
//    @ApiModelProperty(value = "序号")
//    private Integer id;

    @ApiModelProperty(value = "编号")
    @NotEmpty(message = "'编号'不能为空")
    private String no;

    @ApiModelProperty(value = "上级序号")
    private Integer parentId;

    @ApiModelProperty(value = "外部来源")
    private String foreignSource;

    @ApiModelProperty(value = "外部编号")
    private String foreignId;

    @ApiModelProperty(value = "名称")
//    @NotEmpty(message = "'名称'不能为空")
    private String name;

    @ApiModelProperty(value = "简介")
    private String description;

    @ApiModelProperty(value = "场地类型编号")
    private String categoryId;

    @ApiModelProperty(value = "场地类型名称")
    private String categoryName;

    @ApiModelProperty(value = "省份编号",required = true)
//    @NotNull(message = "'省份编号'不能为空")
    private String provinceId;

    @ApiModelProperty(value = "省份名称")
    private String provinceName;

    @ApiModelProperty(value = "城市编号",required = true)
//    @NotNull(message = "'城市编号'不能为空")
    private String cityId;

    @ApiModelProperty(value = "城市名称")
    private String cityName;

    @ApiModelProperty(value = "区县编号",required = true)
//    @NotNull(message = "'区县编号'不能为空")
    private String countryId;

    @ApiModelProperty(value = "区县名称")
    private String countryName;

    @ApiModelProperty(value = "街道/商圈/平台编号",required = true)
//    @NotNull(message = "'街道/商圈/平台编号'不能为空")
    private String districtId;

    @ApiModelProperty(value = "街道/商圈/平台名称")
    private String districtName;

    @ApiModelProperty(value = "经度")
    private BigDecimal lng;

    @ApiModelProperty(value = "纬度")
    private BigDecimal lat;

    @ApiModelProperty(value = "封面图片路径")
    private String coverPicPath;

    @ApiModelProperty(value = "地铁线")
    private String metroLines;

    @ApiModelProperty(value = "地铁站")
    private String metroStations;

    @ApiModelProperty(value = "地铁信息")
    private String metroInfo;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "竣工时间")
    private String completionDate;

    @ApiModelProperty(value = "层高")
    private BigDecimal floorHeight;

    @ApiModelProperty(value = "层高说明")
    private String floorHeightInfo;

    @ApiModelProperty(value = "地面层数")
    private Integer groundFloors;

    @ApiModelProperty(value = "地下层数")
    private Integer undergroundFloors;

    @ApiModelProperty(value = "其他楼层信息")
    private String otherFloorsInfo;

    @ApiModelProperty(value = "物业管理公司")
    private String propertyManagementCompany;

    @ApiModelProperty(value = "物业费用")
    private BigDecimal propertyFee;

    @ApiModelProperty(value = "物业费用说明")
    private String propertyFeeInfo;

    @ApiModelProperty(value = "车位数")
    private String parkingSpace;

    @ApiModelProperty(value = "车位费")
    private String parkingFee;

    @ApiModelProperty(value = "空调情况")
    private String airConditioner;

    @ApiModelProperty(value = "空调费")
    private String airConditioningCost;

    @ApiModelProperty(value = "空调开放时间")
    private String airConditionedTime;

    @ApiModelProperty(value = "电梯情况")
    private String elevator;

    @ApiModelProperty(value = "网络情况")
    private String networks;

    @ApiModelProperty(value = "入住机构")
    private String settledOrganization;

    @ApiModelProperty(value = "装修风格")
    private String style;

    @ApiModelProperty(value = "前台信息")
    private String frontDesk;

    @ApiModelProperty(value = "会议室情况")
    private String meetingRoom;

    @ApiModelProperty(value = "基础服务")
    private String basicService;

    @ApiModelProperty(value = "特色服务")
    private String featureService;

    @ApiModelProperty(value = "创业服务")
    private String businessService;

    @ApiModelProperty(value = "是否热门")
    private Integer isHot;

    @ApiModelProperty(value = "是否新上")
    private Integer isNew;

    @ApiModelProperty(value = "是否自动更新")
    private Integer isAuto;

    @ApiModelProperty(value = "排序")
    private BigDecimal rank;

    @ApiModelProperty(value = "顾问序号")
    private Integer counselorId;

    @ApiModelProperty(value = "顾问姓名")
    private String counselorName;

    @ApiModelProperty(value = "顾问得分")
    private BigDecimal counselorScore;

    @ApiModelProperty(value = "顾问评分人次")
    private Integer counselorScorePerson;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "编辑人序号",required = true)
//    @NotNull(message = "'编辑人序号'不能为空")
    private Integer editorId;

    @ApiModelProperty(value = "编辑人姓名")
    private String editorName;

    @ApiModelProperty(value = "审核人序号",required = true)
//    @NotNull(message = "'审核人序号'不能为空")
    private Integer examinantId;

    @ApiModelProperty(value = "审核人姓名")
    private String examinantName;

    @ApiModelProperty(value = "审核时间")
    private Date examTime;

    @ApiModelProperty(value = "状态",required = true)
//    @NotNull(message = "'状态'不能为空")
    private String status;

}
