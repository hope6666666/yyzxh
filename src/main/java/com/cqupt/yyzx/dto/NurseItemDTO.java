package com.cqupt.yyzx.dto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value = "NurseItem对象", description = "护理项目数据传输对象")
public class NurseItemDTO {

    @ApiModelProperty(value="状态 1-启用；2-停用")
    private Integer status;

    @ApiModelProperty(value="页码")
    private Integer pageNum;

    @ApiModelProperty(value="名称")
    private String itemName;

}
