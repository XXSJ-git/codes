package com.haha.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-25 11:25
 **/
@RestController
public class DemoController {

    /**
     * 当断路后正常的返回方法也会直接指向testBreakFall，当断路默认时间结束后正常
     * @param id
     * @return
     */
    @GetMapping("/demo")
    @HystrixCommand(fallbackMethod = "testBreakFall")//指定熔断快速返回的方法
    public String demo(Integer id){
        if (0>=id){
            throw new RuntimeException("无效id");
        }
        System.out.println("demo  ok");
        return "demo  ok";
    }
    public String testBreakFall(Integer id){
        return "当前数据不合法: "+id;
    }
}
