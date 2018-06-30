package com.bridgelabz.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.Student;

public class SchemaMain
{

	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("studentSchemaContext.xml");  
	     Student student = (Student) context.getBean("student");
	     System.out.println();
	    student.getName();
	    student.getAge();
	    student.printThrowException();
}
}
