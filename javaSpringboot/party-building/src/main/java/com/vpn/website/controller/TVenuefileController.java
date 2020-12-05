package com.vpn.website.controller;

import com.vpn.website.client.dto.TVenuefileDTO;
import com.vpn.website.client.model.TVenuefile;
import com.vpn.website.client.query.TVenuefileQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TVenuefileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: fengmingliang
 * @Date: 2020/8/14 9:55
 */
@Api(tags = "场地附件")
@RequestMapping("/venuefile")
@RestController
public class TVenuefileController {
    @Autowired
    TVenuefileService tVenuefileService;
    private static final Logger logger = LoggerFactory.getLogger(TVenuefileController.class);

    @ApiOperation(value = "获取场地附件列表", notes = "获取场地附件列表")
    @PostMapping("/listTVenuefile")
    public BaseResult listTVenuefile(TVenuefileQuery query) {
        try {
            PageBean<TVenuefileDTO> page = tVenuefileService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }


    @ApiOperation(value = "新增场地附件", notes = "新增场地附件")
    @PostMapping("/addTVenuefile")
    public BaseResult addTVenuefile(@Validated TVenuefile addDTO) {
        try {
            tVenuefileService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");

        }
    }

    @ApiOperation(value = "修改场地附件", notes = "修改场地附件")
    @PostMapping("/updateTVenuefile")
    public BaseResult updateTVenuefile(@Validated TVenuefile tVenuefile) {
        try {
            tVenuefileService.updateById(tVenuefile);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除场地附件", notes = "删除场地附件")
    @PostMapping("/deleteTVenuefile")
    public BaseResult deleteTVenuefile(@RequestParam Integer id) {
        try {
            tVenuefileService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找场地附件", notes = "根据id查找场地附件")
    @PostMapping("/findByIdTVenuefile")
    public BaseResult findByIdTVenuefile(@RequestParam Integer id) {
        try {
            TVenuefile tVenuefile = tVenuefileService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tVenuefile);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
