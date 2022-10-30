package com.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-28 23:10
 **/
@SpringBootApplication
@EnableDiscoveryClient //开启注册
public class SentinelApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication.class, args);
    }
}
