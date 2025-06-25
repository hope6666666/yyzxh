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
@ApiModel(value = "Role对象", description = "角色对象")
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "主键")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id; // 角色ID

    @ApiModelProperty(value = "创建时间")
    private Date createTime; // 创建时间

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "更新者")
    private Integer updateBy; // 更新者

    @ApiModelProperty(value = "逻辑删除标志 0-未删除 1-隐藏")
    private Integer isDeleted; // 删除逻辑标志

    @ApiModelProperty(value = "角色名称")
    private String name; // 角色名称




}

