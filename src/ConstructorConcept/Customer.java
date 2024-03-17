package ConstructorConcept;

public class Customer {
// String name;
// int age;
// String comp;
	
	private String name;
	private int age;
	private String comp;
	
	
	//default constructor
	public Customer() {
		System.out.println("Default constructor....");
	}

public Customer(String name, int age, String comp) {
	this.name = name;
	this.age = age;
	this.comp = comp;
}

//can i create getter and setter also:


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getComp() {
	return comp;
}

public void setComp(String comp) {
	this.comp = comp;
}

//features  /methods
public String getCustomerInfo() {
	return name + " "+ age +" "+ comp;
}

 
}
