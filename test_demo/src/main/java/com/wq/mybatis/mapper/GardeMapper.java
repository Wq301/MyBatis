package com.wq.mybatis.mapper;

import com.wq.mybatis.pojo.Grade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-07-02 22:14
 */
public interface GardeMapper {
    List<Grade> getGradeById(@Param("cid")Integer cid);

    List<Grade> getAllGrade();

    List<Grade> getGrade(@Param("cid")Integer cid);

    Grade getStuOfGrade(@Param("cid")Integer cid);
}
