package com.cqupt.yyzx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Beddetails对象", description = "床位详情对象")
public class Beddetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "床位开始时间")
    private Date startDate;

    @ApiModelProperty(value = "床位结束时间")
    private Date endDate;

    @ApiModelProperty(value = "床位详情信息")
    private String bedDetails;

    @ApiModelProperty(value = "顾客id")
    private Integer customerId;

    @ApiModelProperty(value = "床位id")
    private Integer bedId;

    @ApiModelProperty(value = "逻辑删除的标记（0：显示；1：隐藏）")
    private Integer isDeleted;
}

