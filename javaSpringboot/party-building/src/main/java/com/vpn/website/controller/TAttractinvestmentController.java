package com.vpn.website.controller;


import com.vpn.website.client.model.TAttractinvestment;
import com.vpn.website.service.TAttractinvestmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 委托招商信息表 前端控制器
 * </p>
 *
 * @author fml
 * @since 2020-08-18
 */
@Api(tags = "目标机构")
@RestController
@RequestMapping("/tAttractinvestment")
public class TAttractinvestmentController {
    @Autowired
    TAttractinvestmentService tAttractinvestmentService;

    @ApiOperation(value = "获取目标机构名字", notes = "获取目标机构名字")
    @PostMapping("/listTAttractinvestment")
    public List<TAttractinvestment> getTAttractinvestment() {
        return tAttractinvestmentService.getTargetOrganizations();
    }
}

