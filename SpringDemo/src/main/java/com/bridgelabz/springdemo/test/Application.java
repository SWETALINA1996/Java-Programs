package com.bridgelabz.springdemo.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.springdemo.model.Student;

@RestController
public class Application {

	@RequestMapping("/student")
	public List<Student> print()
	{
		List<Student> list = new ArrayList<>();
		Student s1 = new Student("Simran", 1);
		Student s2 = new Student("Swetalina", 2);
		list.add(s1);
		list.add(s2);
		return list;
	}
}
