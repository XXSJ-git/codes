package com.haha.config;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @program: codes
 * @description: 自定义gateway的filter
 * @author: xxsj
 * @date: 2022-10-26 00:01
 **/
@Configuration
public class CustomGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //httprequestit&
        ServerHttpRequest request = exchange. getRequest () ;
        //httpresponsext&
        ServerHttpResponse response = exchange.getResponse();
        System.out.println("处理请求前的操作。。。。");
        Mono<Void> filter = chain.filter(exchange);

        System.out.println("处理请求后的操作。。。。");
        return filter;
    }
    //order 排字 int数字：用来指定filter执行质字 默认顺字按照自然数字进行排字-1在所有fiiter执行之前执行
    @Override
    public int getOrder() {
        return -1;
    }
}
