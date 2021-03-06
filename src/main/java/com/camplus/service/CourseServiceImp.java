package com.camplus.service;

import com.camplus.DAO.CourseDiscussDAO;
import com.camplus.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * Created by fowafolo on 15/5/18.
 */

@Service
@Transactional
public class CourseServiceImp implements CourseService{

    @Autowired
    private CourseDiscussDAO courseDiscussDAO;


    public ArrayList<Course> getCoursesByCourseNameAndTeacherName(String courseName,String teacherName){


        ArrayList<Course> courses = new ArrayList<Course>();
        courses = courseDiscussDAO.getCoursesByCourseNameAndTeacherName(courseName,teacherName);
        return courses;
    }

    public Course getCourseById(String courseId) {

        Course course = new Course();
        course = courseDiscussDAO.queryById(courseId);
        return course;
    }

}
