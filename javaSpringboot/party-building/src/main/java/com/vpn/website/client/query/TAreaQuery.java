package com.vpn.website.client.query;

import com.vpn.website.client.model.TArea;
import com.vpn.website.common.annotation.MyQuery;
import com.vpn.website.common.base.BasePageQuery;
import com.vpn.website.common.base.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/18 14:46
 */
@Data
public class TAreaQuery extends BasePageQuery {
    @ApiModelProperty(value = "上级id")
    @MyQuery(value = BaseQuery.eq,column = TArea.COL_PARENTID)
    private String parentId;

    @ApiModelProperty(value = "名称")
    @MyQuery(value = BaseQuery.eq,column = TArea.COL_NAME)
    private String name;

    @ApiModelProperty(value = "名称,模糊查询")
    @MyQuery(value = BaseQuery.like,column = TArea.COL_NAME)
    private String nameLike;

    @ApiModelProperty(value = "类型 1代表省, 2代表市, 3代表区/县")
    @MyQuery(value = BaseQuery.eq,column = TArea.COL_LEVELTYPE)
    private Integer levelType;

    @ApiModelProperty(value = "合并名称")
    @MyQuery(value = BaseQuery.eq,column = TArea.COL_MERGERNAME)
    private String mergerName;

    @ApiModelProperty(value = "简称")
    @MyQuery(value = BaseQuery.eq,column = TArea.COL_SHORTNAME)
    private String shortName;
}
