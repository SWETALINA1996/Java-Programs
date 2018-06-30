package com.bridgelabz.springannotations;

public class Employees 
{
String empName;

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}
public Employees() {

}

@Override
public String toString() {
	return "Employees [empName=" + empName + "]";
}

}
