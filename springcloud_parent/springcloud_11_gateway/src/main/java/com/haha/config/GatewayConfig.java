package com.haha.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: codes
 * @description: 使用java的方式配置路由
 * @author: xxsj
 * @date: 2022-10-25 19:48
 **/
@Configuration
public class GatewayConfig {
    //配置文件已经配置了，这里注释掉
  /*  @Bean
    public RouteLocator productRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("product",r -> r.path("/product/**")
                        .uri("http://localhost:9010"))
                .build();
    }
    @Bean
    public RouteLocator categoryRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("category",r -> r.path("/category/**")
                        .uri("http://localhost:9011"))
                .build();
    }*/
}
