package com.cqupt.yyzx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Customerpreference对象", description = "客户偏好对象")

public class Customerpreference implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id; // 主键ID

    @ApiModelProperty(value = "客户Id")
    private Integer customerId; // 客户ID

    @ApiModelProperty(value = "偏好类型（如饮食、活动等）")
    private String preference; // 偏好类型（如饮食、活动等）

    @ApiModelProperty(value = "关注点")
    private String attention; // 关注点

    @ApiModelProperty(value = "备注信息")
    private String remark; // 备注信息

    @ApiModelProperty(value = "删除逻辑标志 0-未删除 1-已删除")
    private Integer isDeleted; // 删除逻辑标志 0-未删除 1-已删除





}
