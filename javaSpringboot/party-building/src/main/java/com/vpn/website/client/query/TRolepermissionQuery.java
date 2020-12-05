package com.vpn.website.client.query;

import com.vpn.website.client.model.TRolepermission;
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
public class TRolepermissionQuery extends BasePageQuery {
    @ApiModelProperty(value = "角色序号")
    @MyQuery(value = BaseQuery.eq,column = TRolepermission.COL_ROLE)
    private Integer role;

    @ApiModelProperty(value = "权限编号")
    @MyQuery(value = BaseQuery.eq,column = TRolepermission.COL_PERMISSION)
    private String permission;


    @ApiModelProperty(value = "权限编号,权限编号查询")
    @MyQuery(value = BaseQuery.like,column = TRolepermission.COL_PERMISSION)
    private String permissionLike;
}
