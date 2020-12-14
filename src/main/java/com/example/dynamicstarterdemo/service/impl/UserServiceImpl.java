package com.example.dynamicstarterdemo.service.impl;

import com.example.dynamicstarterdemo.mapper.UserMapper;
import com.example.dynamicstarterdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: fanggang
 * @Date: 2020/12/11
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public int getUserId(String name) {
        return userMapper.getUserId(name);
    }
}
