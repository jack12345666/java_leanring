package com.vpn.website.client.model;


import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "com-vpn-website-client-model-TVenuelog")
@Data
@TableName(value = "t_venuelog")
public class TVenuelog {

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "序号")
    private Integer id;

    @TableField(value = "type")
    @ApiModelProperty(value = "类型：1场地 2场地明细")
    private String type;

    @TableField(value = "venue")
    @ApiModelProperty(value = "场地序号")
    private Integer venue;

    @TableField(value = "detail")
    @ApiModelProperty(value = "场地明细序号")
    private Integer detail;

    @TableField(value = "data")
    @ApiModelProperty(value = "场地属性")
    private String data;

    @TableField(value = "creatTime", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date creatTime;

    @TableField(value = "editorId")
    @ApiModelProperty(value = "用户序号")
    private Integer editorId;

    @TableField(value = "examinantId")
    @ApiModelProperty(value = "管理员序号")
    private Integer examinantId;

    @TableField(value = "status")
    @ApiModelProperty(value = "状态")
    private String status;


    public static final String COL_ID = "id";

    public static final String COL_TYPE = "type";

    public static final String COL_VENUE = "venue";

    public static final String COL_DETAIL = "detail";

    public static final String COL_DATA = "data";

    public static final String COL_CREATTIME = "creatTime";

    public static final String COL_EDITORID = "editorId";

    public static final String COL_EXAMINANTID = "examinantId";

    public static final String COL_STATUS = "status";


}
