package com.cqupt.yyzx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.yyzx.pojo.Nursecontent;
import com.cqupt.yyzx.utils.ResultVo;

import java.util.List;

public interface NursecontentService extends  IService<Nursecontent>{
    ResultVo<List<Nursecontent>> listNurseItemByLevel(Integer levelId) throws Exception;

    ResultVo updateNurseItem(Nursecontent nursecontent) throws Exception;

    ResultVo delNurseItem(Integer id)throws Exception;

}
