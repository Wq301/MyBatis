package com.wq.mybatis.mapper;

import com.wq.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 * @author Wangqian
 * @create 2022-05-16 21:00
 */
public interface EmpMapper {
    //1、查询所有的员工信息
    List<Emp> getAllEmp();
    //2、查询员工表的记录条数
    int getCount();
    //解决多对一的问题associstion
    //3、查询所员工的信息及部门信息
    Emp getEmpandDept(@Param("eid") Integer eid);


    //使用分步查询的第二步
    List<Emp> getDeptOfEmpTwo(@Param("did") Integer did);
}
