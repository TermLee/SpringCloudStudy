package com.term.consumer.controller;

import com.term.api.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {

    //使用ribbon实现负载均衡，这里应该是一个变量，通过服务名来访问
//    private static String endpoint = "http://localhost:8001/dept";
    private static String endpoint = "http://SPRINGCLOUD-PROVIDER/dept";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("getDept/{id}")
    public Dept getDeptById(@PathVariable("id") long id) {
        return restTemplate.getForObject(endpoint + "/get/" + id, Dept.class);
    }

    @RequestMapping("getAllDept")
    public List<Dept> getAllDept() {
        return restTemplate.getForObject(endpoint + "/list", List.class);
    }

    @RequestMapping("addDept")
    public boolean addDept(@RequestBody Dept dept) {
        return restTemplate.postForObject(endpoint + "/add", dept, Boolean.class);
    }


}
