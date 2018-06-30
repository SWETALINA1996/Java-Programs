package com.bridgelabz.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
@Product(id = 1, name = "Elect")
@ProductPrice(price = 5000)
public class CustomAnnotation 
{
String productName;
int pid;

@ProductType(type = "household")
public CustomAnnotation(String productName, int pid) 
{
	this.productName = productName;
	this.pid = pid;
}

public void print() {
	System.out.println(this.productName);
	System.out.println(this.pid);
}


@SuppressWarnings("rawtypes")
public static void main(String[] args)
{
	CustomAnnotation annotation = new CustomAnnotation("Television", 123);
	//reflection
	Class a = annotation.getClass();
	Annotation an = a.getAnnotation(Product.class);
	Product pd = (Product)an;
	System.out.println(pd.name());
	System.out.println(pd.id());
	annotation.print();
	
	/*****************************************************************************/
	
	Constructor construct;
	try {
		construct = a.getConstructor(String.class , int.class);
		ProductType an1 = (ProductType) construct.getAnnotation(ProductType.class);
		System.out.println(an1.type());
	} 
	catch (NoSuchMethodException e) {
		e.printStackTrace();
	} 
	catch (SecurityException e) {
		e.printStackTrace();
	}
	

}
}

