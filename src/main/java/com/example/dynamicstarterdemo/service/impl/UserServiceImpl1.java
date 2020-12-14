package com.example.dynamicstarterdemo.service.impl;

import com.example.dynamicstarterdemo.mapper.UserMapper1;
import com.example.dynamicstarterdemo.service.UserService1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: fanggang
 * @Date: 2020/12/11
 */
@Service
public class UserServiceImpl1 implements UserService1 {
    @Resource
    UserMapper1 userMapper1;
    @Override
    public int getUserId(String name) {
        return userMapper1.getUserId(name);
    }
}
