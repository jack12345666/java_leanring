package com.zqt.website.model;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jack
 * @since 2020-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Ft0601Areainfo对象", description="")
public class Ft0601Areainfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    private String id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "上级编号")
    @TableField("parentId")
    private String parentId;

    @ApiModelProperty(value = "层级")
    @TableField("levelType")
    private String levelType;

    @ApiModelProperty(value = "标准区域编号")
    @TableField("areaId")
    private String areaId;


}
