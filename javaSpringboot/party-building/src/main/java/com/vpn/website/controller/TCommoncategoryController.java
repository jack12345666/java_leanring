package com.vpn.website.controller;

import com.vpn.website.client.dto.TCommoncategoryDTO;
import com.vpn.website.client.model.TCommoncategory;
import com.vpn.website.client.query.TCommoncategoryQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TCommoncategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author fml
 * @date 2020/8/16 19:20
 */
@Api(tags = "公共分类")
@RequestMapping("/commoncategory")
@RestController
public class TCommoncategoryController {
    @Autowired
    TCommoncategoryService tCommoncategoryService;
    private static final Logger logger = LoggerFactory.getLogger(TCommoncategoryController.class);

    @ApiOperation(value = "获取公共分类列表", notes = "获取公共分类列表")
    @PostMapping("/listCommoncategory")
    public BaseResult list(TCommoncategoryQuery query) {
        try {
            PageBean<TCommoncategoryDTO> page = tCommoncategoryService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "新增公共分类", notes = "新增公共分类")
    @PostMapping("/addCommoncategory")
    public BaseResult addCommoncategory(@Validated TCommoncategory addDTO) {
        try {
            tCommoncategoryService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "修改公共分类", notes = "修改公共分类")
    @PostMapping("/updateCommoncategory")
    public BaseResult updateCommoncategory(@Validated TCommoncategory tCommoncategory) {
        try {
            tCommoncategoryService.updateById(tCommoncategory);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除公共分类", notes = "删除公共分类")
    @PostMapping("/deleteCommoncategory")
    public BaseResult deleteCommoncategory(@RequestParam Integer id) {
        try {
            tCommoncategoryService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找", notes = "根据id查找")
    @PostMapping("/findByIdCommoncategory")
    public BaseResult findByIdCommoncategory(@RequestParam Integer id) {
        try {
            TCommoncategory tCommoncategory = tCommoncategoryService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tCommoncategory);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
