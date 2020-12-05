package com.vpn.website.client.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 地铁信息表
 * </p>
 *
 * @author fml
 * @since 2020-08-18
 */
@Data
public class TMetro implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 上级序号
     */
    @TableField("parentId")
    private Integer parentId;
    /**
     * 层级
     */
    @TableField("levelType")
    private Integer levelType;
    /**
     * 区域编号
     */
    @TableField("areaId")
    private String areaId;
    /**
     * 显示顺序
     */
    @TableField("displayNo")
    private Integer displayNo;
    /**
     * 是否显示
     */
    @TableField("isShown")
    private Integer isShown;
    /**
     * 是否有效
     */
    @TableField("isValid")
    private Integer isValid;
    /**
     * 外部来源
     */
    @TableField("foreignSource")
    private String foreignSource;
    /**
     * 外部编号
     */
    @TableField("foreignId")
    private String foreignId;
    /**
     * 外部上级编号
     */
    @TableField("foreignParentId")
    private String foreignParentId;

}
