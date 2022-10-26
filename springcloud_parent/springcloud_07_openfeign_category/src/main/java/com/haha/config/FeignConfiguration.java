package com.haha.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: codes
 * @description: 通过代码的形式 配置openfeign负载均衡
 *     1、 RoundRobinRule
 * 　　　　轮询策略：Ribbon 默认采用的策略。若经过一轮轮询没有找到可用的provider，其最多轮询 10 轮（代码中写死的，不能修改）。若还未找到，则返回 null。
 * 　　2、RandomRule
 * 　　　　随机策略：从所有可用的 provider 中随机选择一个。
 * 　　3、RetryRule
 * 　　　　重试策略：先按照 RoundRobinRule 策略获取 server，若获取失败，则在指定的时限内重试。默认的时限为 500 毫秒。
 * 　　4、BestAvailableRule
 * 　　　　最可用策略：选择并发量最小的 provider，即连接的消费者数量最少的provider。其会遍历服务列表中的每一个server，选择当前连接数量minimalConcurrentConnections 最小的server。
 * 　　5、AvailabilityFilteringRule
 * 可用过滤算法：该算法规则是过滤掉处于熔断状态的 server 与已经超过连接极限的server，对剩余 server 采用轮询策略。
 * @author: xxsj
 * @date: 2022-10-25 16:07
 **/
@Configuration
public class FeignConfiguration {
    /**
     * 配置随机的负载均衡策略
     * 特点：对所有的服务都生效
     */
    @Bean
    public IRule loadBalancedRule() {
        return new RandomRule();
    }
}
