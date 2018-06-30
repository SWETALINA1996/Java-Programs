package com.bridgelabz.springprograms;

public class Address
{
	String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address()
	{
	System.out.println("Address found");	
	}
	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	

}
