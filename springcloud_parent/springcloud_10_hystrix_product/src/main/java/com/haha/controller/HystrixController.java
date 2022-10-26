package com.haha.controller;

import com.haha.hystrixclient.HystrixClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-25 12:55
 **/
@RestController
public class HystrixController {
    private static final Logger log = LoggerFactory.getLogger(HystrixController.class);
    @Autowired
    HystrixClient hystrixClient;

    @GetMapping("/category")
    public String category(Integer id){
        String demo = hystrixClient.demo(id);
        log.info("当前返回为："+demo);
        return demo;
    }
}
