package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "com-vpn-website-client-model-TVenuedetail")
@Data
@TableName(value = "t_venuedetail")
public class TVenuedetail {

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "序号")
    private Integer id;

    @TableField(value = "no")
    @ApiModelProperty(value = "编号")
    private String no;

    @TableField(value = "venue")
    @ApiModelProperty(value = "场地序号")
    private Integer venue;

    @TableField(value = "name")
    @ApiModelProperty(value = "名称")
    private String name;

    @TableField(value = "description")
    @ApiModelProperty(value = "简介")
    private String description;

    @TableField(value = "coverPicPath")
    @ApiModelProperty(value = "封面图片路径")
    private String coverPicPath;

    @TableField(value = "category")
    @ApiModelProperty(value = "类型")
    private String category;

    @TableField(value = "price")
    @ApiModelProperty(value = "单价")
    private String price;

    @TableField(value = "priceUnit")
    @ApiModelProperty(value = "价格单位")
    private String priceUnit;

    @TableField(value = "buildingArea")
    @ApiModelProperty(value = "建筑面积")
    private Integer buildingArea;

    @TableField(value = "buildingAreaUnit")
    @ApiModelProperty(value = "建筑面积单位")
    private String buildingAreaUnit;

    @TableField(value = "usageRate")
    @ApiModelProperty(value = "使用率")
    private String usageRate;

    @TableField(value = "structure")
    @ApiModelProperty(value = "格局")
    private String structure;

    @TableField(value = "monthRent")
    @ApiModelProperty(value = "月租金")
    private Integer monthRent;

    @TableField(value = "workingPositionLow")
    @ApiModelProperty(value = "工位数-低")
    private Integer workingPositionLow;

    @TableField(value = "workingPositionHigh")
    @ApiModelProperty(value = "工位数-高")
    private Integer workingPositionHigh;

    @TableField(value = "oriention")
    @ApiModelProperty(value = "朝向")
    private String oriention;

    @TableField(value = "freeDays")
    @ApiModelProperty(value = "免租日期")
    private String freeDays;

    @TableField(value = "shortestLease")
    @ApiModelProperty(value = "最短租期")
    private String shortestLease;

    @TableField(value = "fitments")
    @ApiModelProperty(value = "装修程度")
    private String fitments;

    @TableField(value = "propertyFee")
    @ApiModelProperty(value = "物业费用")
    private String propertyFee;

    @TableField(value = "airConditioningCost")
    @ApiModelProperty(value = "空调费用")
    private String airConditioningCost;

    @TableField(value = "parkingFee")
    @ApiModelProperty(value = "停车费用")
    private String parkingFee;

    @TableField(value = "floorInfo")
    @ApiModelProperty(value = "楼层信息")
    private String floorInfo;

    @TableField(value = "position")
    @ApiModelProperty(value = "地块位置")
    private String position;

    @TableField(value = "landUsage")
    @ApiModelProperty(value = "用地性质")
    private String landUsage;

    @TableField(value = "floorArea")
    @ApiModelProperty(value = "占地面积")
    private String floorArea;

    @TableField(value = "floorAreaUnit")
    @ApiModelProperty(value = "占地面积单位")
    private String floorAreaUnit;

    @TableField(value = "plotRatio")
    @ApiModelProperty(value = "容积率")
    private String plotRatio;

    @TableField(value = "bulidingNo")
    @ApiModelProperty(value = "楼幢编号")
    private String bulidingNo;

    @TableField(value = "totalFloor")
    @ApiModelProperty(value = "总楼层")
    private Integer totalFloor;

    @TableField(value = "floorHeight")
    @ApiModelProperty(value = "层高")
    private String floorHeight;

    @TableField(value = "loadBearing")
    @ApiModelProperty(value = "承重")
    private String loadBearing;

    @TableField(value = "loadBearingUnit")
    @ApiModelProperty(value = "承重单位")
    private String loadBearingUnit;

    @TableField(value = "millConstruction")
    @ApiModelProperty(value = "厂房/仓库结构")
    private String millConstruction;

    @TableField(value = "bulidingUsage")
    @ApiModelProperty(value = "设计用途")
    private String bulidingUsage;

    @TableField(value = "isStandard")
    @ApiModelProperty(value = "是否标准厂房/仓库")
    private String isStandard;

    @TableField(value = "existElevator")
    @ApiModelProperty(value = "是否有电梯")
    private String existElevator;

    @TableField(value = "electricity")
    @ApiModelProperty(value = "用电情况")
    private String electricity;

    @TableField(value = "spareArea")
    @ApiModelProperty(value = "空余面积")
    private Integer spareArea;

    @TableField(value = "bridgeCrane")
    @ApiModelProperty(value = "是否有自行车")
    private String bridgeCrane;

    @TableField(value = "bridgeCraneTon")
    @ApiModelProperty(value = "行车吨位")
    private String bridgeCraneTon;

    @TableField(value = "isAuto")
    @ApiModelProperty(value = "是否自动更新")
    private String isAuto;

    @TableField(value = "displayNo")
    @ApiModelProperty(value = "显示顺序")
    private Integer displayNo;

    @TableField(value = "createTime", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @TableField(value = "updateTime", fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @TableField(value = "editorId", fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "编辑人序号")
    private Integer editorId;

    @TableField(value = "editorName")
    @ApiModelProperty(value = "编辑人姓名")
    private String editorName;

    @TableField(value = "examinantId")
    @ApiModelProperty(value = "审核人序号")
    private Integer examinantId;

    @TableField(value = "examinantName")
    @ApiModelProperty(value = "审核人姓名")
    private String examinantName;

    @TableField(value = "examTime")
    @ApiModelProperty(value = "审核时间")
    private Date examTime;

    @TableField(value = "status")
    @ApiModelProperty(value = "状态")
    private String status;


    public static final String COL_ID = "id";

    public static final String COL_NO = "no";

    public static final String COL_VENUE = "venue";

    public static final String COL_NAME = "name";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_COVERPICPATH = "coverPicPath";

    public static final String COL_CATEGORY = "category";

    public static final String COL_PRICE = "price";

    public static final String COL_PRICEUNIT = "priceUnit";

    public static final String COL_BUILDINGAREA = "buildingArea";

    public static final String COL_BUILDINGAREAUNIT = "buildingAreaUnit";

    public static final String COL_USAGERATE = "usageRate";

    public static final String COL_STRUCTURE = "structure";

    public static final String COL_MONTHRENT = "monthRent";

    public static final String COL_WORKINGPOSITIONLOW = "workingPositionLow";

    public static final String COL_WORKINGPOSITIONHIGH = "workingPositionHigh";

    public static final String COL_ORIENTION = "oriention";

    public static final String COL_FREEDAYS = "freeDays";

    public static final String COL_SHORTESTLEASE = "shortestLease";

    public static final String COL_FITMENTS = "fitments";

    public static final String COL_PROPERTYFEE = "propertyFee";

    public static final String COL_AIRCONDITIONINGCOST = "airConditioningCost";

    public static final String COL_PARKINGFEE = "parkingFee";

    public static final String COL_FLOORINFO = "floorInfo";

    public static final String COL_POSITION = "position";

    public static final String COL_LANDUSAGE = "landUsage";

    public static final String COL_FLOORAREA = "floorArea";

    public static final String COL_FLOORAREAUNIT = "floorAreaUnit";

    public static final String COL_PLOTRATIO = "plotRatio";

    public static final String COL_BULIDINGNO = "bulidingNo";

    public static final String COL_TOTALFLOOR = "totalFloor";

    public static final String COL_FLOORHEIGHT = "floorHeight";

    public static final String COL_LOADBEARING = "loadBearing";

    public static final String COL_LOADBEARINGUNIT = "loadBearingUnit";

    public static final String COL_MILLCONSTRUCTION = "millConstruction";

    public static final String COL_BULIDINGUSAGE = "bulidingUsage";

    public static final String COL_ISSTANDARD = "isStandard";

    public static final String COL_EXISTELEVATOR = "existElevator";

    public static final String COL_ELECTRICITY = "electricity";

    public static final String COL_SPAREAREA = "spareArea";

    public static final String COL_BRIDGECRANE = "bridgeCrane";

    public static final String COL_BRIDGECRANETON = "bridgeCraneTon";

    public static final String COL_ISAUTO = "isAuto";

    public static final String COL_DISPLAYNO = "displayNo";

    public static final String COL_CREATETIME = "createTime";

    public static final String COL_UPDATETIME = "updateTime";

    public static final String COL_EDITORID = "editorId";

    public static final String COL_EDITORNAME = "editorName";

    public static final String COL_EXAMINANTID = "examinantId";

    public static final String COL_EXAMINANTNAME = "examinantName";

    public static final String COL_EXAMTIME = "examTime";

    public static final String COL_STATUS = "status";


}