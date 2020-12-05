package com.vpn.website.client.query;

import com.vpn.website.client.model.TSetup;
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
public class TSetupQuery extends BasePageQuery {
    @ApiModelProperty(value = "序号")
    @MyQuery(value = BaseQuery.eq,column = TSetup.COL_ID)
    private Integer id;

    @ApiModelProperty(value = "名称")
    @MyQuery(value = BaseQuery.eq,column = TSetup.COL_NAME)
    private String name;

    @ApiModelProperty(value = "名称,模糊查询")
    @MyQuery(value = BaseQuery.like,column = TSetup.COL_NAME)
    private String nameLike;
}
