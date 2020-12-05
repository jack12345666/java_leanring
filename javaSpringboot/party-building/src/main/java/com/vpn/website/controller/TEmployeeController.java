package com.vpn.website.controller;

import com.vpn.website.client.dto.TEmployeeDTO;
import com.vpn.website.client.model.TEmployee;
import com.vpn.website.client.query.TEmployeeQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TEmployeeService;
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
@Api(tags = "员工")
@RequestMapping("/employee")
@RestController
public class TEmployeeController {
    @Autowired
    TEmployeeService tEmployeeService;
    private static final Logger logger = LoggerFactory.getLogger(TEmployeeController.class);

    @ApiOperation(value = "获取员工列表", notes = "获取员工列表")
    @PostMapping("/listEmployee")
    public BaseResult list(TEmployeeQuery query) {
        try {
            PageBean<TEmployeeDTO> page = tEmployeeService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "新增员工", notes = "新增员工")
    @PostMapping("/addEmployee")
    public BaseResult addEmployee(@Validated TEmployee addDTO) {
        try {
            tEmployeeService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "修改员工", notes = "修改员工")
    @PostMapping("/updateEmployee")
    public BaseResult updateTEmployee(@Validated TEmployee tEmployee) {
        try {
            tEmployeeService.updateById(tEmployee);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除员工", notes = "删除员工")
    @PostMapping("/deleteEmployee")
    public BaseResult deleteEmployee(@RequestParam Integer id) {
        try {
            tEmployeeService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找", notes = "根据id查找")
    @PostMapping("/findByIdEmployee")
    public BaseResult findByIdEmployee(@RequestParam Integer id) {
        try {
            TEmployee employee = tEmployeeService.getById(id);
            return BaseResult.initSuccessResult("操作成功", employee);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
