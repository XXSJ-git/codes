package com.haha.feignclient;

import com.haha.controller.entity.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @program: codes
 * @description: 调用商品服务接口
 * @author: xxsj
 * @date: 2022-10-23 22:56
 **/
@FeignClient(value = "PRODUCT")//表示需要调用的服务毛
public interface ProductClient {

    @GetMapping("/product") //表示需要调用接口的类型已经路径
    public String product();
    //get请求带参数的
    @GetMapping("/product/findOne")
    Map<String, Object> findOne(@RequestParam("productId") String productId);

    //参数传递需要添加注解
    @GetMapping("/product/test1")
    public Map<String,Object> test1(@RequestParam("name") String name,@RequestParam("age") String age);

    @GetMapping("/product/test2/{id}/{name}")
    public Map<String,Object> test2(@PathVariable("id") Integer id,@PathVariable("name") String name);


    //post请求
    @PostMapping("/product/save")
    Map<String,Object> save(@RequestBody String name);

    //post请求传对象
    @PostMapping("/product/test3")
    public Map<String,Object> test3(@RequestBody UserVO userVo);
}
