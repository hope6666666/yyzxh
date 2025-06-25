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
@ApiModel(value = "Customer对象", description = "客户对象")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id; // 客户ID


    private Integer isDeleted; // 删除逻辑标志 0-未删除 1-已删除

    private String name; // 客户姓名

    private String age; // 客户年龄

    private Integer sex; // 客户性别 0-男 1-女

    private String idcard; // 客户身份证号

    private String room; // 客户房间号

    private String budding; // 客户所在楼栋

    private Date checkInTime; // 客户入住时间

    private Date expiration; // 客户到期时间

    private String phoneNumber; // 客户手机号

    private Integer bedNumber; // 客户床位号

    private String status; // 客户状态

    private String attention; // 客户关注点

    private Date brithday; // 客户生日

    private String height; // 客户身高

    private String weight; // 客户体重

    private String bloodType; // 客户血型

    private String filepath; // 客户头像路径

    private Integer userId; // 用户ID

    private Integer levelId; // 客户等级ID

    private String familyMember; // 家庭成员信息




}
