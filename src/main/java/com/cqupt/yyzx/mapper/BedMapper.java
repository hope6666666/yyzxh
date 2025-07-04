package com.cqupt.yyzx.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cqupt.yyzx.pojo.Bed;
import com.cqupt.yyzx.vo.CwsyBedVo;
import org.mapstruct.Mapper;

@Mapper
public interface BedMapper extends  BaseMapper<Bed> {

    CwsyBedVo selectBedCount();

}
