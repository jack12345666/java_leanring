package com.vpn.website.controller;

import com.vpn.website.client.dto.TVenueselectionDTO;
import com.vpn.website.client.model.TVenueselection;
import com.vpn.website.client.query.TVenueselectionQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TVenueselectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author fml
 * @date 2020/8/13 21:52
 */
@Api(tags = "场地入选")
@RequestMapping("/venueselection")
@RestController
public class TVenueselectionController {
    @Autowired
    TVenueselectionService tVenueselectionService;
    private static final Logger logger = LoggerFactory.getLogger(TVenueselectionController.class);

    @ApiOperation(value = "获取场地入选列表", notes = "获取场地入选列表")
    @PostMapping("/listTVenueselection")
    public BaseResult listTVenueselection(TVenueselectionQuery query) {
        try {
            PageBean<TVenueselectionDTO> page = tVenueselectionService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }


    @ApiOperation(value = "新增场地入选", notes = "新增场地入选")
    @PostMapping("/addTVenueselection")
    public BaseResult addTVenueselection(@Validated TVenueselection addDTO) {
        try {
            tVenueselectionService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }

    }

    @ApiOperation(value = "修改场地入选", notes = "修改场地入选")
    @PostMapping("/updateTVenueselection")
    public BaseResult updateTVenueselection(@Validated TVenueselection tVenue) {
        try {
            tVenueselectionService.updateById(tVenue);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除场地入选", notes = "删除场地入选")
    @PostMapping("/deleteTVenueselection")
    public BaseResult deleteTVenueselection(@RequestParam Integer id) {
        try {
            tVenueselectionService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找入选", notes = "根据id查找入选")
    @PostMapping("/findByIdTVenueselection")
    public BaseResult findByIdTVenueselection(@RequestParam Integer id) {
        try {
            TVenueselection tVenueselection = tVenueselectionService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tVenueselection);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
