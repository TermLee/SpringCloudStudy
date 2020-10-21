package com.term.provider.dao;

import com.term.api.model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    int addDept(Dept dept);

    Dept queryDeptById(@Param("id")long id);

    List<Dept> queryAllDepts();

}
