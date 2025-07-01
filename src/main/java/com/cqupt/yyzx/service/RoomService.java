package com.cqupt.yyzx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.yyzx.pojo.Room;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.CwsyBedVo;

public interface RoomService extends IService<Room> {

    public ResultVo<CwsyBedVo> findCwsyBedVo(String floor) throws Exception;
}
