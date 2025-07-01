package com.cqupt.yyzx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.yyzx.dto.KhxxDTO;
import com.cqupt.yyzx.pojo.Customer;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.KhxxCustomerVo;

public interface CustomerService extends  IService<Customer>{

    ResultVo addCustomer(Customer customer) throws  Exception;

    ResultVo<Page<KhxxCustomerVo>> khxxFindCustomer(KhxxDTO khxxDTO) throws Exception;

    ResultVo removeCustomer(Integer id,Integer bedId) throws  Exception;

    ResultVo editCustomer(Customer customer) throws  Exception;
}
