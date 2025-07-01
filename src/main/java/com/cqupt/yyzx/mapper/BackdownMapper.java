package com.cqupt.yyzx.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cqupt.yyzx.pojo.Backdown;
import com.cqupt.yyzx.vo.BackdownVo;
import org.apache.ibatis.annotations.Param;


/*定义一个名为 BackdownMapper 的接口，继承自 BaseMapper<Backdown>。
这样该接口自动拥有了对 Backdown 实体的增删改查等基础数据库操作方法，无需手动编写实现。
*/
public interface BackdownMapper extends   BaseMapper<Backdown> {

    Page<BackdownVo> selectBackdownVo(@Param("page") Page<BackdownVo> page, @Param("userId") Integer userId);


}
