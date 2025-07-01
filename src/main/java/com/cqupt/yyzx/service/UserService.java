package com.cqupt.yyzx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.yyzx.pojo.User;
import com.cqupt.yyzx.utils.ResultVo;

public interface UserService extends IService<User> {
    public ResultVo<User> login(String username, String password)throws Exception;
}
