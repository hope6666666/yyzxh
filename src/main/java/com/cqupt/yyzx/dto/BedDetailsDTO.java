package com.cqupt.yyzx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value="MealDTO对象", description="餐食信息传输对象")
public class BedDetailsDTO {
    @ApiModelProperty(value = "客户姓名")
    private String customerName; // 顾客姓名
    @ApiModelProperty(value = "页码")
    private Integer pageSize; // 页码
    @ApiModelProperty(value = "查询类型 0-生效床位信息 1-过期床位信息")
    private Integer isDeleted; //
    @ApiModelProperty(value = "开始日期")
    private Date startDate; // 开始日期
    @ApiModelProperty(value = "结束日期")
    private Date endDate; // 结束日期

    @ApiModelProperty(value = "每页条数")
    private Integer limit; // 新增
    @ApiModelProperty(value = "当前页码")
    private Integer page; // 新增
}
