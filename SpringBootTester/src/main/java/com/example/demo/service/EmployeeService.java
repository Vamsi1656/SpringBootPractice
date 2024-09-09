package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	
	
	public String upsert(Employee emp);
	
	public Employee getById(Integer Id);
	
	public List<Employee> getAllEmployees();
	
	public String deleteById(Integer Id);
	

}
