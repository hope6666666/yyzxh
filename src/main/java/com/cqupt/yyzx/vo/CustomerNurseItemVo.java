package com.cqupt.yyzx.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value="CustomerNurseItemVo对象",description="CustomerNurseItemVo对象描述")
public class CustomerNurseItemVo {

    @ApiModelProperty(value = "主键")
    @TableId(value ="id", type=IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "护理项目id")
    private Integer itemId;

    @ApiModelProperty(value = "客户编号")
    private Integer customerId;

    @ApiModelProperty(value = "购买数量")
    private Integer nurseNumber;

    @ApiModelProperty(value = "逻辑删除标记（0：显示；1：隐藏）")
    private Integer isDelete;

    @ApiModelProperty(value = "服务购买时间")
    private Date buyTime;

    @ApiModelProperty(value = "服务到期时间")
    private Date maturityTime;

    @ApiModelProperty(value = "客户姓名")
    private String customerName;

    @ApiModelProperty(value = "编号")
    private String serialNumber;

    @ApiModelProperty(value = "护理项目名称")
    private String nursingName;

    @ApiModelProperty(value = "价格")
    private String servicePrice;
}
