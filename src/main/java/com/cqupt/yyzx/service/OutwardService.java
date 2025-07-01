package com.cqupt.yyzx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.yyzx.dto.OutwardDTO;
import com.cqupt.yyzx.pojo.Outward;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.OutWardVo;

public interface OutwardService extends  IService<Outward>{
    ResultVo examineOutward(Outward outward) throws  Exception;
    ResultVo<Page<OutWardVo>> queryOutwardVo(OutwardDTO outwardDTO) throws Exception;
}
