package com.bridgelabz.springannotations;

public class B
{
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "B [name=" + name + "]";
}

}
