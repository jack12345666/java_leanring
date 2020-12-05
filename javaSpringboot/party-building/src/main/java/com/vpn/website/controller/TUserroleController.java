package com.vpn.website.controller;

import com.vpn.website.client.dto.TUserRoleDTO;
import com.vpn.website.client.dto.TVenueDTO;
import com.vpn.website.client.model.TUserrole;
import com.vpn.website.client.query.TUserroleQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TUserroleService;
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
@Api(tags = "用户权限")
@RequestMapping("/userrole")
@RestController
public class TUserroleController {
    @Autowired
    TUserroleService tUserroleService;
    private static final Logger logger = LoggerFactory.getLogger(TUserroleController.class);

    @ApiOperation(value = "获取用户权限", notes = "获取用户权限")
    @PostMapping("/listUserrol")
    public BaseResult list(TUserroleQuery query) {
        try {
            PageBean<TUserRoleDTO> page = tUserroleService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }


    @ApiOperation(value = "新增用户权限", notes = "新增用户权限")
    @PostMapping("/addUserrole")
    public BaseResult addUserrole(@Validated TUserrole addDTO) {
        try {
            tUserroleService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "修改用户权限", notes = "修改用户权限")
    @PostMapping("/updateUserrole")
    public BaseResult updateUserrole(@Validated TUserrole tVenue) {
        tUserroleService.updateById(tVenue);
        try {
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除用户权限", notes = "删除用户权限")
    @PostMapping("/deleteUserrole")
    public BaseResult deleteUserrole(@RequestParam Integer id) {
        try {
            tUserroleService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }

    }

    @ApiOperation(value = "根据id查找", notes = "根据id查找")
    @PostMapping("/findByIdUserrole")
    public BaseResult findByIdUserrole(@RequestParam Integer id) {
        try {
            TUserrole tUserrole = tUserroleService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tUserrole);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
