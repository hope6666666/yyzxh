package com.cqupt.yyzx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqupt.yyzx.mapper.BedMapper;
import com.cqupt.yyzx.pojo.Bed;
import com.cqupt.yyzx.service.BedService;
import org.springframework.stereotype.Service;

/**
 * BedService实现类
 */
@Service
public class BedServiceImpl extends ServiceImpl<BedMapper, Bed> implements BedService {
}
