package com.vpn.website.client.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author fml
 * @date 2020/8/16 18:13
 */
@Data
public class TCodecategoryAddDTO {
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
     * 前缀
     */
    @ApiModelProperty(value = "前缀")
    private String prefix;

    /**
     * 是否只读
     */
    @ApiModelProperty(value = "是否只读")
    private Integer isReadonly;

}
