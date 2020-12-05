package com.zqt.website.service;

import com.zqt.website.model.Ft0601Areainfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jack
 * @since 2020-10-15
 */
public interface Ft0601AreainfoService extends IService<Ft0601Areainfo> {
    List<Ft0601Areainfo> getName();
}
