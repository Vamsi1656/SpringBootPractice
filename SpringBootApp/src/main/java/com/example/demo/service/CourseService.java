package com.example.demo.service;

import java.util.List;

import com.example.demo.course.Course;

public interface CourseService {
	
	public String upsert(Course course);
	
	public Course getById(Integer id);
	
	public List<Course> getAllCourses();
	
	public String deleteById(Integer id);

}
