package ConstructorConcept;

public class Employee {

	String name;
	int id;
	int age;
	double sal;
	boolean isPerm;
	char gender;
	
	
	//constructors
	//name of the constructor will be same as Class name
	//constructors look like function ,but it is not function
	//constructor can  not have any return type,no void in nature and no return keyword
	//constructor will remains as class name
	//constructor will be called when we create object of this class
	
	//function may or may not return the value  ,but constructor will be not returning any value
	//function name will be anything ,but constructor name will be remains class name
	//function will be having business logic or feature logic..and constructor will be helping to create the object
	//to call the function we need to create object and we need to use object reference variable
	// to call the constructor just we need to create the object and supply the values as per the you defined constructor
	public Employee() {  //0 param,default constructor
		System.out.println("default constructor");
	}
	//constructor overloading is possible --YES
	public Employee(int a) {  //one parameter constructor
		System.out.println(a);
	}
	//we need to assign the vales name to Name ,id to Id ,,for this we need to use " this " keyword
	public Employee(String Name,int Id) {
		this.name=Name;
		this.id=Id;
	}
	public Employee(String Name,int Id,int Age) {  //
		this.name=Name;
		this.id=Id;
		this.age=Age;
	}
	public Employee(String Name,boolean IsPerm) {
		this.name=Name;
		this.isPerm=IsPerm;
	}
/*	public Employee(String Name,int Id,int Age,boolean IsPerm,double Sal,char Gender) {  
		this.name=Name;
		this.id=Id;
		this.age=Age;
		this.isPerm=IsPerm;
		this.sal=Sal;
		this.gender=Gender;
	}*/
	public Employee(String name, int id, int age, double sal, boolean isPerm, char gender) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.sal = sal;
		this.isPerm = isPerm;
		this.gender = gender;
	}//right click-source-generate constructor
   public Employee(String name, char gender) {
	//constructor is helping to design the object as we are restricting
	this.name = name;
	this.gender = gender;
}
	
	
}
