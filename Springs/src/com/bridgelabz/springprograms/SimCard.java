package com.bridgelabz.springprograms;

public class SimCard 
{
	String name;
	long number;
	public SimCard() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public SimCard(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return "SimCard [name=" + name + ", number=" + number + "]";
	}
	
}
