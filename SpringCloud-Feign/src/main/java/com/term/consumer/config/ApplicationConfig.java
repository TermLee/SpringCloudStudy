package com.term.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ApplicationConfig {
    //配置负载均衡实现RestTemplate

    /**
     * @LoadBalanced 使用ribbon实现负载均衡，基于IRule接口
     * # RoundRobinRule 轮询
     * # RandomRule 随机
     * # AvailabilityFilteringRule 先过滤掉不能用的服务，然后轮询
     * # RetryRule 先轮询，如果失败，就会在指定的时间内进行重试
     * @return
     */
    @Bean
    @LoadBalanced  //ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
