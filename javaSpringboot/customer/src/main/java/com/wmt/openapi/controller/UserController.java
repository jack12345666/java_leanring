package com.wmt.openapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Random;

@Api(tags = "用户接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation("获取某条数据")
    @GetMapping()
    public UserVo findById(@ApiParam("用户id") @RequestParam Integer id) {
        Random rand = new Random();
        UserVo user = new UserVo();
        user.setId(id);
        String temp = "temp";
        user.setUsername(temp + id);
        user.setPassword(temp + id);
        user.setDeleted((byte) 0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        int n = rand.nextInt(2);
        user.setSex((byte) n);
        return user;
    }

//
//    @ApiOperation("单个用户查询，按userid查用户信息")
//    @PostMapping(value = "/user/create", produces = APPLICATION_JSON_UTF8_VALUE, consumes = APPLICATION_JSON_UTF8_VALUE)

}