package com.vpn.website.controller;

import com.vpn.website.client.dto.TSetupDTO;
import com.vpn.website.client.model.TSetup;
import com.vpn.website.client.query.TSetupQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TSetupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author fml
 * @date 2020/8/16 19:21
 */
@Api(tags = "设置")
@RequestMapping("/setup")
@RestController
public class TSetupController {
    @Autowired
    TSetupService tSetupService;
    private static final Logger logger = LoggerFactory.getLogger(TSetupController.class);

    @ApiOperation(value = "获取设置列表", notes = "获取设置列表")
    @PostMapping("/listSetup")
    public BaseResult list(TSetupQuery query) {
        try {
            PageBean<TSetupDTO> page = tSetupService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "新增设置", notes = "新增设置")
    @PostMapping("/addSetup")
    public BaseResult addSetup(@Validated TSetup addDTO) {
        try {
            tSetupService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "修改设置", notes = "修改设置")
    @PostMapping("/updateSetup")
    public BaseResult updateSetup(@Validated TSetup tSetup) {
        try {
            tSetupService.updateById(tSetup);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除设置", notes = "删除设置")
    @PostMapping("/deleteSetup")
    public BaseResult deleteSetup(@RequestParam Integer id) {
        try {
            tSetupService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找", notes = "根据id查找")
    @PostMapping("/findByIdSetup")
    public BaseResult findByIdSetup(@RequestParam Integer id) {
        try {
            TSetup tSetup = tSetupService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tSetup);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
