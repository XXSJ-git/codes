package com.haha.fallback;

import com.haha.hystrixclient.HystrixClient;
import org.springframework.stereotype.Component;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-25 12:56
 **/
@Component
public class HystrixClientFallBack implements HystrixClient {

    @Override
    public String demo(Integer id) {
        return "当前网络服务不可以请稍后再试！";
    }
}
