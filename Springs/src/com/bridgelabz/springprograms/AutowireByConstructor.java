package com.bridgelabz.springprograms;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AutowireByConstructor {

	public static void main(String[] args) 
	{
		
		Resource resource = new ClassPathResource("autowireContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee employee = (Employee) factory.getBean("employeeee");
		System.out.println(employee.toString());
	}

}
