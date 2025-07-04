package com.cqupt.yyzx.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqupt.yyzx.dto.CustomerPreferenceDTO;
import com.cqupt.yyzx.mapper.CustomerpreferenceMapper;
import com.cqupt.yyzx.pojo.Customerpreference;
import com.cqupt.yyzx.service.CustomerpreferenceService;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.CustomerPreferenceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * CustomerpreferenceServiceImpl 实现类
 */
@Service
public class CustomerpreferenceServiceImpl extends ServiceImpl <CustomerpreferenceMapper, Customerpreference> implements CustomerpreferenceService
{
    @Autowired
    //   @Resource
    private CustomerpreferenceMapper customerpreferenceMapper;

    @Override
    public ResultVo<Page<CustomerPreferenceVo>> listCustomerPreferenceVoPage(CustomerPreferenceDTO customerPreferenceDTO) throws Exception{

        Page<CustomerPreferenceVo> page = new Page<>(customerPreferenceDTO.getPageSize(),6);
        customerpreferenceMapper.selectCustomerPreferenceVo(page,customerPreferenceDTO.getCustomerName());
        return ResultVo.ok(page);

    }
}
