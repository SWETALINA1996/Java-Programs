package com.bridgelabz.springdemo.model;

public class Student {
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
public Student() {
		super();
	}
private String name;
private int id;

}
