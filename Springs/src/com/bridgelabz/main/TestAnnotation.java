package com.bridgelabz.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelabz.springannotations.A;
import com.bridgelabz.springannotations.B;

public class TestAnnotation 
{
public static void main(String[] args)
{
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(A.class);
	B b = applicationContext.getBean(B.class);
	b.setName("Swetalina");
	System.out.println(b.toString());
}
}
