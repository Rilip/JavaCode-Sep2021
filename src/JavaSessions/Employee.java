package JavaSessions;

public class Employee {
//class template
	String name;
	int age;
	String city;
	double sal;
	boolean isPerma;
	char gender;
	
	public static void main(String[] args) {
	
		
		Employee e1=new Employee(); 
		
		//e1 is the object reference name
		//RHS ---->"new Employee()"  ,is the Object
		//Employee is the class type   ,class is coming under non-primitive data type
		// non-primitive data type
		
		e1.name="Tom";
		e1.age=25;
		e1.city="Delhi";
		e1.sal=12.33;
		e1.isPerma=true;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.city);//we can create n number of object but reference name should be different
		
		Employee e2=new Employee();
		System.out.println(e2.name+" "+e2.age+" "+e2.city);  //null 0 null   . default vales applicable for class
	//	e2.name="peter";
		System.out.println(e2.name+" "+e2.age+" "+e2.city+" "+e2.sal+" "+e2.isPerma);  //null 0 null 0.0 false
		System.out.println(e2.gender);  //default i will gives blank space
		
		
		
		
	}

}
