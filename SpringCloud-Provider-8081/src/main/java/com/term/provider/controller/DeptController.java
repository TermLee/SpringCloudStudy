package com.term.provider.controller;


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
    public Dept getDeptById(@PathVariable("id")long id){
        return deptService.queryDeptById(id);
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
