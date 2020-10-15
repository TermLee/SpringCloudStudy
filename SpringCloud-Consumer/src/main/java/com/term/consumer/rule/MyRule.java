package com.term.consumer.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    @Bean
    public IRule getRule(){
        //也可以在这自定义一个Rule，实现AbstractLoadBalancerRule抽象类
       return new RandomRule();
    }
}
