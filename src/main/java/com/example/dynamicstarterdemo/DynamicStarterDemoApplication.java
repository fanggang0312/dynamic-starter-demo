package com.example.dynamicstarterdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dynamicstarterdemo.mapper")
public class DynamicStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicStarterDemoApplication.class, args);
    }

}
