package com.cqupt.yyzx.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "BedDetailsVo对象", description = "床位详情视图对象")
public class BedDetailsVo {

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "逻辑删除标记（0：显示；1：隐藏）")
    private Integer isDelete;

    @ApiModelProperty(value = "床位起始日期")
    private Date startDate;

    @ApiModelProperty(value = "床位结束日期")
    private Date endDate;

    @ApiModelProperty(value = "床位详情信息")
    private String bedDetails;

    @ApiModelProperty(value = "床位id")
    private Integer bedId;

    @ApiModelProperty(value = "房间号")
    private Integer roomNo;

    @ApiModelProperty(value = "顾客id")
    private Integer customerId;

    @ApiModelProperty(value = "顾客性别")
    private Integer customerSex;

    @ApiModelProperty(value = "顾客姓名")
    private String customerName;
}
