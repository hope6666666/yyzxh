package com.cqupt.yyzx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "OutwardDTO对象", description = "外出DTO对象")
public class OutwardDTO {
    @ApiModelProperty(value = "用户ID")
    private Integer userId; // 用户ID
    @ApiModelProperty(value = "页码")
    private Integer pageSize; // 页码

    @ApiModelProperty(value = "页大小")
    private Integer pageNum; // 页码
}
