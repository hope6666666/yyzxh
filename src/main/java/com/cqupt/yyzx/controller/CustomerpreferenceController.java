package com.cqupt.yyzx.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cqupt.yyzx.dto.CustomerPreferenceDTO;
import com.cqupt.yyzx.pojo.Customerpreference;
import com.cqupt.yyzx.service.CustomerpreferenceService;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.CustomerPreferenceVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Customerpreference前端控制器
 */

@RestController
@RequestMapping("/customerpreference")
@CrossOrigin
@Api(tags = "客户喜好管理")
public class CustomerpreferenceController {
    @Autowired
    private CustomerpreferenceService customerpreferenceService;

    @PostMapping("/addCustomerPreference")
    @ApiOperation("添加客户喜好")
    public ResultVo addCustomerpreference(Customerpreference customerpreference) throws Exception{
        customerpreferenceService.save(customerpreference);
        return ResultVo.ok("添加顾客喜好");
    }

    @PostMapping("/updateCustomerPreference")
    @ApiOperation("更新顾客喜好")
    public ResultVo updateCustomerpreference(Customerpreference customerpreference) throws Exception{
        customerpreferenceService.updateById(customerpreference);
        return ResultVo.ok("更新顾客喜好");
    }

    @GetMapping("/removeCustomerPreference")
    @ApiOperation("删除顾客喜好")
    public ResultVo removeCustomerpreference(Integer id) throws Exception{
        customerpreferenceService.removeById(id);
        return ResultVo.ok("删除顾客喜好");
    }

    @GetMapping("/listCustomerPreferencePage")
    @ApiOperation("顾客喜好查询（分页）/可以根据客户姓名查询")
    public ResultVo<Page<CustomerPreferenceVo>> listCustomerpreferencePage(CustomerPreferenceDTO customerPreferenceDTO) throws Exception{
        return customerpreferenceService.listCustomerPreferenceVoPage(customerPreferenceDTO);
    }


}
