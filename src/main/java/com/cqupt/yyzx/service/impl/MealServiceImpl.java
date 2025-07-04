package com.cqupt.yyzx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqupt.yyzx.dto.MealDTO;
import com.cqupt.yyzx.mapper.MealMapper;
import com.cqupt.yyzx.pojo.Meal;
import com.cqupt.yyzx.service.MealService;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.MealVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MealServiceImpl extends ServiceImpl<MealMapper, Meal> implements MealService {
@Resource
private MealMapper mealMapper;
@Override
    public ResultVo<Page<MealVo>> listMealVoPage(MealDTO mealDTO) throws Exception {
        Page<MealVo> page = new Page<>(mealDTO.getPageSize(),5);
        mealMapper.selectMealVo(page, mealDTO.getWeekDay(), mealDTO.getMealType());
        return ResultVo.ok(page);
    }
    // 这里可以添加自定义的方法实现
    // 例如：查询膳食列表、添加膳食等
}
