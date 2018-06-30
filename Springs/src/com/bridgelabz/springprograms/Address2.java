package com.bridgelabz.springprograms;

public class Address2 
{
String ad2;

public String getAd2() {
	return ad2;
}

public void setAd2(String ad2) {
	this.ad2 = ad2;
}

public Address2(String ad2) {
	super();
	this.ad2 = ad2;
}
public Address2()
{
	System.out.println("address 2 found");
}
@Override
public String toString() {
	return "Address2 [ad2=" + ad2 + "]";
}

}
