package com.cqupt.yyzx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value = "NurseRecordDTO", description = "护理记录数据传输对象")
public class NurseRecordDTO {
    @ApiModelProperty(value="客户编号")
    private Integer customerId;

    @ApiModelProperty(value="页码")
    private Integer pageSize;

}

