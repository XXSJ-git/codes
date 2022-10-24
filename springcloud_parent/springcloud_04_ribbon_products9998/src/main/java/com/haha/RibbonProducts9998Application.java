package com.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: codes
 * @description: 商品服务
 * @author: xxsj
 * @date: 2022-10-12 22:26
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonProducts9998Application {
    public static void main(String[] args) {
        SpringApplication.run(RibbonProducts9998Application.class,args);
    }
}
