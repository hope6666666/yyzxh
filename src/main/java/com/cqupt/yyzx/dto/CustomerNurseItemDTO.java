package com.cqupt.yyzx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "OutwardDTO对象", description = "外出DTO对象")
public class CustomerNurseItemDTO {
    @ApiModelProperty(value = "顾客ID")
    private Integer customerId; // 顾客ID
    @ApiModelProperty(value ="页码")
    private Integer pageSize; // 页码
}
