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
@ApiModel(value="Customernurseitem对象",description="Customernurseitem对象描述")
public class Customernurseitem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="主键")
    @TableId(value="id",type= IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value="护理项目编号")
    private Integer itemId;

    @ApiModelProperty(value="客户编号")
    private Integer customerId;

    @ApiModelProperty(value="护理等级编号")
    private Integer levelId;

    @ApiModelProperty(value="购买数量")
    private Integer nurseNumber;

    @ApiModelProperty(value="逻辑删除标记（0：显示；1：隐藏）")
    private Integer isDeleted;

    @ApiModelProperty(value="服务购买时间")
    private Date buyTime;

    @ApiModelProperty(value="服务到期时间")
    private Date maturityTime;

}
