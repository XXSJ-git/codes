package com.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: codes
 * @description: consul客户端
 * @author: xxsj
 * @date: 2022-10-10 22:20
 **/
@SpringBootApplication
@EnableDiscoveryClient //通用服务注册注解
public class ConsulClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulClientApplication.class,args);
    }
}
