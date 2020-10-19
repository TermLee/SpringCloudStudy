package com.term.provider.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.term.api.model.Dept;
import com.term.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DiscoveryClient client; //微服务发现客户端
    @Autowired
    private DeptService deptService;

    @PostMapping("add")
    public boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGetDeptById")
    public Dept getDeptById(@PathVariable("id")long id){
        final Dept dept = deptService.queryDeptById(id);
        if (dept == null) {
            throw new RuntimeException();
        }
        return dept;
    }

    /**
     * 服务备选方法（服务熔断）。
     * @param id Dept's id
     * @return Dept 返回值要跟原方法一致
     */
    public Dept hystrixGetDeptById(@PathVariable("id")long id) {
        return new Dept("没有找到对应信息或服务器异常，请稍后重试!");
    }
    @GetMapping("list")
    public List<Dept> getAllDepts(){
        return deptService.queryAllDepts();
    }
    @GetMapping("discovery")
    public Object discovery(){


        return client;
    }

}
