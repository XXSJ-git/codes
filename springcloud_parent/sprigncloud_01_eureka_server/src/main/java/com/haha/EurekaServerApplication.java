package com.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: codes
 * @description: 启动类
 * @author: xxsj
 * @date: 2022-10-07 21:05
 **/
@SpringBootApplication
@EnableEurekaServer //声明当前为注册中心
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
