package com.vpn.website.controller;

import com.vpn.website.client.dto.TEmployeeroleDTO;
import com.vpn.website.client.model.TEmployeerole;
import com.vpn.website.client.query.TEmployeeroleQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TEmployeeroleService;
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
@Api(tags = "员工权限")
@RequestMapping("/employeerole")
@RestController
public class TEmployeeroleController {
    @Autowired
    TEmployeeroleService tEmployeeroleService;
    private static final Logger logger = LoggerFactory.getLogger(TEmployeeroleController.class);

    @ApiOperation(value = "获取员工权限列表", notes = "获取员工权限列表")
    @PostMapping("/listEmployeerole ")
    public BaseResult list(TEmployeeroleQuery query) {
        try {
            PageBean<TEmployeeroleDTO> page = tEmployeeroleService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "新增员工权限", notes = "新增员工权限")
    @PostMapping("/addEmployeerole ")
    public BaseResult addEmployeerole(@Validated TEmployeerole addDTO) {
        try {
            tEmployeeroleService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "修改员工权限", notes = "修改员工权限")
    @PostMapping("/updateEmployeerole ")
    public BaseResult updateEmployeerole(@Validated TEmployeerole tEmployeerole) {
        try {
            tEmployeeroleService.updateById(tEmployeerole);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除员工权限", notes = "删除员工权限")
    @PostMapping("/deleteEmployeerole ")
    public BaseResult deleteEmployeerole(@RequestParam Integer id) {
        try {
            tEmployeeroleService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找", notes = "根据id查找")
    @PostMapping("/findByIdEmployeerole ")
    public BaseResult findByIdEmployeerole(@RequestParam Integer id) {
        try {
            TEmployeerole tEmployeerole = tEmployeeroleService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tEmployeerole);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
