package com.cqupt.yyzx.vo;
//要改
import com.cqupt.yyzx.pojo.Room;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "CwsvBedVo对象",description = "CwsvBedVo详细描述")
public class CwsyBedVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "总床位")
    private Integer zcw;

    @ApiModelProperty(value = "空闲床位")
    private Integer kx;

    @ApiModelProperty(value = "有人床位")
    private Integer yr;

    @ApiModelProperty(value = "外出床位")
    private Integer wc;

    @ApiModelProperty(value = "房间和床位列表")
    private List<Room> roomList;

}
