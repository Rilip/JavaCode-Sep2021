package OOPS_INTERFACE;

//interface by default static and final in nature
//interface values can not be changed ,once it is defined values it can not be overridden and it can not be changed also

//in Interface ,can't have method body
//only Method Prototype  --this type of methods is called abstract methods
//no method body only method declaration
//interface can't have business logic
//abstract method is method which doesnt have method body
//can not create the object of interface
//an INTERFACE doesnot have Superclass
public interface USMedical extends WHO{  //UN----> The type UN cannot be a superinterface of USMedical;an interface can't have superclass, s a super interface must be an interface
//can we have parent class interface -Not allowed in java
//	public void physoservice() {  //Abstract methods do not specify a body	
//	}
//	public  int min_fee=100;  //can not be changed ,by default final in nature
	
	public final static int min_fee=100;
	
	public void physoService();  //declare the method without method body
	
	public void cardioService();
	
	public void oncologyServices();
	
	public void emergencyServices();
	
	//after jdk 1.8 two major changes happened
	//1.you can have static methods with the method body
	//static methods is allowed in java with method body
	//static methods cannot be overridden
	//interface methods are by default non static
	public static void billing() {
		System.out.println("USMedical----------->billing");
	}
	//2.you can have default method with method body  which is non-static
	default void medicalinsurance() {
		System.out.println("US default  ----------->medicalinsurance");
	}
	
}
