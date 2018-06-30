package com.bridgelabz.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging 
{

	@Pointcut("execution(* com.bridgelabz.model.*.*(..))")
	public void selectAll()
	{
		
	}
	/*@Pointcut("execution(public Student.set*(..))")
	public void abc()
	{
		
	}*/

	/*@Before("abc()")
	public void kuchv()
	{
		System.out.println("Printing pointcuts");
	}*/
	@Before("selectAll()")
	public void beforeAdvice()
	{
		System.out.println("Before student profile");
	}
	
	@After("selectAll()")
	public void afterAdvice()
	{
		System.out.println("After Student profile");
	}
	
	@AfterReturning(pointcut = "selectAll()" , returning = "retValue")
	public void afterReturningAdvice(Object retValue)
	{
		System.out.println("Student Profile checked");
	}
	
	@AfterThrowing(pointcut = "selectAll()" , throwing = "excp")
	public void afterThrowing(IllegalArgumentException excp) {
		System.out.println("Exception in student profile");
	}
	
}
