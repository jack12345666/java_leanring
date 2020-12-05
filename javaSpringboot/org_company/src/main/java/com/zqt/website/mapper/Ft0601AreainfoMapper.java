package com.zqt.website.mapper;

import com.zqt.website.model.Ft0601Areainfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jack
 * @since 2020-10-15
 */
public interface Ft0601AreainfoMapper extends BaseMapper<Ft0601Areainfo> {
    List<Ft0601Areainfo> getName();
}
