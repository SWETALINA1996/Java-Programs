package com.bridgelabz.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelabz.model.B;

public class TestImport
{
public static void main(String[] args) {
	ApplicationContext app = new AnnotationConfigApplicationContext(B.class);
	
}
}
