package com.cqupt.yyzx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.yyzx.dto.BackdownDTO;
import com.cqupt.yyzx.pojo.Backdown;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.BackdownVo;

public interface BackdownService extends  IService<Backdown>{

    ResultVo<Page<BackdownVo>> listBackdownVo(BackdownDTO backdownDTO) throws Exception;
    ResultVo examineBackdown(Backdown backdown) throws  Exception;

}
