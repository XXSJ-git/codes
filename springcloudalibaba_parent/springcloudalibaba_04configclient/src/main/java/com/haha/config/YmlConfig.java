package com.haha.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-28 02:06
 **/
@Component
@Data
@RefreshScope //实现自动刷新配置
public class YmlConfig {
    @Value("${com.haha}")
    private String haha;
}
