package com.vpn.website.controller;

import com.vpn.website.client.dto.TCodecategoryDTO;
import com.vpn.website.client.model.TCodecategory;
import com.vpn.website.client.query.TCodecategoryQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TCodecategoryService;
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
@Api(tags = "编码类别")
@RequestMapping("/codecategory")
@RestController
public class TCodecategoryController {
    @Autowired
    TCodecategoryService tCodecategoryService;
    private static final Logger logger = LoggerFactory.getLogger(TCodecategoryController.class);

    @ApiOperation(value = "获取编码类别列表", notes = "获取编码类别列表")
    @PostMapping("/listCodecategory")
    public BaseResult list(TCodecategoryQuery query) {
        try {
            PageBean<TCodecategoryDTO> page = tCodecategoryService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "新增编码类别", notes = "新增编码类别")
    @PostMapping("/addCodecategory")
    public BaseResult addCodecategory(@Validated TCodecategory addDTO) {
        try {
            tCodecategoryService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "修改编码类别", notes = "修改编码类别")
    @PostMapping("/updateCodecategory")
    public BaseResult updateCodecategory(@Validated TCodecategory tCodecategory) {
        try {
            tCodecategoryService.updateById(tCodecategory);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除编码类别", notes = "删除编码类别")
    @PostMapping("/deleteCodecategory")
    public BaseResult deleteCodecategory(@RequestParam Integer id) {
        try {
            tCodecategoryService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找", notes = "根据id查找")
    @PostMapping("/findByIdCodecategory")
    public BaseResult findByIdCodecategory(@RequestParam Integer id) {
        try {
            TCodecategory tCodecategory = tCodecategoryService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tCodecategory);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
