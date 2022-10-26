package com.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-25 11:24
 **/
@SpringBootApplication
@EnableDiscoveryClient //开启服务注册
@EnableCircuitBreaker //开启断路器
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}
