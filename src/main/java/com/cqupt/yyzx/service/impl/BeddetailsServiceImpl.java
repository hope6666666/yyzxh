package com.cqupt.yyzx.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqupt.yyzx.dto.BedDetailsDTO;
import com.cqupt.yyzx.dto.ExchangeDTO;
import com.cqupt.yyzx.mapper.BedMapper;
import com.cqupt.yyzx.mapper.BeddetailsMapper;
import com.cqupt.yyzx.mapper.CustomerMapper;
import com.cqupt.yyzx.pojo.Bed;
import com.cqupt.yyzx.pojo.Beddetails;
import com.cqupt.yyzx.pojo.Customer;
import com.cqupt.yyzx.service.BedService;
import com.cqupt.yyzx.service.BeddetailsService;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.BedDetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Beddetails实现类
 */

@Service
public class BeddetailsServiceImpl extends ServiceImpl<BeddetailsMapper, Beddetails> implements BeddetailsService {
    @Autowired
    private BeddetailsMapper beddetailsMapper;
    @Autowired
    private BedMapper bedmapper;
    @Autowired
    private CustomerMapper customermapper;

    @Override
    public ResultVo<Page<BedDetailsVo>> listBedDetailsVoPage(BedDetailsDTO bedDetailsDTO) throws Exception {
        Page<BedDetailsVo> page = new Page<>(bedDetailsDTO.getPageSize(),6);
        beddetailsMapper.selectBedDetailsVo(page, bedDetailsDTO);
        return ResultVo.ok(page);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultVo exchangeBed(ExchangeDTO exchangeDTO) throws Exception {
        //查询床位是否可用
        QueryWrapper qw=new QueryWrapper();
        Bed bed=bedmapper.selectById(exchangeDTO.getNewBedId());
        if(bed.getBedStatus()!=1){
            return ResultVo.fail("该床位已有人");
        }
        //1.修改客户旧床位详细信息：is_deleted置为1 床位使用结束时间为当前日期
        Beddetails beddetails=new Beddetails();
        beddetails.setId(exchangeDTO.getId());
        beddetails.setIsDeleted(1);
        beddetails.setEndDate(new Date());
        int row1=beddetailsMapper.updateById(beddetails);

        //2.添加新床位的使用记录
        Beddetails newBeddetails=new Beddetails();
        newBeddetails.setIsDeleted(0);
        newBeddetails.setCustomerId(exchangeDTO.getCustomerId());
        newBeddetails.setBedId(exchangeDTO.getNewBedId());
        newBeddetails.setEndDate(exchangeDTO.getEndDate());
        newBeddetails.setStartDate(new Date());
        newBeddetails.setBedDetails(exchangeDTO.getBuildingNo()+"#"+bed.getBedNo());
        int row2=beddetailsMapper.insert(newBeddetails);

        //3.修改旧床位的状态为空闲（bed_status=1）
        Bed oldBed=new Bed();
        oldBed.setId(exchangeDTO.getNewBedId());
        oldBed.setBedStatus(1);
        int row3=bedmapper.updateById(oldBed);

        //4.修改新床位的状态为有人（bed_status=2）
        Bed newBed=new Bed();
        newBed.setId(exchangeDTO.getNewBedId());
        newBed.setBedStatus(2);
        int row4=bedmapper.updateById(newBed);

        //5.修改客户信息（新房间号-新床位号-楼号）
        Customer customer=new Customer();
        customer.setId(exchangeDTO.getCustomerId());
        customer.setBedId(exchangeDTO.getNewBedId());
        customer.setBuildingNo(exchangeDTO.getBuildingNo());
        customer.setRoomNo(exchangeDTO.getNewRoomNo());
        int row5=customermapper.updateById(customer);
        if(!(row1>0&&row2>0&&row3>0&&row4>0&&row5>0)){
            throw new Exception("床位调换失败");
        }return ResultVo.ok("床位调换成功");
    }
}
