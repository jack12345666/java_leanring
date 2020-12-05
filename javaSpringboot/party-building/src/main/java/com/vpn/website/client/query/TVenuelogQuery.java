package com.vpn.website.client.query;

import com.vpn.website.client.model.TVenuelog;
import com.vpn.website.common.annotation.MyQuery;
import com.vpn.website.common.base.BasePageQuery;
import com.vpn.website.common.base.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 14:07
 */
@Data
public class TVenuelogQuery extends BasePageQuery {
    @ApiModelProperty(value = "序号")
    @MyQuery(value = BaseQuery.eq,column = TVenuelog.COL_ID)
    private Integer id;

    @ApiModelProperty(value = "场地属性")
    @MyQuery(value = BaseQuery.eq,column = TVenuelog.COL_DATA)
    private String data;

    @ApiModelProperty(value = "场地属性,模糊查询")
    @MyQuery(value = BaseQuery.like,column = TVenuelog.COL_DATA)
    private String dataLike;


}
