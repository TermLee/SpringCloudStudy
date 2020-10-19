package com.term.provider.service;

import com.term.api.model.Dept;
import com.term.provider.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImp implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept) > 0 ? true : false;
    }

    @Override
    public Dept queryDeptById(long id) {
        return deptDao.queryDeptById(id);
    }

    @Override
    public List<Dept> queryAllDepts() {
        return deptDao.queryAllDepts();
    }
}
