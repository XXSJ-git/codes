package com.haha.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.List;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-12 22:41
 **/
@RestController
@Slf4j
public class UserController {
    @Autowired
    private DiscoveryClient discoveryClient; //拉去服务信息
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/findAll")
    public String findAll(){
        log.info("调用用户服务...");
     /*   //1、使用discoveryClient形式调用
        //获取服务的注册表
        List<ServiceInstance> instances = discoveryClient.getInstances("PRODUCTS");
        //使用restTemplate调用商品服务
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject(instances.get(0).getUri()+"/product/findAll", String.class);*/

        //2、使用loadBalanceClient形式调用  轮训的方式
       /* ServiceInstance products = loadBalancerClient.choose("PRODUCTS");
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject(products.getUri()+"/product/findAll", String.class);*/
        //3、使用@loadBalanced +restTemplate
        String forObject = restTemplate.getForObject("http://PRODUCTS/product/findAll", String.class);
        return forObject;
    }
}
