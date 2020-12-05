package com.vpn.website.client.query;

import com.vpn.website.client.model.TVenuefile;
import com.vpn.website.common.annotation.MyQuery;
import com.vpn.website.common.base.BasePageQuery;
import com.vpn.website.common.base.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 9:44
 */
@Data
public class TVenuefileQuery extends BasePageQuery {
    @ApiModelProperty(value = "序号")
    @MyQuery(value = BaseQuery.eq,column = TVenuefile.COL_ID)
    private Integer id;

    @ApiModelProperty(value = "编号")
    @MyQuery(value = BaseQuery.eq,column = TVenuefile.COL_VENUE)
    private String venue;

    @ApiModelProperty(value = "名称,模糊查询")
    @MyQuery(value = BaseQuery.like,column = TVenuefile.COL_VENUE)
    private String venueLike;
}
