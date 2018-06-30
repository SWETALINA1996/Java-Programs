package com.bridgelabz.springannotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Company 
{
private Employees employee;
@Autowired
public void setEmployees(Employees e)
{
	this.employee = e;
}
public Company() {

}
@Override
public String toString() {
	return "Company [employee=" + employee + "]";
}
}
