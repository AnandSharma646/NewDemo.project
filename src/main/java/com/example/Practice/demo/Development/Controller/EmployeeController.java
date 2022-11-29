package com.example.Practice.demo.Development.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Practice.demo.Development.Entity.Employee;
import com.example.Practice.demo.Development.Repo.EmployeeDAO;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@GetMapping(path = "/All", produces = "application/json")
	public List<Employee> getAllEmployee(){
		
		List<Employee> result = employeeDAO.getAllEmployee();
		
		return result;
		
	}

}