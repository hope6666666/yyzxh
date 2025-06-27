package com.cqupt.yyzx.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "UserDTO对象", description = "用户数据传输对象")
public class UserDTO {

    @ApiModelProperty(value = "系统角色 1-管理员 2-健康管家")
    private Integer roleId;

    @ApiModelProperty(value = "分页参数")
    private Integer pageSize; // 每页大小

    @ApiModelProperty(value = "真实姓名")
    private String nickname; // 真实姓名

}
