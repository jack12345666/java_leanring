package com.vpn.website.controller;

import com.vpn.website.client.dto.TPermissionDTO;
import com.vpn.website.client.model.TPermission;
import com.vpn.website.client.query.TPermissionQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TPermissionService;
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
@Api(tags = "权限控制")
@RequestMapping("/permission")
@RestController
public class TPermissionController {
    @Autowired
    TPermissionService tPermissionService;
    private static final Logger logger = LoggerFactory.getLogger(TPermissionController.class);

    @ApiOperation(value = "获取权限控制列表", notes = "获取权限控制列表")
    @PostMapping("/listPermission")
    public BaseResult list(TPermissionQuery query) {
        try {
            PageBean<TPermissionDTO> page = tPermissionService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }


    @ApiOperation(value = "新增权限控制", notes = "新增权限控制")
    @PostMapping("/addPermission")
    public BaseResult addPermission(@Validated TPermission addDTO) {
        try {
            tPermissionService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "修改权限控制", notes = "修改权限控制")
    @PostMapping("/updatePermission")
    public BaseResult updatePermission(@Validated TPermission tPermission) {
        try {
            tPermissionService.updateById(tPermission);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除权限控制", notes = "删除权限控制")
    @PostMapping("/deletePermission")
    public BaseResult deletePermission(@RequestParam Integer id) {
        try {
            tPermissionService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找", notes = "根据id查找")
    @PostMapping("/findByIdPermission")
    public BaseResult findByIdPermission(@RequestParam Integer id) {
        try {
            TPermission tPermission = tPermissionService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tPermission);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
