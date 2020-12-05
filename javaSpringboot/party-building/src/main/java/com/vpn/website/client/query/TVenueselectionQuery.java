package com.vpn.website.client.query;

import com.vpn.website.client.model.TVenueselection;
import com.vpn.website.common.annotation.MyQuery;
import com.vpn.website.common.base.BasePageQuery;
import com.vpn.website.common.base.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author fml
 * @date 2020/8/13 21:32
 */
@Data
public class TVenueselectionQuery extends BasePageQuery {
    @ApiModelProperty(value = "序号")
    @MyQuery(value = BaseQuery.eq,column = TVenueselection.COL_ID)
    private Integer id;

    @ApiModelProperty(value = "编号")
    @MyQuery(value = BaseQuery.eq,column = TVenueselection.COL_NO)
    private String no;

    @ApiModelProperty(value = "名称")
    @MyQuery(value = BaseQuery.eq,column = TVenueselection.COL_CONTACTNAME)
    private String contactname;

    @ApiModelProperty(value = "名称,模糊查询")
    @MyQuery(value = BaseQuery.like,column = TVenueselection.COL_CONTACTNAME)
    private String contactnamelike;
}
