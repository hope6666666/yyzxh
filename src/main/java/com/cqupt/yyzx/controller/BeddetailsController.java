package com.cqupt.yyzx.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cqupt.yyzx.dto.BedDetailsDTO;
import com.cqupt.yyzx.dto.ExchangeDTO;
import com.cqupt.yyzx.pojo.Beddetails;
import com.cqupt.yyzx.service.BeddetailsService;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.BedDetailsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Beddetails前端控制器
 */
@RestController
@RequestMapping("/beddetails")
@CrossOrigin
@Api(tags = "床位详情管理")
public class BeddetailsController {
    @Autowired
    private BeddetailsService beddetailsService;

    @GetMapping("/listBedDetailsVoPage")
    @ApiOperation("床位详情列表动态查询（分页）")
    public ResultVo<Page<BedDetailsVo>> listBedDetailsVoPage(BedDetailsDTO bedDetailsDTO) throws Exception {
        return beddetailsService.listBedDetailsVoPage(bedDetailsDTO);//运用了接口隔离原则
    }

    @PostMapping("/updateBedDetails")
    @ApiOperation("更新床位使用情况-只能修改床位使用结束时间")
    public ResultVo updateBedDetails(Beddetails beddetails)  throws Exception{
        beddetailsService.updateById(beddetails);
        return ResultVo.ok("编辑成功");
    }

    @PostMapping("/exchangeBed")
    @ApiOperation("床位调换")
    public ResultVo exchangeBed(ExchangeDTO exchangeDTO)  throws Exception{
        return beddetailsService.exchangeBed(exchangeDTO);
    }

    @GetMapping("/delBedDetails")
    @ApiOperation("删除记录")
    public ResultVo delBedDetails(Integer id)  throws Exception{
        beddetailsService.removeById(id);
        return ResultVo.ok("删除成功");
        
    }


}
