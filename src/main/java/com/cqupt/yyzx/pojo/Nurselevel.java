package com.cqupt.yyzx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value="Nurselevel对象",description="Nurselevel对象描述")

public class Nurselevel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Integer id;

    @ApiModelProperty(value="护理级别")
    private String levelName;

    @ApiModelProperty(value="级别状态 1:启用 2:停用")
    private Integer levelStatus;

    @ApiModelProperty(value="逻辑删除标记 0:显示；1:隐藏")
    private Integer isDeleted;
}
