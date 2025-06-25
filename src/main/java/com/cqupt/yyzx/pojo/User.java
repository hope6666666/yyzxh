package com.cqupt.yyzx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)

    @ApiModel(value = "User对象", description = "用户对象")
    public class User  implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id; // 用户ID

    @ApiModelProperty(value = "创建时间")
    private Data createTime; // 创建时间

    @ApiModelProperty(value = "创建者")
    private Integer createBy; // 创建者

    @ApiModelProperty(value = "更新时间")
    private Date updateTime; // 更新时间

    @ApiModelProperty(value = "更新者")
    private  Integer updateBy;//更新者

    @ApiModelProperty(value = "删除逻辑标志")
    private Integer isDeleted;

    @ApiModelProperty(value = "真实姓名")
    private String nickname; // 真实姓名

    @ApiModelProperty(value = "账号")
    private String username; // 账号

    @ApiModelProperty(value = "密码")
    private String password; // 密码

    @ApiModelProperty(value = "性别")
    private Integer sex; // 性别 0-男 1-女

    @ApiModelProperty(value = "邮箱")
    private String email; // 邮箱

    @ApiModelProperty(value = "手机号")
    private String phoneNumber; // 手机号

    @ApiModelProperty(value = "系统角色编号 1-管理员 2-健康管家")
    private Integer roleId; //

    @ApiModelProperty(value = "当前用户的角色菜单")
    @TableField(exist = false)// 表示该属性不是数据库表中的字段
    private List<Menu> menuList; // 当前用户的角色菜单列表
}
