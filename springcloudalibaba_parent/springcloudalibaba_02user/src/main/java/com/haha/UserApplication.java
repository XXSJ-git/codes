package com.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-27 16:52
 **/
@SpringBootApplication
@EnableDiscoveryClient //开启服务注册
@EnableFeignClients //开启openfeign注解
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
