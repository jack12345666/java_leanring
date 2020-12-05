package com.vpn.website.controller;

import com.vpn.website.client.dto.TVenuelogDTO;
import com.vpn.website.client.model.TVenuelog;
import com.vpn.website.client.query.TVenuelogQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TVenuelogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 14:16
 */

@Api(tags = "场地日志")
@RequestMapping("/venuelog")
@RestController
public class TVenuelogController {
    @Autowired
    TVenuelogService tVenuelogService;
    private static final Logger logger = LoggerFactory.getLogger(TVenuelogController.class);

    @ApiOperation(value = "获取场地日志列表", notes = "获取场地日志列表")
    @PostMapping("/listTVenuelog")
    public BaseResult listTVenuelog(TVenuelogQuery query) {
        try {
            PageBean<TVenuelogDTO> page = tVenuelogService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }


    @ApiOperation(value = "新增场地日志", notes = "新增场地日志")
    @PostMapping("/addTVenuelog")
    public BaseResult addTVenuelog(@Validated TVenuelog addDTO) {
        try {
            tVenuelogService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }

    }

    @ApiOperation(value = "修改场地日志", notes = "修改场地日志")
    @PostMapping("/updateTVenuelog")
    public BaseResult updateTVenuelog(@Validated TVenuelog tVenuelog) {
        try {
            tVenuelogService.updateById(tVenuelog);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除场地日志", notes = "删除场地日志")
    @PostMapping("/deleteTVenuelog")
    public BaseResult deleteTVenuelog(@RequestParam Integer id) {
        try {
            tVenuelogService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找场地日志", notes = "根据id查找场地日志")
    @PostMapping("/findByIdTVenuelog")
    public BaseResult findByIdTVenuelog(@RequestParam Integer id) {
        try {
            TVenuelog tVenuelog = tVenuelogService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tVenuelog);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
