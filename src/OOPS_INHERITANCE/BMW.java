package OOPS_INHERITANCE;

public class BMW extends CAR {
	//Multiple inheritance is not allowed in java
	//method overloading :-only within the same class,there is no concept of parent and child
	//Method Overloading :-this is called compile time polymorphism
	
	//Method Overriding/overridden method(Dynamic polymorphism)
	//Method Overriding :-it always happened between parent and child(MethodOverloading there is no relationship between parent and child class)
	
	//method overriding is type of polymorphism(many+different forms) this is called run time polymorphism
	
	//when you have a method in the parent class and the same method you have in the
	//child class with:
	//the same name
	//same number of parameters:
	//same signature
	//return type should be same
	//modifier should be same
	//Private methods cannot be overridden
	
	
//	@Override
//	public void start(int a) {
//		System.out.println("BMW-------->start");
//	}
//	@Override
//	public void start(int a) {
//		System.out.println("BMW-------->start");
//	}
	
	//Private methods cannot be overridden
	@Override
	public void start(){  //The return type is incompatible with CAR.start(int)
		System.out.println("BMW--------------->Starts");
		
	}
	
	public void autoParking() {
		System.out.println("BMW--------------->(Individual)AutoParking");
	}

//	public static void drive() {  //java is allowed to override the static methods,static method is can't overridden methods,strictly not allowed in JAVA
//		System.out.println("BMW----------->drive"); //static or main method overloading ,Yes i can do that
//	}
	//static methods cannot be overridden but it can be inherited
}
