package com.example.dynamicstarterdemo.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;

/**
 * @Author: fanggang
 * @Date: 2020/12/11
 */
@DS("slave")
public interface UserMapper1 {

    int getUserId(String name);

}
