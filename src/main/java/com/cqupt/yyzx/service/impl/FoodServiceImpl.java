package com.cqupt.yyzx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqupt.yyzx.mapper.FoodMapper;
import com.cqupt.yyzx.pojo.Food;
import com.cqupt.yyzx.service.FoodService;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper,Food> implements FoodService {

}
