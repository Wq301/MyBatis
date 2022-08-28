package com.wq.mybatis.mapper;

import com.wq.mybatis.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-07-02 19:36
 */
public interface StudentMapper {

    List<Student> getAllStu();

    Integer insertStu(Student student);

    Integer updataStuById(@Param("stu_id") Integer sid);

    Integer deleteStuByName(@Param("stuName")String stuName);

    List<Student> getStuandGarde();
    List<Student> getStu(@Param("cid")Integer cid);
    Student getStuandGar(@Param("sid") Integer sid);
}
