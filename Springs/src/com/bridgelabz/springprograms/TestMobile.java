package com.bridgelabz.springprograms;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMobile 
{
public static void main(String[] args) {
	Resource resource = new ClassPathResource("mobileContext.xml");
	BeanFactory factory = new XmlBeanFactory(resource);
	//ApplicationContext app = new ClassPathXmlApplicationContext("mobileContext.xml");
	Mobile mobile = (Mobile) factory.getBean("mobilebean");
	//BeanFactory xml=(BeanFactory)mobile;
	//ClassPathResource rs=(ClassPathResource)xml;
	//Mobile mob=app.getBean("mobilebean", Mobile.class);
	
	System.out.println(mobile.toString());
	/*ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext)app;
	context.close();*/
	((ConfigurableBeanFactory) factory).destroyBean("mobilebean", Mobile.class);
	
	
}
	
}
