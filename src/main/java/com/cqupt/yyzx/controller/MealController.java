package com.cqupt.yyzx.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cqupt.yyzx.dto.MealDTO;
import com.cqupt.yyzx.pojo.Meal;
import com.cqupt.yyzx.service.MealService;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.MealVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/meal")
@CrossOrigin
@Api(tags = "餐食管理")
public class MealController {

    @Resource
    private MealService mealService;

    @RequestMapping("/addmeal")
    @ApiOperation("添加餐食")
    public ResultVo addMeal(Meal meal) throws Exception{
        mealService.save(meal);
        return ResultVo.ok("添加成功");
    }

    @ApiOperation("更新餐食")
    @PostMapping("/updatemeal")
    public  ResultVo updateMeal(Meal meal) throws Exception {
        mealService.updateById(meal);
        return ResultVo.ok("更新成功");
    }


    @ApiOperation("删除膳食")
    @GetMapping("/removemeal")
    public ResultVo removeMeal(Integer id) throws Exception {
        mealService.removeById(id);
        return ResultVo.ok("删除成功");
    }


    @PostMapping("/ListMeal")
    @ApiOperation("查询膳食列表")
    public ResultVo<Page<MealVo>> listMeal(MealDTO mealDTO) throws Exception {
        return mealService.listMealVoPage(mealDTO);
    }

}
