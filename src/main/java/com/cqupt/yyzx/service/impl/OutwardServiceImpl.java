package com.cqupt.yyzx.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqupt.yyzx.dto.OutwardDTO;
import com.cqupt.yyzx.mapper.OutwardMapper;
import com.cqupt.yyzx.pojo.Outward;
import com.cqupt.yyzx.service.OutwardService;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.OutWardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * OutwardService的实现类
 */
@Service
public class OutwardServiceImpl extends ServiceImpl<OutwardMapper, Outward> implements OutwardService {

    @Autowired
//    @Resource
    private OutwardMapper outwardMapper;

    @Transactional(rollbackFor = Exception.class)
    //审批登记（健康管家申请）
    @Override
    public ResultVo examineOutward(Outward outward)  throws Exception{
        UpdateWrapper<Outward> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", outward.getId());
        updateWrapper.set("audit_status", outward.getAuditStatus()); // 假设数据库字段为 audit_status
        outwardMapper.update(outward, updateWrapper);
        return ResultVo.ok("审批成功");
    }

    //查询外出记录
    @Override
    public ResultVo<Page<OutWardVo>> queryOutwardVo(OutwardDTO outwardDTO) {
        Page<OutWardVo> page = new Page<>(outwardDTO.getPageNum(), outwardDTO.getPageSize());
        Page<OutWardVo> resultPage = outwardMapper.selectOutWardVo(page, outwardDTO.getUserId());
        return ResultVo.ok(resultPage);
    }
}
