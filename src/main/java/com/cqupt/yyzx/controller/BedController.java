package com.cqupt.yyzx.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cqupt.yyzx.pojo.Bed;
import com.cqupt.yyzx.service.BedService;
import com.cqupt.yyzx.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Bed前端控制器
 */

@RestController
@RequestMapping("/bed")
@Api(tags = "床位管理")
@CrossOrigin
public class BedController {
    @Autowired
    private BedService bedService;
    @GetMapping("/findbed")
    @ApiOperation("查询床位信息")
    public ResultVo<List<Bed>> findBed(Bed bed) throws Exception {
        QueryWrapper qw= new QueryWrapper();
        if(bed.getRoomNo()!=null){
            qw.eq("room_no",bed.getRoomNo());
        }
        if(bed.getBedStatus()!=null){
            qw.eq("bed_status",bed.getBedStatus());
        }
        return ResultVo.ok(bedService.list(qw));
    }
}
