package com.cqupt.yyzx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.yyzx.dto.CustomerPreferenceDTO;
import com.cqupt.yyzx.pojo.Customerpreference;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.CustomerPreferenceVo;

public interface CustomerpreferenceService extends  IService<Customerpreference>{

    ResultVo<Page<CustomerPreferenceVo>> listCustomerPreferenceVoPage(CustomerPreferenceDTO customerPreferenceDTO) throws Exception;

}
