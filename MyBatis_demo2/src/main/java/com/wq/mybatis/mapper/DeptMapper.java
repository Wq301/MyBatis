package com.wq.mybatis.mapper;

import com.wq.mybatis.pojo.Dept;
import com.wq.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 * @author Wangqian
 * @create 2022-05-16 21:01
 */
public interface DeptMapper {
    //使用分步查询解决一对多
    //查询部门中的所有员工
    Dept getDeptOfEmpOne(@Param("dept_name") String dept_name);
//    Dept getDeptOfEmpOne(@Param("did") Integer did);
}
