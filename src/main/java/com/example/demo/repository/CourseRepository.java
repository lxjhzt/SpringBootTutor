package com.example.demo.repository;

import com.example.demo.modal.Course;
import com.example.demo.modal.Instructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class CourseRepository {
    List<Course> courses = new ArrayList<>();
    //constructor
    public CourseRepository() {
        Course javaOne = Course.builder()
                .className("Java I")
                .instructor(new Instructor("Steve", "Jobs", "Phd", "TownHall201"))
                .startDate(new Date("8/1/2018"))
                .endDate(new Date("12/24/2018"))
                .timeFrame("8am-10am")
                .build();

        courses.add(javaOne);
    }


    public List<Course> findAllClasses(){
        //链接数据库
        //返回数据库的信息
        return  courses;
    }

    public List<Course> addCourses(){
        //链接数据库
        //返回数据库的信息
        Course javaTWO = Course.builder()
                .className("Java I")
                .instructor(new Instructor("ABB", "CDD", "Phd", "BALABALA"))
                .startDate(new Date("8/1/2030"))
                .endDate(new Date("12/24/2030"))
                .timeFrame("8am-10am")
                .build();

        courses.add(javaTWO);

        return  courses;
    }

    public List<Course> updateCourses(){
        //链接数据库
        //返回数据库的信息
        Course XX = Course.builder()
                .className("MATH")
                .instructor(new Instructor("ABB", "CDD", "Phd", "BALABALA"))
                .startDate(new Date("8/1/2030"))
                .endDate(new Date("12/24/2030"))
                .timeFrame("8am-10am")
                .build();

        courses.set(0,XX);

        return  courses;
    }


    public List<Course> deleteCourses(){
        //链接数据库
        //返回数据库的信息


        courses.remove(0);

        return  courses;
    }

    public List<Course> findAllCourse(String searchByCourseName){

        return new ArrayList<Course>();
    }

    public List<Course> findCourseByName(String courseName) {
        if(courseName.equals("Java_I")) {
            return courses;
        }

        return new ArrayList<Course>();
    }
}
