package OOPS_INHERITANCE;

//Multiple inheritance is not allowed in java
//multilevel inheritance is allowed in java
//siblings inheritance is not allowed in java
//parent cannot inherit from child class(Reverse inheritance is not allowed in java)
//static method cannot be over ride but it can be overloaded

public class CAR extends Vehicle{
	
	//if the class is declared with final then that class cannot  be parent
	//if the method is declared with final then  that method cannot be overridden

//	public void start(int a) {  //int a                
//		System.out.println("Car--------------->Starts");
//	}
	@Override
	public void start() { // default method overriding
		System.out.println("Car--------------->Starts");
	}
//	public int start(int a) {
//		System.out.println("Car--------------->Starts");
//		return 100;
//	}
	public void stop() {
		System.out.println("Car--------------->Stops");
	}
	public void refuel() {
		System.out.println("Car--------------->Refuel");
	}
	public static void drive() {
		System.out.println("Car----------->drive");
	}
}
