package com.haha.openfeignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-27 19:06
 **/
@FeignClient("PRODUCTS")
public interface ProductsClient {

    @GetMapping("/product")
    String product(@RequestParam("id") String id);

}
