package ConstructorConcept;

public class EmpTest {

	public static void main(String[] args) {
	
		Employee e1=new Employee();  //default constructor will be called
		e1.name="Poorinma";
		e1.age=25;
		e1.id=100;
		e1.isPerm=true;
		e1.gender='f';
		
		//single parameter constructor  
		
		Employee e2=new Employee(10);  //10
		
		Employee e3=new Employee("Tom", 201);
		System.out.println(e3.name+" "+e3.id);  //Tom 201
		System.out.println(e3.name+" "+e3.id+" "+e3.age+" "+e3.isPerm+" "+e3.gender);  //Tom 201 0 false  ,for age, isperma ,gender  it will print default values ,even though we assigned only two variables
		//advantage:-whenever you create object but you dont have complete data i  can give liberty or provision you can create object for certain values
		//constructor will help me to create the object
		
		Employee e4=new Employee("peter", 202, 30, 10.44, true, 'm');
       System.out.println(e4.isPerm);  //true
				
       //Users Class
       Users u1=new Users("Naveen", "Bagalore");
       Users u2=new Users("Tom", 100, "NY");
       Users u3=new Users("Rahul", 102, true, "pune");
      // Users u4=new Users ,we cant create default constructor because your restricting unnecessary object
       
       //MYSYSTEM Clas
       //MySystem sys=new MySystem();
       
     //  System sys=new System();  //The constructor System() is not visible  it is not allowed to create object of System Class
	}

}
