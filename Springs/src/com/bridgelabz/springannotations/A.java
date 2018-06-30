package com.bridgelabz.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class A 
{
	//B b;
	@Bean
	public  B b()
	{
		return new B();
	
	}
}
