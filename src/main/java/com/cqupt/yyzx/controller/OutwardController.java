package com.cqupt.yyzx.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.cqupt.yyzx.dto.OutwardDTO;
import com.cqupt.yyzx.pojo.Outward;
import com.cqupt.yyzx.service.OutwardService;
import com.cqupt.yyzx.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Outward前端控制器
 *
 */
@RestController
@RequestMapping("/outward")
@CrossOrigin
@Api(tags = "外出管理")
public class OutwardController {
    @Autowired
    private OutwardService outwardService;
    @ApiOperation("查询外出记录")
    @PostMapping("/queryOutwardVo")
    public ResultVo queryOutwardVo(OutwardDTO outwardDTO) throws Exception {
        return outwardService.queryOutwardVo(outwardDTO);
    }

    @ApiOperation("添加外出审批")
    @PostMapping("/addOutward")
    public ResultVo addOutward(Outward outward)  throws Exception {
        outwardService.save(outward);
        return ResultVo.ok("添加成功");
    }

    @ApiOperation("审批外出审批")
    @PostMapping("/examineOutward")
    public ResultVo examineOutward(Outward outward) throws Exception {
        return outwardService.examineOutward(outward);
    }


    @ApiOperation("撤回外出申请")
    @PostMapping("/delOutward")
    public ResultVo delOutward(Integer id)  throws Exception {
        UpdateWrapper<Outward> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",id);
        updateWrapper.set("is_deleted",1);
        outwardService.update(updateWrapper);
        return ResultVo.ok("撤回成功");
    }


    @ApiOperation("登记回院时间")
    @PostMapping("/updateBackTime")
    public ResultVo updateBackTime(Outward outward)  throws Exception {
        UpdateWrapper<Outward> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",outward.getId());
        updateWrapper.set("actulreturntime",outward.getActualReturnTime());
        outwardService.update(updateWrapper);
        return ResultVo.ok("登记成功");
    }

}
