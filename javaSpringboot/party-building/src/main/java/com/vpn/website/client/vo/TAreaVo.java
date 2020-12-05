package com.vpn.website.client.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class TAreaVo implements Serializable {

    @ApiModelProperty(value = "地区id")
    private String id;

    @ApiModelProperty(value = "名称")
    private String name;
}