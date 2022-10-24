package com.haha.controller;

import com.haha.entity.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-22 18:08
 **/
@RestController
public class ProductController {
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);
    @Value("${server.port}")
    private int port;

    @GetMapping("/product")
    public String product(){
        log.info("进入商品服务============");
        return "product  ok,当前端口为："+port;
    }

    @GetMapping("/product/findOne")
    public Map<String,Object> findOne(String productId){
        log.info("商品服务查询商品信息调用成功,当前服务端口:[{}]",port);
        log.info("当前接收商品信息的id:[{}]",productId);
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("msg","商品服务查询商品信息调用成功,当前服务端口: "+port);
        map.put("status",true);
        map.put("productId",productId);
        return map;
    }

    @GetMapping("/product/test1")
    public Map<String,Object> test1(String name,String age){
        log.info("商品服务查询商品信息调用成功,当前服务端口:[{}]",port);
        log.info("当前接收商品信息的name:{}  name:{}",name,age);
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("msg","商品服务查询商品信息调用成功,当前服务端口: "+port);
        map.put("status",true);
        map.put("id",name);
        map.put("name",age);
        return map;
    }
    @GetMapping("/product/test2/{id}/{name}")
    public Map<String,Object> test2(@PathVariable("id") Integer id,@PathVariable("name") String name){
        log.info("商品服务查询商品信息调用成功,当前服务端口:[{}]",port);
        log.info("当前接收商品信息的id:{}  name:{}",id,name);
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("msg","商品服务查询商品信息调用成功,当前服务端口: "+port);
        map.put("status",true);
        map.put("id",id);
        map.put("name",name);
        return map;
    }

    //1.商品服务加入post方式请求并接受name
    @PostMapping("/product/save")
    public Map<String,Object> save(@RequestBody String name){
        log.info("商品服务保存商品调用成功,当前服务端口:[{}]",port);
        log.info("当前接收商品名称:[{}]",name);
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("msg","商品服务查询商品信息调用成功,当前服务端口: "+port);
        map.put("status",true);
        map.put("name",name);
        return map;
    }

    //1.商品服务加入post方式请求并接受name
    @PostMapping("/product/test3")
    public Map<String,Object> test3(@RequestBody UserVO userVo){
        log.info("商品服务保存商品调用成功,当前服务端口:[{}]",port);
        log.info("当前接收商品名称:[{}]",userVo);
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("msg","商品服务查询商品信息调用成功,当前服务端口: "+port);
        map.put("status",true);
        map.put("userVo",userVo);
        return map;
    }
}
