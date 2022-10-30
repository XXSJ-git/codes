package com.haha.conrtoller;

import com.alibaba.fastjson.JSON;
import com.haha.openfeignclients.ProductsClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserController {
    @Autowired
    ProductsClient productsClient;

    @GetMapping("/invoke")
    public String invokeProduct(){
        String product = productsClient.product("13");
        log.info("invokeProduct.product... :{}", JSON.toJSONString(product));
        return product;
    }
}
