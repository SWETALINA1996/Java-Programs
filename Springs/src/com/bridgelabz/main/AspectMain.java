package com.bridgelabz.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.Student;

public class AspectMain 
{
	public static void main(String[] args) {
		
	 ApplicationContext context = new ClassPathXmlApplicationContext("studentApplicationContext.xml");  
     Student student = (Student) context.getBean("studentbean");
     System.out.println();
    student.getName();
    student.getAge();
    student.printThrowException();
     
     
	}    
}
