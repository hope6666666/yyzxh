package com.cqupt.yyzx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.yyzx.dto.BedDetailsDTO;
import com.cqupt.yyzx.dto.ExchangeDTO;
import com.cqupt.yyzx.pojo.Beddetails;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.BedDetailsVo;

public interface BeddetailsService extends  IService<Beddetails>{

    ResultVo<Page<BedDetailsVo>> listBedDetailsVoPage(BedDetailsDTO bedDetailsDTO) throws Exception;

    ResultVo exchangeBed(ExchangeDTO exchangeDTO) throws Exception;

}
