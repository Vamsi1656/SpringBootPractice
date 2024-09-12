package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/employee")
	public ResponseEntity<String> createEmployee(@RequestBody Employee emp){
		
		String status=service.upsert(emp);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/employee/Id")
	public ResponseEntity<Employee> getEmployee(@PathVariable Integer Id){
		
		Employee emp = service.getById(Id);
		
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	
	@GetMapping("/employee/allEmployees")
	
	public ResponseEntity<List<Employee>> getAllEmployees(@PathVariable Employee emp ){
		
		List<Employee> allEmployees=service.getAllEmployees();
		
		return new ResponseEntity<>(allEmployees,HttpStatus.OK);
	}
	
	
	   @PutMapping("/employee")
       public ResponseEntity<String> updateEmployee(@RequestBody Employee emp){
		
		String status=service.upsert(emp);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	   
	   
	   @DeleteMapping("/employee/Id")
		public ResponseEntity<String> deleteEmployee(@PathVariable Integer Id){
			
			String emp = service.deleteById(Id);
			
			return new ResponseEntity<>(emp,HttpStatus.OK);
		}
		
	   

}
