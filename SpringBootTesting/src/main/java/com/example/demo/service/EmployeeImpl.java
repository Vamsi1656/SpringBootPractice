package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;

	public String upsert(Employee emp) {
		
		repo.save(emp);
		return "success";
	}

	public Employee getById(Integer eId) {
		Optional<Employee> findById= repo.findById(eId);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	public String deleteById(Integer eId) {
		
		if(repo.existsById(eId)) {
			repo.deleteById(eId);
			return "delete success";
		}
		return "Not found";
	}
	
	
	
	

}
