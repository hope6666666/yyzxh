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
@ApiModel(value = "Bed对象", description = "床位对象")

public class Bed implements Serializable {

    private  static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id; // 床位ID

    @ApiModelProperty(value = "床位号")
    private String roomNo; // 床位号

    @ApiModelProperty(value = "床位状态 0-空闲 1-占用 2-外出")
    private Integer bedStatus; // 床位状态 0-空闲 1-占用 2-外出

    @ApiModelProperty(value = "床位编号")
    private String bedNo; // 床位编号

    @ApiModelProperty(value = "所在楼栋")
    private String buddingNo; // 所在楼栋

    @ApiModelProperty(value = "删除逻辑标志 0-未删除 1-已删除")
    private Integer isDeleted; // 删除逻辑标志 0-未删除 1-已删除
}
