package com.cqupt.yyzx.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cqupt.yyzx.pojo.Bed;
import com.cqupt.yyzx.vo.CwsyBedVo;

public interface BedMapper extends  BaseMapper<Bed> {

    CwsyBedVo selectBedCount();

}
