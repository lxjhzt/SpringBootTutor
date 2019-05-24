package com.example.demo.service;


import com.example.demo.modal.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> findAllCourses(){

        return courseRepository.findAllClasses();
    }

    public List<Course> addCourses(){

        return courseRepository.addCourses();
    }

    public List<Course> updateCourses(){

        return courseRepository.updateCourses();
    }

    public List<Course> deleteCourses(){

        return courseRepository.deleteCourses();
    }

    public List<Course> searchByCourseName(String input){

        return courseRepository.findCourseByName(input);
    }

}
