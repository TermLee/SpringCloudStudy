package com.term.consumer.controller;

import com.term.api.model.Dept;
import com.term.api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/feign")
public class DeptConsumerController {


    @Autowired
    private DeptClientService service;


    @RequestMapping("getDept/{id}")
    public Dept getDeptById(@PathVariable("id") long id) {
        return service.getDeptById(id);
    }

    @RequestMapping("getAllDept")
    public List<Dept> getAllDept() {
        return service.getAllDepts();
    }

    @RequestMapping("addDept")
    public boolean addDept(@RequestBody Dept dept) {
        return service.addDept(dept);
    }


}
