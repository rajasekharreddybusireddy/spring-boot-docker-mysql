package com.blogspot.javabyrajasekhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blogspot.javabyrajasekhar.entity.Employee;
import com.blogspot.javabyrajasekhar.repository.EmployeeRepository;

@RestController("/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
		
	}
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee){
		return employeeRepository.save(employee);
		
	}
}
