package com.cqupt.yyzx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "OutwardDTO对象", description = "外出DTO对象")
public class CustomerPreferenceDTO
{
    @ApiModelProperty(value = "喜好ID")
    private Integer customerPreferenceId; // 顾客偏好ID
    @ApiModelProperty(value = "顾客姓名")
    private String customerName;
    @ApiModelProperty(value = "页码")
    private Integer pageSize; // 页码
}
