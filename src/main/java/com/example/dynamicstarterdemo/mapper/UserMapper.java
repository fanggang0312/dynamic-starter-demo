package com.example.dynamicstarterdemo.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: fanggang
 * @Date: 2020/12/11
 */
@DS("master")
public interface UserMapper {

    int getUserId(@Param("name") String name);

}
