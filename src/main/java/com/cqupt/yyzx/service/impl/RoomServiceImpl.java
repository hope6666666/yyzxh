package com.cqupt.yyzx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqupt.yyzx.mapper.BedMapper;
import com.cqupt.yyzx.mapper.RoomMapper;
import com.cqupt.yyzx.pojo.Room;
import com.cqupt.yyzx.service.RoomService;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.CwsyBedVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * RoomService实现类
 *
 */
@Service
public class RoomServiceImpl extends ServiceImpl<RoomMapper, Room> implements RoomService {

    @Autowired
    private RoomMapper roomMapper;
    @Autowired
    private BedMapper bedMapper;

    @Override
    public ResultVo<CwsyBedVo> findCwsyBedVo(String floor) throws Exception {
        // 统计床位
        CwsyBedVo cwsyBedVo = bedMapper.selectBedCount();
        QueryWrapper<Room> qwRoomList = new QueryWrapper<>();
        qwRoomList.eq("room_floor", floor);
        List<Room> rooms = list(qwRoomList);

        for (Room room : rooms) {
            // 查询每个房间的床位信息
            QueryWrapper<com.cqupt.yyzx.pojo.Bed> qwBedList = new QueryWrapper<>();
            qwBedList.eq("room_no", room.getRoomNo());
            room.setBedList(bedMapper.selectList(qwBedList));
        }
        cwsyBedVo.setRoomList(rooms);
        return ResultVo.ok(cwsyBedVo);
    }
}