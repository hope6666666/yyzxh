package com.cqupt.yyzx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value="MealDTO对象", description="餐食数据传输对象")
public class MealDTO {
    @ApiModelProperty(value = "食谱ID")
    private Integer mealId; // 餐食ID

    @ApiModelProperty(value = "食谱名称")
    private String mealType; // 餐食类型（如：早餐、午餐、晚餐）

    @ApiModelProperty(value = "星期")
    private String weakDay; // 弱日（如：周一、周二等）

    @ApiModelProperty(value = "页码")
    private Integer pageSize; // 页玛
}
