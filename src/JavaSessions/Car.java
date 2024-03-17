package JavaSessions;

public class Car {
	
	String name;
	int price;
	String colour;
	//int wheels;
	static int wheels=4;
	
	//static value should be common value not common property
	
	//static is only applicable for class variable

	public static void main(String[] args) {
		
		//static int i=10;  //Illegal modifier for parameter i; only final is permitted,//static variable not for local variable
		
		Car c1=new Car();
		c1.name="BMW";
		c1.price=60;
		c1.colour="Blue";
	//	c1.wheels=4;  //The static field Car.wheels should be accessed in a static way
		
		Car c2=new Car();
		c2.name="Audi";
		c2.price=70;
		c2.colour="white";
	//	c2.wheels=4;

		Car c3=new Car();
		c3.name="Honda";
		c3.price=15;
		c3.colour="Black";
	//	c3.wheels=4;
		
		System.out.println(c1.name+":"+c1.price+":"+c1.colour);
		
		//how to access static variable
		//no need to create object ,i can call directly or i can call by class name
		//1.within the same class,you can access them directly
		System.out.println(wheels);  //it is not good practice to print directly , but it is allowed
	//	System.out.println(name);  //name is available in inside the object it is not able to access directly ,,//Cannot make a static reference to the non-static field name
	
		//static variable we can call by class name (best way to call)
		System.out.println(Car.wheels);  //4
		 
		//3.call by object reference
//		System.out.println(c1.wheels);  //4 ,,don't use by reference name/T/he static field Car.wheels should be accessed in a static way
	}

}
