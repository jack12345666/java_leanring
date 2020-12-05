package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 投资计划信息表
 * </p>
 *
 * @author fml
 * @since 2020-08-18
 */

@Data
public class TInvestmentplan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 编号
     */
    private String no;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 项目摘要
     */
    private String digest;
    /**
     * 行业类型编号
     */
    @TableField("industryId")
    private String industryId;
    /**
     * 行业类型名称
     */
    @TableField("industryName")
    private String industryName;
    /**
     * 其他行业类型
     */
    @TableField("otherIndustry")
    private String otherIndustry;
    /**
     * 是否个人投资
     */
    @TableField("isPersonal")
    private Integer isPersonal;
    /**
     * 投资规模区间
     */
    @TableField("scaleSection")
    private String scaleSection;
    /**
     * 投资规模明细
     */
    @TableField("scaleDetail")
    private Integer scaleDetail;
    /**
     * 年销售额目标区间
     */
    @TableField("salesSection")
    private String salesSection;
    /**
     * 年销售额目标明细
     */
    @TableField("salesDetail")
    private Integer salesDetail;
    /**
     * 产品名称
     */
    @TableField("productName")
    private String productName;
    /**
     * 产品特点
     */
    @TableField("productFeature")
    private String productFeature;
    /**
     * 商业计划书等附件
     */
    private String attachment;
    /**
     * 联系人姓名
     */
    @TableField("contactName")
    private String contactName;
    /**
     * 联系人手机号码
     */
    @TableField("contactMobile")
    private String contactMobile;
    /**
     * 联系人电子邮箱
     */
    @TableField("contactEmail")
    private String contactEmail;
    /**
     * 创建时间
     */
    @TableField("createTime")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("updateTime")
    private Date updateTime;
    /**
     * 用户序号
     */
    @TableField("userId")
    private Integer userId;
    /**
     * 用户姓名
     */
    @TableField("userName")
    private String userName;
    /**
     * 用户手机号码
     */
    @TableField("userMobile")
    private String userMobile;
    /**
     * 投资计划状态
     */
    @TableField("outerStatus")
    private String outerStatus;
    /**
     * 管理员序号
     */
    @TableField("employeeId")
    private Integer employeeId;
    /**
     * 管理员姓名
     */
    @TableField("employeeName")
    private String employeeName;
    /**
     * 处理时间
     */
    @TableField("operateTime")
    private Date operateTime;
    /**
     * 处理状态
     */
    @TableField("innerStatus")
    private String innerStatus;


}
