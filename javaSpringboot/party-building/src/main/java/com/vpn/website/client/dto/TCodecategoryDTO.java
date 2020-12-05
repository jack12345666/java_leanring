package com.vpn.website.client.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/15 9:31
 */
@Data
public class TCodecategoryDTO {
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

