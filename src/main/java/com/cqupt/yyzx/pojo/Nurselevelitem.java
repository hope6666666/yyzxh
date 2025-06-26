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
@ApiModel(value="Nurselevelitem对象",description="Nurselevelitem对象描述")

public class Nurselevelitem implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "关联护理级别")
    private Integer levelId;

    @ApiModelProperty(value = "关联护理项目")
    private Integer itemId;
}
