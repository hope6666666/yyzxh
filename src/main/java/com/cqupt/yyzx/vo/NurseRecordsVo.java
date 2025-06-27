package com.cqupt.yyzx.vo;
//要改


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "NurseRecordsVo", description = "护理记录视图对象")
public class NurseRecordsVo {

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

    @ApiModelProperty(value = "护理内容描述")
    private String content;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "逻辑删除标记（0：显示；1：隐藏）")
    private Integer isDeleted;

    @ApiModelProperty(value = "退住时间")
    private Date retreatTime;

    @ApiModelProperty(value = "退住类型")
    private Integer retreatType;

    @ApiModelProperty(value = "退住原因")
    private String retreatReason;

    @ApiModelProperty(value = "审核状态")
    private Integer auditStatus;

    @ApiModelProperty(value = "审核时间")
    private Date auditTime;
}