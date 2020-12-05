package com.vpn.website.controller;

import com.vpn.website.client.dto.TRolePermissionDTO;
import com.vpn.website.client.model.TRolepermission;
import com.vpn.website.client.query.TRolepermissionQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TRolepermissionService;
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
@Api(tags = "角色权限")
@RequestMapping("/rolepermission")
@RestController
public class TRolepermissionController {
    @Autowired
    TRolepermissionService tRolepermissionService;
    private static final Logger logger = LoggerFactory.getLogger(TRolepermissionController.class);

    @ApiOperation(value = "获取角色权限列表", notes = "获取角色权限列表")
    @PostMapping("/listRolepermission")
    public BaseResult list(TRolepermissionQuery query) {
        try {
            PageBean<TRolePermissionDTO> page = tRolepermissionService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "新增角色权限", notes = "新增角色权限")
    @PostMapping("/addRolepermission")
    public BaseResult addRolepermission(@Validated TRolepermission addDTO) {
        try {
            tRolepermissionService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "修改角色权限", notes = "修改角色权限")
    @PostMapping("/updateRolepermission")
    public BaseResult updateRolepermission(@Validated TRolepermission tRolepermission) {
        try {
            tRolepermissionService.updateById(tRolepermission);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除角色权限", notes = "删除角色权限")
    @PostMapping("/deleteRolepermission")
    public BaseResult deleteTVenue(@RequestParam Integer id) {
        try {
            tRolepermissionService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找角色权限", notes = "根据id查找角色权限")
    @PostMapping("/findByIdRolepermission")
    public BaseResult findByIdRolepermission(@RequestParam Integer id) {
        try {
            TRolepermission tRolepermission = tRolepermissionService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tRolepermission);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
