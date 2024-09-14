package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Students;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo repo;

	@Override
	public String upsert(Students st) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Students getById(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Students> getAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
