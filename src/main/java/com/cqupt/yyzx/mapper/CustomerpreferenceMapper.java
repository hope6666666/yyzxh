package com.cqupt.yyzx.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cqupt.yyzx.pojo.Customerpreference;
import com.cqupt.yyzx.vo.CustomerPreferenceVo;
import org.apache.ibatis.annotations.Param;

public interface CustomerpreferenceMapper extends  BaseMapper<Customerpreference> {

    Page<CustomerPreferenceVo> selectCustomerPreferenceVo(@Param("page") Page<CustomerPreferenceVo> page, @Param("customer_name") String customerName) throws Exception;

}
