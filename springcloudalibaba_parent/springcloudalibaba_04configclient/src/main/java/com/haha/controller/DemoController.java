package com.haha.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-27 22:48
 **/
@Slf4j
@RestController
@RefreshScope //实现自动刷新配置
public class DemoController {
    @Value("${com.haha}")
    String a;
   /* @Autowired
    YmlConfig ymlConfig;*/
    @GetMapping("/demo")
    public String demo(){
        log.info("demo.haha... :{}", JSON.toJSONString(a));
        return "demo  ok！！！"+ a;
    }
}
