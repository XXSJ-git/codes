package com.haha.conrtoller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-27 16:56
 **/
@RestController
@Slf4j
public class ProductsController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/product")
    public String product(String id){
        log.info("product.params... id:{}", JSON.toJSONString(id));
        return "商品服务返回："+id+"，当前提供服务端口为："+port;
    }
}
