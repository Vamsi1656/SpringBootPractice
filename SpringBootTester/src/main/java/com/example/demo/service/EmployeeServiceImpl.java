package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public String upsert(Employee emp) {
		
		repo.save(emp);
		
		return "success";
	}

	@Override
	public Employee getById(Integer Id) {
		
	 Optional<Employee>	findById=repo.findById(Id);
	 
	 if(findById.isPresent()) {
		 return findById.get();	
	 }
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
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
