package com.vpn.website.controller;

import com.vpn.website.client.dto.TCodeDTO;
import com.vpn.website.client.model.TCode;
import com.vpn.website.client.query.TCodeQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TCodeService;
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
@Api(tags = "编码")
@RequestMapping("/code")
@RestController
public class TCodeController {
    @Autowired
    TCodeService tCodeService;
    private static final Logger logger = LoggerFactory.getLogger(TCodeController.class);

    @ApiOperation(value = "获取编码列表", notes = "获取编码列表")
    @PostMapping("/listCode")
    public BaseResult list(TCodeQuery query) {
        try {
            PageBean<TCodeDTO> page = tCodeService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "test接口", notes = "test")
    @GetMapping("/test")
    public BaseResult test() {
        return  BaseResult.initFailResult("操作失败");
    }


    @ApiOperation(value = "新增编码", notes = "新增编码")
    @PostMapping("/addCode")
    public BaseResult addCode(@Validated TCode addDTO) {
        try {
            tCodeService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "修改编码", notes = "修改编码")
    @PostMapping("/updateCode")
    public BaseResult updateCode(@Validated TCode tCode) {
        try {
            tCodeService.updateById(tCode);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除编码", notes = "删除编码")
    @PostMapping("/deleteCode")
    public BaseResult deleteCode(@RequestParam Integer id) {
        try {
            tCodeService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找", notes = "根据id查找")
    @PostMapping("/findByIdCode")
    public BaseResult findByIdCode(@RequestParam Integer id) {
        try {
            TCode tCode = tCodeService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tCode);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
