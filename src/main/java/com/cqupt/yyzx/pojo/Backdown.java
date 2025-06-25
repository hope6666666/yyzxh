package com.cqupt.yyzx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Outward对象", description = "外出记录对象")

public class Backdown implements Serializable {
    private  static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id; // 外出记录ID

    @ApiModelProperty(value = "删除逻辑标志 0-未删除 1-已删除")
    private Integer isDeleted; // 删除逻辑标志 0-未删除 1-已删除


    @ApiModelProperty(value = "备注信息")
    private String remarks; // 备注信息

    @ApiModelProperty(value = "客户Id")
    private Integer customerId; // 客户ID

    @ApiModelProperty(value = "外出时间")
    private Date retreatTime; // 外出时间

    @ApiModelProperty(value = "外出类型")
    private Date retreatType; // 外出类型

    @ApiModelProperty(value = "外出原因")
    private String retreatReason; // 外出原因

    @ApiModelProperty(value = "外出状态")
    private String retreatState; // 外出状态

    @ApiModelProperty(value = "审核人")
    private String auditPerson; // 审核人

    @ApiModelProperty(value = "审核时间")
    private Date auditdate; // 审核时间




}
