package com.cqupt.yyzx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqupt.yyzx.mapper.UserMapper;
import com.cqupt.yyzx.pojo.User;
import com.cqupt.yyzx.service.UserService;
import com.cqupt.yyzx.utils.ResultVo;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public ResultVo<User> login(String username, String password) throws Exception {
        // 这里写你的登录逻辑
        return null;
    }
}