package com.term.api.service;

import com.term.api.model.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务降级工厂
 */
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept getDeptById(long id) {
                return new Dept("服务降级");
            }

            @Override
            public List<Dept> getAllDepts() {
                return new ArrayList<>();
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
