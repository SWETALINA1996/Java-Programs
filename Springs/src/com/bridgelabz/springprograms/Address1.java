package com.bridgelabz.springprograms;

public class Address1 
{
String ad1;

public String getAd1() {
	return ad1;
}

public void setAd1(String ad1) {
	this.ad1 = ad1;
}
public Address1() 
{
	System.out.println("Address1 found");
}
public Address1(String ad1) {
	super();
	this.ad1 = ad1;
}

@Override
public String toString() {
	return "Address1 [ad1=" + ad1 + "]";
}

}
