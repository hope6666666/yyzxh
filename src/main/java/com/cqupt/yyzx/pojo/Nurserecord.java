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
@EqualsAndHashCode(callSuper=false)
@ApiModel(value="Nurserecord对象",description="Nurserecord对象描述")
public class Nurserecord implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="主键")
    @TableId(value="id", type= IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value="逻辑删除标记（0：显示；1：隐藏）")
    private Integer isDelete;

    @ApiModelProperty(value="客户id")
    private Integer customerId;

    @ApiModelProperty(value="护理项目id")
    private Integer itemId;

    @ApiModelProperty(value="护理时间")
    private Date nursingTime;

    @ApiModelProperty(value="护理内容")
    private String nursingContent;

    @ApiModelProperty(value="护理数量")
    private Integer nursingCount;

    @ApiModelProperty(value="护理人员id")
    private Integer userId;


}
