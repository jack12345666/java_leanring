package com.vpn.website.controller;

import com.vpn.website.client.dto.TRoleDTO;
import com.vpn.website.client.model.TRole;
import com.vpn.website.client.query.TRoleQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TRoleService;
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
@Api(tags = "权限")
@RequestMapping("/role")
@RestController
public class TRoleController {
    @Autowired
    TRoleService tRoleService;
    private static final Logger logger = LoggerFactory.getLogger(TRoleController.class);

    @ApiOperation(value = "获取权限列表", notes = "获取权限列表")
    @PostMapping("/listRole")
    public BaseResult list(TRoleQuery query) {
        try {
            PageBean<TRoleDTO> page = tRoleService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }


    @ApiOperation(value = "新增权限", notes = "新增权限")
    @PostMapping("/addRole")
    public BaseResult addRole(@Validated TRole addDTO) {
        try {
            tRoleService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "修改权限", notes = "修改权限")
    @PostMapping("/updateRole")
    public BaseResult updateRole(@Validated TRole tRole) {
        try {
            tRoleService.updateById(tRole);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除权限", notes = "删除权限")
    @PostMapping("/deleteRole")
    public BaseResult deleteRole(@RequestParam Integer id) {
        try {
            tRoleService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找权限", notes = "根据id查找权限")
    @PostMapping("/findByIdRole")
    public BaseResult findByIdRole(@RequestParam Integer id) {
        try {
            TRole tRole = tRoleService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tRole);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
