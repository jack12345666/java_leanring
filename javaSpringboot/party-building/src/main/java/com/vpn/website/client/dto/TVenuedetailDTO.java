package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author fml
 * @date 2020/8/13 21:18
 */
@Data
public class TVenuedetailDTO {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "序号")
    private Integer id;

    @ApiModelProperty(value = "编号")
    private String no;

    @ApiModelProperty(value = "场地序号")
    private Integer venue;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "简介")
    private String description;

    @ApiModelProperty(value = "封面图片路径")
    private String coverPicPath;

    @ApiModelProperty(value = "类型")
    private String category;

    @ApiModelProperty(value = "单价")
    private String price;

    @ApiModelProperty(value = "价格单位")
    private String priceUnit;

    @ApiModelProperty(value = "建筑面积")
    private Integer buildingArea;

    @ApiModelProperty(value = "建筑面积单位")
    private String buildingAreaUnit;

    @ApiModelProperty(value = "使用率")
    private String usageRate;

    @ApiModelProperty(value = "格局")
    private String structure;

    @ApiModelProperty(value = "月租金")
    private Integer monthRent;

    @ApiModelProperty(value = "工位数-低")
    private Integer workingPositionLow;

    @ApiModelProperty(value = "工位数-高")
    private Integer workingPositionHigh;

    @ApiModelProperty(value = "朝向")
    private String oriention;

    @ApiModelProperty(value = "免租日期")
    private String freeDays;

    @ApiModelProperty(value = "最短租期")
    private String shortestLease;

    @ApiModelProperty(value = "装修程度")
    private String fitments;

    @ApiModelProperty(value = "物业费用")
    private String propertyFee;

    @ApiModelProperty(value = "空调费用")
    private String airConditioningCost;

    @ApiModelProperty(value = "停车费用")
    private String parkingFee;

    @ApiModelProperty(value = "楼层信息")
    private String floorInfo;

    @ApiModelProperty(value = "地块位置")
    private String position;

    @ApiModelProperty(value = "用地性质")
    private String landUsage;

    @ApiModelProperty(value = "占地面积")
    private String floorArea;

    @ApiModelProperty(value = "占地面积单位")
    private String floorAreaUnit;

    @ApiModelProperty(value = "容积率")
    private String plotRatio;

    @ApiModelProperty(value = "楼幢编号")
    private String bulidingNo;

    @ApiModelProperty(value = "总楼层")
    private Integer totalFloor;

    @ApiModelProperty(value = "层高")
    private String floorHeight;

    @ApiModelProperty(value = "承重")
    private String loadBearing;

    @ApiModelProperty(value = "承重单位")
    private String loadBearingUnit;

    @ApiModelProperty(value = "厂房/仓库结构")
    private String millConstruction;

    @ApiModelProperty(value = "设计用途")
    private String bulidingUsage;

    @ApiModelProperty(value = "是否标准厂房/仓库")
    private String isStandard;

    @ApiModelProperty(value = "是否有电梯")
    private String existElevator;

    @ApiModelProperty(value = "用电情况")
    private String electricity;

    @ApiModelProperty(value = "空余面积")
    private Integer spareArea;

    @ApiModelProperty(value = "是否有自行车")
    private String bridgeCrane;

    @ApiModelProperty(value = "行车吨位")
    private String bridgeCraneTon;

    @ApiModelProperty(value = "是否自动更新")
    private String isAuto;

    @ApiModelProperty(value = "显示顺序")
    private Integer displayNo;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "编辑人序号")
    private Integer editorId;

    @ApiModelProperty(value = "编辑人姓名")
    private String editorName;

    @ApiModelProperty(value = "审核人序号")
    private Integer examinantId;

    @ApiModelProperty(value = "审核人姓名")
    private String examinantName;

    @ApiModelProperty(value = "审核时间")
    private Date examTime;

    @ApiModelProperty(value = "状态")
    private String status;
}

