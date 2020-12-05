package com.vpn.website.controller;

import com.vpn.website.client.dto.TUserDTO;
import com.vpn.website.client.model.TUser;
import com.vpn.website.client.query.TUserQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TUserService;
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
@Api(tags = "用户")
@RequestMapping("/user")
@RestController
public class TUserController {
    @Autowired
    TUserService tUserService;
    private static final Logger logger = LoggerFactory.getLogger(TUserController.class);

    @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
    @PostMapping("/listUser")
    public BaseResult list(TUserQuery query) {
        try {
            PageBean<TUserDTO> page = tUserService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "新增用户", notes = "新增用户")
    @PostMapping("/addUser")
    public BaseResult addUser(@Validated TUser addDTO) {
        try {
            tUserService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "修改用户", notes = "修改用户")
    @PostMapping("/updateUser")
    public BaseResult updateUser(@Validated TUser tVenue) {
        try {
            tUserService.updateById(tVenue);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除用户", notes = "删除用户")
    @PostMapping("/deleteUser")
    public BaseResult deleteUser(@RequestParam Integer id) {
        try {
            tUserService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找用户", notes = "根据id查找用户")
    @PostMapping("/findByIdUser")
    public BaseResult findByIdUser(@RequestParam Integer id) {
        try {
            TUser tUser = tUserService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tUser);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
