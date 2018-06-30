package com.bridgelabz.springprograms;

public class Mobile 
{
	
String model;
int id;
SimCard simCard;
Mobile(){}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public SimCard getSimCard() {
	return simCard;
}
public void setSimCard(SimCard simCard) {
	this.simCard = simCard;
}
public Mobile(String model, int id, SimCard simCard) {
	super();
	this.model = model;
	this.id = id;
	this.simCard = simCard;
}
@Override
public String toString() {
	return "Mobile [model=" + model + ", id=" + id + ", simCard=" + simCard + "]";
}

public void init() {
	System.out.println("Initialised...");
}

public void destroy()
{
	System.out.println("Destroyed...");
}
}