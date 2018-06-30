package com.bridgelabz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.bridgelabz.model.A;
import com.bridgelabz.model.B;

@Configuration
@Import(ConfigA.class)
public class ConfigB 
{
@Bean
public B a()
{
return new B();
}
}
