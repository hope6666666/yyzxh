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
@ApiModel(value = "Customer对象", description = "客户对象")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id; // 客户ID

    @ApiModelProperty(value = "删除逻辑标志 0-未删除 1-已删除")
    private Integer isDeleted; // 删除逻辑标志 0-未删除 1-已删除

    @ApiModelProperty(value = "客户姓名")
    private String customerName; // 客户姓名

    @ApiModelProperty(value = "客户年龄")
    private Integer customerAge; // 客户年龄

    @ApiModelProperty(value = "客户性别 0-男 1-女")
    private Integer customerSex; // 客户性别 0-男 1-女

    @ApiModelProperty(value = "客户身份证号")
    private String idCard; // 客户身份证号

    @ApiModelProperty(value = "客户房间号")
    private String roomNo; // 客户房间号

    @ApiModelProperty(value = "客户所在楼栋")
    private String buildingNo; // 客户所在楼栋

    @ApiModelProperty(value = "客户入住时间")
    private Date checkinDate; // 客户入住时间

    @ApiModelProperty(value = "客户到期时间")
    private Date expirationDate; // 客户到期时间

    @ApiModelProperty(value = "客户手机号")
    private String contactTel; // 客户手机号

    @ApiModelProperty(value = "客户床位号")
    private Integer bedId; // 客户床位号

    @ApiModelProperty(value = "客户状态")
    private String psychosomaticState; // 客户状态

    @ApiModelProperty(value = "客户关注点")
    private String attention; // 客户关注点

    @ApiModelProperty(value = "客户生日")
    private Date birthday; // 客户生日

    @ApiModelProperty(value = "客户身高")
    private String height; // 客户身高

    @ApiModelProperty(value = "客户体重")
    private String weight; // 客户体重

    @ApiModelProperty(value = "客户血型")
    private String bloodType; // 客户血型

    @ApiModelProperty(value = "客户头像路径")
    private String filepath; // 客户头像路径

    @ApiModelProperty(value = "关联系统健康管家、护工")
    private Integer userId; // 关联系统健康管家、护工

    @ApiModelProperty(value = "护理等级")
    private Integer levelId; // 护理等级

    @ApiModelProperty(value = "家庭成员信息")
    private String familyMember; // 家庭成员信息




}
