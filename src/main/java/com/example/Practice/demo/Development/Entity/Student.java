package com.example.Practice.demo.Development.Entity;

public class Student {

	private int id;
	
	private String name;
	
	

	public Student(int id, String string) {
		super();
		this.id = id;
		this.name = string;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
