package com.cqupt.yyzx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Customerpreference对象", description = "客户偏好对象")
public class Room implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "房间id")
    private Integer id;

    @ApiModelProperty(value = "房间楼层")
    private String roomFloor;

    @ApiModelProperty(value = "房间号")
    private Integer roomNo;

    @ApiModelProperty(value = "床位列表")
    @TableField(exist = false)
    private List<Bed> bedList;


}
