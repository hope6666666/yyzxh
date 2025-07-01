package com.cqupt.yyzx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.yyzx.dto.CustomerNurseItemDTO;
import com.cqupt.yyzx.pojo.Customernurseitem;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.CustomerNurseItemVo;

import java.util.List;

public interface CustomernurseitemService extends  IService<Customernurseitem>{

    ResultVo addItemToCustomer( List<Customernurseitem> customernurseitems) throws Exception;

    ResultVo removeCustomerLevelAndItem(Integer levelId, Integer customerId) throws Exception;

    ResultVo<Page<CustomerNurseItemVo>> listCustomerItem(CustomerNurseItemDTO customerNurseItemDTO) throws Exception;

}
