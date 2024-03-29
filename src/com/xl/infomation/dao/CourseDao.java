package com.xl.infomation.dao;

import com.xl.infomation.common.QFDatabase;
import com.xl.infomation.domain.Course;

import java.util.ArrayList;

public interface CourseDao {

    public ArrayList<Course> selectCourse(String sql);

    //添加一个课程信息
    public int addCourse(Course course);

    //根据课程名字查ID
    public boolean searchCourseByName(String name);

    //修改一个课程的信息
    public int updateCourse(Course course);

    //查询课程记录条数
    public static int count(){
        String sql = "select count(1) from course";
        return QFDatabase.count(sql);
    }



}
