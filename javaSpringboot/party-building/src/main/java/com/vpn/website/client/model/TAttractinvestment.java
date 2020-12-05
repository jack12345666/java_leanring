package com.vpn.website.client.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 委托招商信息表
 * </p>
 *
 * @author fml
 * @since 2020-08-18
 */
@ApiModel(value = "com-vpn-website-client-model-TAttractinvestment")
@Data
@TableName(value = "t_attractinvestment")
public class TAttractinvestment {

    /**
     * 序号
     */
    @ApiModelProperty(value = "序号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    @TableField("no")
    private String no;
    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称")
    @TableField("name")
    private String name;
    /**
     * 国别编号
     */
    @ApiModelProperty(value = "国别编号")
    @TableField("nationId")
    private String nationId;
    /**
     * 国别名称
     */
    @ApiModelProperty(value = "国别名称")
    @TableField("nationName")
    private String nationName;
    /**
     * 省份编号
     */
    @ApiModelProperty(value = "省份编号")
    @TableField("provinceId")
    private String provinceId;
    /**
     * 省份名称
     */
    @ApiModelProperty(value = "省份名称")
    @TableField("provinceName")
    private String provinceName;
    /**
     * 城市编号
     */
    @ApiModelProperty(value = "城市编号")
    @TableField("cityId")
    private String cityId;
    /**
     * 城市名称
     */
    @ApiModelProperty(value = "城市名称")
    @TableField("cityName")
    private String cityName;
    /**
     * 区县编号
     */
    @ApiModelProperty(value = "区县编号")
    @TableField("countryId")
    private String countryId;
    /**
     * 区县名称
     */
    @ApiModelProperty(value = "区县名称")
    @TableField("countryName")
    private String countryName;
    /**
     * 场地类型编号（分号分割）
     */
    @ApiModelProperty(value = "场地类型编号（分号分割）")
    @TableField("siteCategoryIds")
    private String siteCategoryIds;
    /**
     * 场地类型名称（分号分割）
     */
    @ApiModelProperty(value = "场地类型名称（分号分割）")
    @TableField("siteCategoryNames")
    private String siteCategoryNames;
    /**
     * 面积区间
     */
    @ApiModelProperty(value = "面积区间")
    @TableField("areaSection")
    private String areaSection;
    /**
     * 行业编号（分号分割）
     */
    @ApiModelProperty(value = "行业编号（分号分割）")
    @TableField("industryIds")
    private String industryIds;
    /**
     * 行业名称（分号分割）
     */
    @ApiModelProperty(value = "行业名称（分号分割）")
    @TableField("industryNames")
    private String industryNames;
    /**
     * 目标机构（分号分割）
     */
    @ApiModelProperty(value = "目标机构（分号分割）")
    @TableField("targetOrganizations")
    private String targetOrganizations;
    /**
     * 委托方名称
     */
    @ApiModelProperty(value = "委托方名称")
    @TableField("clientName")
    private String clientName;
    /**
     * 联系人姓名
     */
    @ApiModelProperty(value = "联系人姓名")
    @TableField("contactName")
    private String contactName;
    /**
     * 联系人手机号码
     */
    @ApiModelProperty(value = "联系人手机号码")
    @TableField("contactMobile")
    private String contactMobile;
    /**
     * 联系人电子邮箱
     */
    @ApiModelProperty(value = "联系人电子邮箱")
    @TableField("contactEmail")
    private String contactEmail;
    /**
     * 联系人职位
     */
    @ApiModelProperty(value = "联系人职位")
    @TableField("contactPosition")
    private String contactPosition;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private Date createTime;
    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @TableField("updateTime")
    private Date updateTime;
    /**
     * 用户序号
     */
    @ApiModelProperty(value = "用户序号")
    @TableField("userId")
    private Integer userId;
    /**
     * 用户姓名
     */
    @ApiModelProperty(value = "用户姓名")
    @TableField("userName")
    private String userName;
    /**
     * 用户手机号码
     */
    @ApiModelProperty(value = "用户手机号码")
    @TableField("userMobile")
    private String userMobile;
    /**
     * 委托状态
     */
    @ApiModelProperty(value = "委托状态")
    @TableField("outerStatus")
    private String outerStatus;
    /**
     * 管理员序号
     */
    @ApiModelProperty(value = "管理员序号")
    @TableField("employeeId")
    private Integer employeeId;
    /**
     * 管理员姓名
     */
    @ApiModelProperty(value = "管理员姓名")
    @TableField("employeeName")
    private String employeeName;
    /**
     * 操作时间
     */
    @ApiModelProperty(value = "操作时间")
    @TableField("operateTime")
    private Date operateTime;
    /**
     * 操作状态
     */
    @ApiModelProperty(value = "操作状态")
    @TableField("innerStatus")
    private String innerStatus;


    public static final String COL_ID = "id";

    public static final String COL_NO = "no";

    public static final String COL_NAME = "name";

    public static final String COL_NATIONID = "nationId";

    public static final String COL_NATIONNAME = "nationName";

    public static final String COL_PROVINCEID = "provinceId";

    public static final String COL_PROVINCENAME = "provinceName";

    public static final String COL_CITYID = "cityId";

    public static final String COL_CITYNAME = "cityName";

    public static final String COL_COUNTRYID = "countryId";

    public static final String COL_COUNTRYNAME = "countryName";

    public static final String COL_SITECATEGORYIDS = "siteCategoryIds";

    public static final String COL_SITECATEGORYNAMES = "siteCategoryNames";

    public static final String COL_AREASECTION = "areaSection";

    public static final String COL_INDUSTRYIDS = "industryIds";

    public static final String COL_INDUSTRYNAMES = "industryNames";

    public static final String COL_TARGETORGANIZATIONS = "targetOrganizations";

    public static final String COL_CLIENTNAME = "clientName";

    public static final String COL_CONTACTNAME = "contactName";

    public static final String COL_CONTACTMOBILE = "contactMobile";

    public static final String COL_CONTACTEMAIL = "contactEmail";

    public static final String COL_CONTACTPOSITION = "contactPosition";

    public static final String COL_CREATETIME = "createTime";

    public static final String COL_UPDATETIME = "updateTime";

    public static final String COL_USERID = "userId";

    public static final String COL_USERNAME = "userName";

    public static final String COL_USERMOBILE = "userMobile";

    public static final String COL_OUTERSTATUS = "outerStatus";

    public static final String COL_EMPLOYEEID = "employeeId";

    public static final String COL_EMPLOYEENAME = "employeeName";

    public static final String COL_OPERATETIM = "operateTime";

    public static final String COL_INNERSTATUS = "innerStatus";


}


