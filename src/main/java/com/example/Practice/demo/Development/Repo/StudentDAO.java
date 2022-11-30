package com.example.Practice.demo.Development.Repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Practice.demo.Development.Entity.Employee;
import com.example.Practice.demo.Development.Entity.Student;

@Repository
public class StudentDAO {
	
	public static List<Student> list = new ArrayList<Student>();

	static {

		try {
			list.add(new Student(1, "Avinash"));

			list.add(new Student(2, "Anand"));

			list.add(new Student(3, "KUldeep"));

			list.add(new Student(4, "Satya"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public List<Student> getAllStudent() {
		
		return list;
	}

}
