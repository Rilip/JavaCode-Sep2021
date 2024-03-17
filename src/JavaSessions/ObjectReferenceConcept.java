package JavaSessions;

public class ObjectReferenceConcept {
	//class data members are called class variable and class methods
	//class variable
	String name;
	int age;

	//class method
	public void get() {
		System.out.println("get method");
	}
	public static void main(String[] args) {
		
		//static block is class member not a data member
		ObjectReferenceConcept obj=new ObjectReferenceConcept();
		
//		obj=null;  //NPE
//		
//		obj.name="Tom";  //java.lang.NullPointerException  //Null pointer access: The variable obj can only be null at this location
//		obj.age=25;
//		
//		System.out.println(obj.name);  //java.lang.NullPointerException
		
		//object has been created in heap memory
		//reference will be created in stack
		
		 //object has been created but no one is referring
		//no references objects
		new ObjectReferenceConcept().name="Peter";  //3 objects created
		new ObjectReferenceConcept().age=25;
		new ObjectReferenceConcept().get();
		
		ObjectReferenceConcept obj1=new ObjectReferenceConcept();
		
		System.gc();//it will not give any garantee for garbage collector ,scope of the gc is only for the heap,automatic comparison
		
		

	}

}
