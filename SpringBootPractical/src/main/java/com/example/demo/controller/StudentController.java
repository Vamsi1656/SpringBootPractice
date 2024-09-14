package com.example.demo.controller;

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

import com.example.demo.entity.Students;
import com.example.demo.service.StudentService;

@RestController

public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/student")
	public ResponseEntity<String> createstudent(@RequestBody Students st)
	{
		String status=service.upsert(st);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	@GetMapping("/student/{Id}")
	public ResponseEntity<Students> getById(@PathVariable Integer Id)
	{
		Students getById=service.getById(Id);
		return new ResponseEntity<>(getById,HttpStatus.OK);
	}
	
	@PutMapping("/student")
	public ResponseEntity<String> updatestudent(@RequestBody Students st)
	{
		String status=service.upsert(st);
		
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/student/{Id}")
	public ResponseEntity<String> deleteById(@PathVariable Integer Id)
	{
		String st=service.deleteById(Id);
		return new ResponseEntity<>(st,HttpStatus.OK);
	}

}
