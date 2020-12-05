package com.vpn.website.controller;

import com.vpn.website.client.dto.TVenueAddDTO;
import com.vpn.website.client.dto.TVenueDTO;
import com.vpn.website.client.model.TVenue;
import com.vpn.website.client.query.TVenueQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TVenueService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/13 10:59
 */
@Api(tags = "场地")
@RequestMapping("/venue")
@RestController
public class VenueController {
    @Autowired
    TVenueService tVenueService;
    private static final Logger logger = LoggerFactory.getLogger(VenueController.class);

    @ApiOperation(value = "获取场地列表", notes = "获取场地列表")
    @PostMapping("/listVenue")
    public BaseResult list(TVenueQuery query) {
        try {
            PageBean<TVenueDTO> page = tVenueService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }


    @ApiOperation(value = "新增场地", notes = "新增场地", response = BaseResult.class)
    @PostMapping("/addVenue")
    public BaseResult addTVenue(@Validated TVenue addDTO) {
        try {
            tVenueService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");

        }
    }

    @ApiOperation(value = "修改场地", notes = "修改场地")
    @PostMapping("/updateVenue")
    public BaseResult updateTVenue(@Validated TVenue tVenue) {
        try {
            tVenueService.updateById(tVenue);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }

    }

    @ApiOperation(value = "删除场地", notes = "删除场地")
    @PostMapping("/deleteVenue")
    public BaseResult deleteTVenue(@RequestParam Integer id) {
        try {
            tVenueService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }


    @ApiOperation(value = "根据id查找", notes = "根据id查找")
    @PostMapping("/findByIdVenue")
    public BaseResult findByIdVenue(@RequestParam Integer id) {
        try {
            TVenue tVenue = tVenueService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tVenue);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "城市名称集合", notes = "城市名称集合")
    @PostMapping("/getCountryName")
    public BaseResult getCountryName(Integer countryId) {
        List<TVenue> countryName = tVenueService.getCountryName(countryId);
        List<Object> list = new ArrayList<>();
        list.add(countryName);
        return BaseResult.initSuccessResult("操作成功",list);
    }
}

