package com.cqupt.yyzx.vo;
//要改

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "CustomerNurseitemVo", description = "客户护理项目信息视图对象")
public class CustomerNurseitemVo {

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "客户ID")
    private Integer customerId;

    @ApiModelProperty(value = "客户姓名")
    private String customerName;

    @ApiModelProperty(value = "护理项目ID")
    private Integer nurseitemId;

    @ApiModelProperty(value = "护理项目名称")
    private String nurseitemName;

    @ApiModelProperty(value = "护理开始时间")
    private Date startDate;

    @ApiModelProperty(value = "护理结束时间")
    private Date endDate;

    @ApiModelProperty(value = "备注")
    private String remark;
}