package com.cqupt.yyzx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cqupt.yyzx.pojo.Outward;
import com.cqupt.yyzx.vo.OutWardVo;
import org.apache.ibatis.annotations.Param;

public interface OutwardMapper extends BaseMapper<Outward> {
    // 这里可以添加自定义的查询方法
    // 例如：List<Outward> findBySomeCriteria(String criteria);

    Page<OutWardVo> selectOutWardVo(@Param("page")Page<OutWardVo> page, @Param("userID") Integer userID);
}
