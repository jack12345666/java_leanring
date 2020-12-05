package com.vpn.website.client.query;

import com.vpn.website.client.model.TEmployeerole;
import com.vpn.website.client.model.TVenue;
import com.vpn.website.common.annotation.MyQuery;
import com.vpn.website.common.base.BasePageQuery;
import com.vpn.website.common.base.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author fml
 * @date 2020/8/16 18:37
 */
@Data
public class TEmployeeroleQuery extends BasePageQuery {
    @ApiModelProperty(value = "员工序号")
    @MyQuery(value = BaseQuery.eq,column = TEmployeerole.COL_EMPLOYEE)
    private Integer employee;

    @ApiModelProperty(value = "角色序号")
    @MyQuery(value = BaseQuery.eq,column = TEmployeerole.COL_ROLE)
    private String role;


    @ApiModelProperty(value = "角色序号,模糊查询")
    @MyQuery(value = BaseQuery.like,column = TEmployeerole.COL_ROLE)
    private String roleLike;
}

