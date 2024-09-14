package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Students;

public interface StudentService {
	
public String upsert(Students st);
	
	public Students getById(Integer Id);
	
	public List<Students> getAllStudents();
	
	public List<Students> getAllCourses();
	
	public String deleteById(Integer Id);

}
