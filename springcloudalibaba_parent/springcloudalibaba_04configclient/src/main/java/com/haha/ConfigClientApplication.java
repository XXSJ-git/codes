package com.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-27 22:47
 **/
@SpringBootApplication
@EnableDiscoveryClient //开启注册中心注解（不写默认加上了）
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
