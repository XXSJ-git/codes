package com.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: codes
 * @description: 类别
 * @author: xxsj
 * @date: 2022-10-22 17:45
 **/
@SpringBootApplication
@EnableDiscoveryClient //通用服务注册注解
@EnableFeignClients //Open Feign注解
public class CategoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(CategoryApplication.class, args);
    }
}
