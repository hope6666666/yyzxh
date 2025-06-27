package com.cqupt.yyzx.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "BackdownVo对象",description = "BackdownVo对象描述")
public class BackdownVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String remark;

    private Integer isDelete;

    private Integer customerId;

    private String customerName;

    private Date retreatTime;

    private Integer retreatType;

    private String retreatReason;

    private Integer auditstatus;

    private Date audditime;






}
