package com.example.demo.service;

import java.util.List;
import java.util.Optional;

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
	     repo.save(st);
		return "success";
	}

	@Override
	public Students getById(Integer Id) {
		Optional<Students> findById= repo.findById(Id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Students> getAllStudents() {
		return repo.findAll();
		
	}

	@Override
	public List<Students> getAllCourses() {
		return repo.findAll();
	}

	@Override
	public String deleteById(Integer Id) {
		if(repo.existsById(Id)) {
			repo.deleteById(Id);
			return "delete success";
		}
		return "Not found";
	}

}
