package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="StudentDtls")

public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="StudentName")
	private String name;
	
	@Column(name="StudentCourse")
	private String coursename;
	
	@Column(name="CourseFee")
	private double coursefee;
	
	@Column(name="Stupaidfee")
	private double paidfee;
	
	@Column(name="Sturemainingfee")
	private double remainingfee;
	

}
