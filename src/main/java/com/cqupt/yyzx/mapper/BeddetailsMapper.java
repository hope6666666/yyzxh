package com.cqupt.yyzx.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cqupt.yyzx.dto.BedDetailsDTO;
import com.cqupt.yyzx.pojo.Beddetails;
import com.cqupt.yyzx.vo.BedDetailsVo;
import org.apache.ibatis.annotations.Param;

public interface BeddetailsMapper extends  BaseMapper<Beddetails> {

    Page<BedDetailsVo> selectBedDetailsVo(@Param("page") Page<BedDetailsVo> page, @Param("detailsDTO") BedDetailsDTO detailsDTO) ;

}
