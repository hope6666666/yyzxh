package com.cqupt.yyzx.controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cqupt.yyzx.dto.KhxxDTO;
import com.cqupt.yyzx.pojo.Customer;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.KhxxCustomerVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import com.cqupt.yyzx.service.CustomerService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * Customer前端控制器
 *
 */
@RestController
@RequestMapping("/customer")
//@Deprecated
@Api(tags = "客户管理")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @ApiOperation(value = "入住登记")
    @PostMapping("/rzdj")
    public ResultVo addCustomer(Customer customer) throws Exception {
        return customerService.addCustomer(customer);
    }

    @ApiOperation("客户信息动态查询（分页）")
    @GetMapping("/listKhxxPage")
    public ResultVo<Page<KhxxCustomerVo>> listKhxxPage(KhxxDTO khxxDTO) throws Exception {
        return customerService.khxxFindCustomer(khxxDTO);
    }

    @ApiOperation("根据key删除客户信息")
    @GetMapping("/remove")

    public ResultVo remove(Integer id,Integer bedId) throws Exception {
        return customerService.removeCustomer(id,bedId);
    }

    @ApiOperation("编辑客户信息")
    @PostMapping("/editKhxx")
    public ResultVo editKhxx(Customer customer) throws Exception {
        return customerService.editCustomer(customer);
    }

}
