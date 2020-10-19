package com.term.api.service;

import com.term.api.model.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER", fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    public Dept getDeptById(@PathVariable("id")long id);

    @GetMapping("/dept/list")
    List<Dept> getAllDepts();

    @PostMapping("/dept/add")
    boolean addDept(@RequestBody Dept dept);

}
