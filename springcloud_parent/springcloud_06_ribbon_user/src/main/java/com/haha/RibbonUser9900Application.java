package com.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: codes
 * @description: 用户服务
 * @author: xxsj
 * @date: 2022-10-12 22:32
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonUser9900Application {
    public static void main(String[] args) {
        SpringApplication.run(RibbonUser9900Application.class,args);
    }
}
