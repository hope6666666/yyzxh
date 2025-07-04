package com.cqupt.yyzx.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqupt.yyzx.dto.KhxxDTO;
import com.cqupt.yyzx.mapper.BedMapper;
import com.cqupt.yyzx.mapper.BeddetailsMapper;
import com.cqupt.yyzx.mapper.CustomerMapper;
import com.cqupt.yyzx.pojo.Bed;
import com.cqupt.yyzx.pojo.Beddetails;
import com.cqupt.yyzx.pojo.Customer;
import com.cqupt.yyzx.service.CustomerService;
import com.cqupt.yyzx.utils.ResultVo;
import com.cqupt.yyzx.vo.KhxxCustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * CustomerService的实现类
 */

@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

    @Autowired
    private BeddetailsMapper beddetailsMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private BedMapper bedMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultVo addCustomer(Customer customer) throws Exception {
        // 查询床位是否可用
        QueryWrapper qw = new QueryWrapper();
        Bed bed = bedMapper.selectById(customer.getBedId());
        if (bed.getBedStatus() != 1) {
            return ResultVo.fail("该床位已有人");
        }
        customer.setIsDeleted(0);//新加客户默认生效
        customer.setUserId(-1);//新加客户默认无健康管家
        //生成客户信息
        int row1 = customerMapper.insert(customer);
        //生成入住详情
        Beddetails beddetails = new Beddetails();
        beddetails.setBedId(customer.getBedId());
        beddetails.setStartDate(customer.getCheckinDate());
        beddetails.setEndDate(customer.getExpirationDate());
        beddetails.setBedDetails(customer.getBuildingNo() + "#" + bed.getBedNo());
        beddetails.setCustomerId(customer.getId());
        beddetails.setIsDeleted(0);//床位生效
        int row2 = beddetailsMapper.insert(beddetails);

        Bed bedUpdate = new Bed();
        bedUpdate.setId(customer.getBedId());
        bedUpdate.setBedStatus(2);
        int row3 = bedMapper.updateById(bedUpdate);
        if (!(row1 > 0 && row2 > 0 && row3 > 0)) {
            throw new Exception("入住失败");
        }
        return ResultVo.ok("入住成功");
    }

    @Override
    public ResultVo<Page<KhxxCustomerVo>> khxxFindCustomer(KhxxDTO khxxDTO) throws Exception {
        Page<KhxxCustomerVo> page = new Page<>(khxxDTO.getPageSize(), 6);//第一个参数为当前页，第二个参数为每页显示条数
        customerMapper.selectPageVo(page, khxxDTO.getCustomerName(), khxxDTO.getManType(), khxxDTO.getUserId());
        return ResultVo.ok(page);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultVo removeCustomer(Integer id, Integer bedId) throws Exception {
        //修改用户is_deleted状态为1 （成为历史老人）
        Customer customer = new Customer();
        customer.setId(id);
        customer.setIsDeleted(1);
        int row1 = customerMapper.updateById(customer);

        //修改床位状态为 1 （空闲）
        Bed bed = new Bed();
        bed.setId(bedId);
        bed.setBedStatus(1);
        int row2 = bedMapper.updateById(bed);

        //修改床位详情状：is_deleted状态置为1 （隐藏）
        Beddetails beddetails = new Beddetails();
        beddetails.setIsDeleted(1);
        UpdateWrapper uw = new UpdateWrapper();
        uw.eq("customer_id", id);
        uw.eq("bed_id", bedId);
        uw.eq("is_deleted", 0);
        int row3 = beddetailsMapper.update(beddetails, uw);
        if (!(row1 > 0 && row2 > 0 && row3 > 0)) {
            throw new Exception("删除失败");
        }
        return ResultVo.ok("删除成功");
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultVo editCustomer(Customer customer) throws Exception {
        //1.编辑客户信息
        int row1 = customerMapper.updateById(customer);
        //2.如何合同到期时间发生改变，更新用户当前生效的床位信息的退住时间为改变的合同日期
        if (customer.getExpirationDate() != null) {
            UpdateWrapper uw = new UpdateWrapper();
            uw.eq("customer_id", customer.getId());
            uw.eq("is_deleted", 0);
            Beddetails beddetails = new Beddetails();
            beddetails.setEndDate(customer.getExpirationDate());
            int row2 = beddetailsMapper.update(beddetails, uw);
            if (!(row1 > 0 && row2 > 0)) {
                throw new Exception("编辑失败");
            }

        }
        return ResultVo.ok("编辑成功");
    }
}

