package com.term.provider.service;

import com.term.api.model.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryDeptById(long id);

    List<Dept> queryAllDepts();
}
