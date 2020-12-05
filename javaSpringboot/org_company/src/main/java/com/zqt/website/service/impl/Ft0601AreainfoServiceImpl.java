package com.zqt.website.service.impl;

import com.zqt.website.model.Ft0601Areainfo;
import com.zqt.website.mapper.Ft0601AreainfoMapper;
import com.zqt.website.service.Ft0601AreainfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jack
 * @since 2020-10-15
 */
@Service
public class Ft0601AreainfoServiceImpl extends ServiceImpl<Ft0601AreainfoMapper, Ft0601Areainfo> implements Ft0601AreainfoService {

    @Autowired
    Ft0601AreainfoMapper ft0601AreainfoMapper;

    @Override
    public List<Ft0601Areainfo> getName() {
        return ft0601AreainfoMapper.getName();
    }
}
