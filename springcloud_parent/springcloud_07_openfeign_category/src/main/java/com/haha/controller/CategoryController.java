package com.haha.controller;

import com.google.gson.Gson;
import com.haha.entity.UserVO;
import com.haha.feignclient.ProductClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-22 18:12
 **/
@RestController
public class CategoryController {
    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);
    @Autowired
    private ProductClient productClient;

    @GetMapping("/category")
    public String category(){
        log.info("category  server =============");
        //String product = productClient.product(); //不带参数的
        //Map<String, Object> one = productClient.findOne("1"); //带参数的get请求
        //Map<String, Object> user = productClient.test1("张三", "13");//get请求   /product/test1?name=&age=
        //Map<String, Object> user1 = productClient.test2(1, "张三");//get请求 /product/test1/{id}/{name}
        //Map<String, Object> save = productClient.save("name");//post请求
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        UserVO userVO = new UserVO();
        userVO.setIds(list);
        userVO.setName("李四");
        userVO.setAge("12");
        Map<String, Object> stringObjectMap = productClient.test3(userVO);
        return new Gson().toJson(stringObjectMap);
    }
    @GetMapping("/category/test1")
    public String categoryTest(){
        log.info("category  server =============");
        return "category  OK！！！";
    }
}
