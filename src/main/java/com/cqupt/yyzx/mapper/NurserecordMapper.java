package com.cqupt.yyzx.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cqupt.yyzx.pojo.Nurserecord;
import com.cqupt.yyzx.vo.NurseRecordsVo;
import org.apache.ibatis.annotations.Param;


public interface NurserecordMapper extends BaseMapper<Nurserecord> {

    Page<NurseRecordsVo> selectNurseRecordsVo(@Param("page") Page<NurseRecordsVo> page , @Param("custormerId") Integer custormerId) throws Exception;

}
