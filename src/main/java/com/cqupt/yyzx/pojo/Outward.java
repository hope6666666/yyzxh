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
public class Outward implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id; // 主键ID

    @ApiModelProperty(value = "客户Id")
    private Integer customerId; // 客户ID

    @ApiModelProperty(value = "外出时间")
    private String outgoingTime; // 外出时间

    @ApiModelProperty(value = "外出原因")
    private String outgoingReason; // 外出原因

    @ApiModelProperty(value = "删除逻辑标志 0-未删除 1-已删除")
    private Integer isDeleted; // 删除逻辑标志 0-未删除 1-已删除

    @ApiModelProperty(value = "预计返回时间")
    private Date expectedReturnTime; // 预计返回时间

    @ApiModelProperty(value = "实际返回时间")
    private Date actualReturnTime; // 实际返回时间

    @ApiModelProperty(value = "是否有陪同人员")
    private String escorted; // 是否有陪同人员

    @ApiModelProperty(value = "陪同人员关系")
    private String relation; // 陪同人员关系

    @ApiModelProperty(value = "陪同人员电话")
    private String escortedTel; // 陪同人员电话

    @ApiModelProperty(value = "审核状态 0-未审核 1-已审核 2-审核不通过")
    private Integer auditStatus; // 审核状态 0-未审核 1-已审核 2-审核不通过

    @ApiModelProperty(value = "审核人")
    private String auditPerson; // 审核人

    @ApiModelProperty(value = "审核时间")
    private Date auditDate; // 审核时间





}
