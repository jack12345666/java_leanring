package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 14:02
 */
@Data
public class TVenuelogAddDTO {

    @ApiModelProperty(value = "序号")
    private Integer id;

    @ApiModelProperty(value = "类型：1场地 2场地明细")
    private String type;

    @ApiModelProperty(value = "场地序号")
    private Integer venue;

    @ApiModelProperty(value = "场地明细序号")
    private Integer detail;

    @ApiModelProperty(value = "场地属性")
    private String data;

    @ApiModelProperty(value = "创建时间")
    private Date creatTime;

    @ApiModelProperty(value = "用户序号")
    private Integer editorId;

    @ApiModelProperty(value = "管理员序号")
    private Integer examinantId;

    @ApiModelProperty(value = "状态")
    private String status;

}
