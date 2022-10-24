package com.haha.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-13 22:26
 **/
@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced //让restTemplate具有bibbon特性
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
