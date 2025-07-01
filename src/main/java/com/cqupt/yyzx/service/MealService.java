package com.cqupt.yyzx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.yyzx.dto.MealDTO;
import com.cqupt.yyzx.pojo.Meal;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.MealVo;

public interface MealService extends  IService<Meal> {
    ResultVo<Page<MealVo>> listMealVoPage(MealDTO mealDTO) throws Exception;

}
