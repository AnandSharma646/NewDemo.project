package com.example.Practice.demo.Development.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Practice.demo.Development.Entity.Employee;
import com.example.Practice.demo.Development.Entity.Student;
import com.example.Practice.demo.Development.Repo.EmployeeDAO;
import com.example.Practice.demo.Development.Repo.StudentDAO;

@RestController
public class StudentController {
	
	@Autowired
	StudentDAO studentDAO;
	
	@GetMapping(path = "/AllStudent", produces = "application/json")
	public List<Student> getAllEmployee(){
		
		List<Student> result = studentDAO.getAllStudent();
		
		return result;
		
	}

}
