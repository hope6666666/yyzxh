package com.cqupt.yyzx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import com.cqupt.yyzx.dto.NurseRecordDTO;
import com.cqupt.yyzx.pojo.Nurserecord;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.NurseRecordsVo;

public interface NursercordService extends IService<Nurserecord> {
    ResultVo addNurseRecord(Nurserecord nurserecord) throws Exception;
    ResultVo<Page<NurseRecordsVo>> queryNurseRecordsVo(NurseRecordDTO nurseRecordDTO)  throws Exception;

}