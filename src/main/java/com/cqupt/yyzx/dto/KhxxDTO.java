package com.cqupt.yyzx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "KhxxDTO对象", description = "客户信息DTO对象")
public class KhxxDTO {
    @ApiModelProperty(value = "客户姓名")
    private  String customerName; // 客户姓名
    @ApiModelProperty(value = "页码")
    private  Integer pageSize; // 页码
    @ApiModelProperty(value = "老人类型 1-自理老人 2-护理老人 3-无管家")
    private Integer manType; // 老人类型 1-自理老人 2-护理老人 3-无管家
    @ApiModelProperty(value="系统健康管家（护工）")
    private Integer userId;


}
