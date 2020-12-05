package com.vpn.website.controller;

import com.vpn.website.client.dto.TVenuedetailDTO;
import com.vpn.website.client.model.TVenuedetail;
import com.vpn.website.client.query.TVenuedetailQuery;
import com.vpn.website.common.base.BaseResult;
import com.vpn.website.common.base.PageBean;
import com.vpn.website.service.TVenuedetailService;
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
@Api(tags = "场地细节")
@RequestMapping("/venuedetail")
@RestController
public class TVenuedetailController {
    @Autowired
    TVenuedetailService tVenuedetailService;
    private static final Logger logger = LoggerFactory.getLogger(TVenuedetailController.class);

    @ApiOperation(value = "获取场地细节列表", notes = "获取场地细节列表")
    @PostMapping("/listTVenuedetail")
    public BaseResult listTVenuedetail(TVenuedetailQuery query) {
        try {
            PageBean<TVenuedetailDTO> page = tVenuedetailService.listPage(query);
            return BaseResult.initSuccessResult(page);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "新增场地细节", notes = "新增场地细节")
    @PostMapping("/addTVenuedetail")
    public BaseResult addTVenuedetail(@Validated TVenuedetail addDTO) {
        try {
            tVenuedetailService.save(addDTO);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");

        }
    }

    @ApiOperation(value = "修改场地细节", notes = "修改场地细节")
    @PostMapping("/updateTVenuedetail")
    public BaseResult updateTVenuedetail(@Validated TVenuedetail tVenue) {
        try {
            tVenuedetailService.updateById(tVenue);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "删除场地细节", notes = "删除场地细节")
    @PostMapping("/deleteTVenuedetail")
    public BaseResult deleteTVenuedetail(@RequestParam Integer id) {
        try {
            tVenuedetailService.removeById(id);
            return BaseResult.initSuccessResult("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }

    @ApiOperation(value = "根据id查找细节", notes = "根据id查找细节")
    @PostMapping("/findByIdTVenuedetail")
    public BaseResult findByIdTVenuedetail(@RequestParam Integer id) {
        try {
            TVenuedetail tVenuedetail = tVenuedetailService.getById(id);
            return BaseResult.initSuccessResult("操作成功", tVenuedetail);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.initFailResult("操作失败");
        }
    }
}
