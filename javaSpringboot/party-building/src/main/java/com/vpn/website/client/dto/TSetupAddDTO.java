package com.vpn.website.client.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author fml
 * @date 2020/8/16 18:34
 */
@Data
public class TSetupAddDTO {
    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private String id;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 值
     */
    @ApiModelProperty(value = "值")
    private String setupValue;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String comment;
}
