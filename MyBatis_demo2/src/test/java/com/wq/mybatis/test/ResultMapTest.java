package com.wq.mybatis.test;

import com.wq.mybatis.mapper.DeptMapper;
import com.wq.mybatis.mapper.EmpMapper;
import com.wq.mybatis.pojo.Dept;
import com.wq.mybatis.pojo.Emp;
import com.wq.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/*
 * @author Wangqian
 * @create 2022-05-16 21:12
 */
public class ResultMapTest {
    @Test
    public void testgetAllEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> emps= mapper.getAllEmp();
        emps.forEach(emp -> System.out.println(emp));
    }
    @Test
    public void testgetCountEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        int count = mapper.getCount();
        System.out.println("count = " + count);
    }
    @Test
    public void testEmpandDept(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpandDept(5);
        System.out.println(emp);
    }
    @Test
    public void testDeptOfEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept=mapper.getDeptOfEmpOne("B");
//        Dept dept= mapper.getDeptOfEmpOne(2);
//        emps.forEach(emp -> System.out.println(emps));
        System.out.println(dept);

    }
}
