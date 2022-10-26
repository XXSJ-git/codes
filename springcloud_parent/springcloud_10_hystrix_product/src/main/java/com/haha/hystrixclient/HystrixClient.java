package com.haha.hystrixclient;

import com.haha.fallback.HystrixClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-25 12:52
 **/
@FeignClient(value = "HYSTRIX",fallback = HystrixClientFallBack.class)//指定调用服务的名字,fallback：指定默认备选处理
public interface HystrixClient {
    @GetMapping("/demo")
    String demo(@RequestParam("id") Integer id);
}
