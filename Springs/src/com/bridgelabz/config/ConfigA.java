package com.bridgelabz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bridgelabz.model.A;

@Configuration
public class ConfigA
{
	@Bean
	public A a()
	{
		return new A();
	}

}
