package com.zqt.website.controller;


import com.zqt.website.common.base.BaseResult;
import com.zqt.website.model.Ft0601Areainfo;
import com.zqt.website.service.Ft0601AreainfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jack
 * @since 2020-10-15
 */
@Api(tags = "区域")
@RestController
@RequestMapping("/area")
public class Ft0601AreainfoController {

    @Autowired
    Ft0601AreainfoService ft0601AreainfoService;

    @ApiOperation(value = "获取区域列表name", notes = "获取区域列表name")
    @PostMapping("/listAreaName")
    public List<Ft0601Areainfo> listName() {
        return ft0601AreainfoService.getName();
    }
}

