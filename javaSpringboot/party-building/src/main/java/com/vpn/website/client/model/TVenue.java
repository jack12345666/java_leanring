package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value = "com-vpn-website-client-model-TVenue")
@Data
@TableName(value = "t_venue")
public class TVenue implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "序号")
    private Integer id;

    @TableField(value = "no")
    @ApiModelProperty(value = "编号")
    private String no;

    @TableField(value = "parentId")
    @ApiModelProperty(value = "上级序号")
    private Integer parentId;

    @TableField(value = "foreignSource")
    @ApiModelProperty(value = "外部来源")
    private String foreignSource;

    @TableField(value = "foreignId")
    @ApiModelProperty(value = "外部编号")
    private String foreignId;

    @TableField(value = "name")
    @ApiModelProperty(value = "名称")
    private String name;

    @TableField(value = "description")
    @ApiModelProperty(value = "简介")
    private String description;

    @TableField(value = "categoryId")
    @ApiModelProperty(value = "场地类型编号")
    private String categoryId;

    @TableField(value = "categoryName")
    @ApiModelProperty(value = "场地类型名称")
    private String categoryName;

    @TableField(value = "provinceId")
    @ApiModelProperty(value = "省份编号")
    private String provinceId;

    @TableField(value = "provinceName")
    @ApiModelProperty(value = "省份名称")
    private String provinceName;

    @TableField(value = "cityId")
    @ApiModelProperty(value = "城市编号")
    private String cityId;

    @TableField(value = "cityName")
    @ApiModelProperty(value = "城市名称")
    private String cityName;

    @TableField(value = "countryId")
    @ApiModelProperty(value = "区县编号")
    private String countryId;

    @TableField(value = "countryName")
    @ApiModelProperty(value = "区县名称")
    private String countryName;

    @TableField(value = "districtId")
    @ApiModelProperty(value = "街道/商圈/平台编号")
    private String districtId;

    @TableField(value = "districtName")
    @ApiModelProperty(value = "街道/商圈/平台名称")
    private String districtName;

    @TableField(value = "lng")
    @ApiModelProperty(value = "经度")
    private BigDecimal lng;

    @TableField(value = "lat")
    @ApiModelProperty(value = "纬度")
    private BigDecimal lat;

    @TableField(value = "coverPicPath")
    @ApiModelProperty(value = "封面图片路径")
    private String coverPicPath;

    @TableField(value = "metroLines")
    @ApiModelProperty(value = "地铁线")
    private String metroLines;

    @TableField(value = "metroStations")
    @ApiModelProperty(value = "地铁站")
    private String metroStations;

    @TableField(value = "metroInfo")
    @ApiModelProperty(value = "地铁信息")
    private String metroInfo;

    @TableField(value = "address")
    @ApiModelProperty(value = "地址")
    private String address;

    @TableField(value = "completionDate")
    @ApiModelProperty(value = "竣工时间")
    private String completionDate;

    @TableField(value = "floorHeight")
    @ApiModelProperty(value = "层高")
    private BigDecimal floorHeight;

    @TableField(value = "floorHeightInfo")
    @ApiModelProperty(value = "层高说明")
    private String floorHeightInfo;

    @TableField(value = "groundFloors")
    @ApiModelProperty(value = "地面层数")
    private Integer groundFloors;

    @TableField(value = "undergroundFloors")
    @ApiModelProperty(value = "地下层数")
    private Integer undergroundFloors;

    @TableField(value = "otherFloorsInfo")
    @ApiModelProperty(value = "其他楼层信息")
    private String otherFloorsInfo;

    @TableField(value = "propertyManagementCompany")
    @ApiModelProperty(value = "物业管理公司")
    private String propertyManagementCompany;

    @TableField(value = "propertyFee")
    @ApiModelProperty(value = "物业费用")
    private BigDecimal propertyFee;

    @TableField(value = "propertyFeeInfo")
    @ApiModelProperty(value = "物业费用说明")
    private String propertyFeeInfo;

    @TableField(value = "parkingSpace")
    @ApiModelProperty(value = "车位数")
    private String parkingSpace;

    @TableField(value = "parkingFee")
    @ApiModelProperty(value = "车位费")
    private String parkingFee;

    @TableField(value = "airConditioner")
    @ApiModelProperty(value = "空调情况")
    private String airConditioner;

    @TableField(value = "airConditioningCost")
    @ApiModelProperty(value = "空调费")
    private String airConditioningCost;

    @TableField(value = "airConditionedTime")
    @ApiModelProperty(value = "空调开放时间")
    private String airConditionedTime;

    @TableField(value = "elevator")
    @ApiModelProperty(value = "电梯情况")
    private String elevator;

    @TableField(value = "networks")
    @ApiModelProperty(value = "网络情况")
    private String networks;

    @TableField(value = "settledOrganization")
    @ApiModelProperty(value = "入住机构")
    private String settledOrganization;

    @TableField(value = "style")
    @ApiModelProperty(value = "装修风格")
    private String style;

    @TableField(value = "frontDesk")
    @ApiModelProperty(value = "前台信息")
    private String frontDesk;

    @TableField(value = "meetingRoom")
    @ApiModelProperty(value = "会议室情况")
    private String meetingRoom;

    @TableField(value = "basicService")
    @ApiModelProperty(value = "基础服务")
    private String basicService;

    @TableField(value = "featureService")
    @ApiModelProperty(value = "特色服务")
    private String featureService;

    @TableField(value = "businessService")
    @ApiModelProperty(value = "创业服务")
    private String businessService;

    @TableField(value = "isHot")
    @ApiModelProperty(value = "是否热门")
    private Integer isHot;

    @TableField(value = "isNew")
    @ApiModelProperty(value = "是否新上")
    private Integer isNew;

    @TableField(value = "isAuto")
    @ApiModelProperty(value = "是否自动更新")
    private Integer isAuto;

    @TableField(value = "rank")
    @ApiModelProperty(value = "排序")
    private BigDecimal rank;

    @TableField(value = "counselorId")
    @ApiModelProperty(value = "顾问序号")
    private Integer counselorId;

    @TableField(value = "counselorName")
    @ApiModelProperty(value = "顾问姓名")
    private String counselorName;

    @TableField(value = "counselorScore")
    @ApiModelProperty(value = "顾问得分")
    private BigDecimal counselorScore;

    @TableField(value = "counselorScorePerson")
    @ApiModelProperty(value = "顾问评分人次")
    private Integer counselorScorePerson;

  @TableField(value = "createTime", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

  @TableField(value = "updateTime", fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @TableField(value = "editorId")
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

  public static final String COL_PARENTID = "parentId";

  public static final String COL_FOREIGNSOURCE = "foreignSource";

  public static final String COL_FOREIGNID = "foreignId";

  public static final String COL_NAME = "name";

  public static final String COL_DESCRIPTION = "description";

  public static final String COL_CATEGORYID = "categoryId";

  public static final String COL_CATEGORYNAME = "categoryName";

  public static final String COL_PROVINCEID = "provinceId";

  public static final String COL_PROVINCENAME = "provinceName";

  public static final String COL_CITYID = "cityId";

  public static final String COL_CITYNAME = "cityName";

  public static final String COL_COUNTRYID = "countryId";

  public static final String COL_COUNTRYNAME = "countryName";

  public static final String COL_DISTRICTID = "districtId";

  public static final String COL_DISTRICTNAME = "districtName";

  public static final String COL_LNG = "lng";

  public static final String COL_LAT = "lat";

  public static final String COL_COVERPICPATH = "coverPicPath";

  public static final String COL_METROLINES = "metroLines";

  public static final String COL_METROSTATIONS = "metroStations";

  public static final String COL_METROINFO = "metroInfo";

  public static final String COL_ADDRESS = "address";

  public static final String COL_COMPLETIONDATE = "completionDate";

  public static final String COL_FLOORHEIGHT = "floorHeight";

  public static final String COL_FLOORHEIGHTINFO = "floorHeightInfo";

  public static final String COL_GROUNDFLOORS = "groundFloors";

  public static final String COL_UNDERGROUNDFLOORS = "undergroundFloors";

  public static final String COL_OTHERFLOORSINFO = "otherFloorsInfo";

  public static final String COL_PROPERTYMANAGEMENTCOMPANY = "propertyManagementCompany";

  public static final String COL_PROPERTYFEE = "propertyFee";

  public static final String COL_PROPERTYFEEINFO = "propertyFeeInfo";

  public static final String COL_PARKINGSPACE = "parkingSpace";

  public static final String COL_PARKINGFEE = "parkingFee";

  public static final String COL_AIRCONDITIONER = "airConditioner";

  public static final String COL_AIRCONDITIONINGCOST = "airConditioningCost";

  public static final String COL_AIRCONDITIONEDTIME = "airConditionedTime";

  public static final String COL_ELEVATOR = "elevator";

  public static final String COL_NETWORKS = "networks";

  public static final String COL_SETTLEDORGANIZATION = "settledorganization";

  public static final String COL_STYLE = "style";

  public static final String COL_FRONTDESK = "frontDesk";

  public static final String COL_MEETINGROOM = "meetingRoom";

  public static final String COL_BASICSERVICE = "basicService";

  public static final String COL_FEATURESERVICE = "featureService";

  public static final String COL_BUSINESSSERVICE = "businessService";

  public static final String COL_ISHOT = "isHot";

  public static final String COL_ISNEW = "isNew";

  public static final String COL_ISAUTO = "isAuto";

  public static final String COL_RANK = "rank";

  public static final String COL_COUNSELORID = "counselorId";

  public static final String COL_COUNSELORNAME = "counselorName";

  public static final String COL_COUNSELORSCORE = "counselorScore";

  public static final String COL_COUNSELORSCOREPERSON = "counselorScorePerson";

  public static final String COL_CREATETIME = "createTime";

  public static final String COL_UPDATETIME = "updateTime";

  public static final String COL_EDITORID = "editorId";

  public static final String COL_EDITORNAME = "editorName";

  public static final String COL_EXAMINANTID = "examinantId";

  public static final String COL_EXAMINANTNAME = "examinantName";

  public static final String COL_EXAMTIME = "examTime";

  public static final String COL_STATUS = "status";

}



