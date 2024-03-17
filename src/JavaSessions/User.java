package JavaSessions;

public class User {
	//String name="Tom";  it means all the employee name is having  as name Tom  it is ugly code 
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		User u1=new User();
		u1.name="Dhara";
		u1.age=25;
		u1.city="Pune";
		
		User u2=new User();
		u2.name="Prashanth";
		u2.age=30;
		u2.city="Delhi";
		
		User u3=new User();
		u3.name="Neha";
		u3.age=27;
		u3.city="Bangalore";

		System.out.println(u1.name+" "+u1.age+" "+u1.city);  //Dhara 25 Pune
		System.out.println(u2.name+" "+u2.age+" "+u2.city);  //Prashanth 30 Delhi
		System.out.println(u3.name+" "+u3.age+" "+u3.city);  //Neha 27 Bangalore
		
		//reference assignment operator
		u1 = u2;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);  //Prashanth 30 Delhi
		System.out.println(u2.name+" "+u2.age+" "+u2.city);  //Prashanth 30 Delhi
		System.out.println(u3.name+" "+u3.age+" "+u3.city);  //Neha 27 Bangalore
		
		u2=u3;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);  //Prashanth 30 Delhi
		System.out.println(u2.name+" "+u2.age+" "+u2.city);  //Neha 27 Bangalore
		System.out.println(u3.name+" "+u3.age+" "+u3.city);  //Neha 27 Bangalore
		
		u3=u1;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);  //Prashanth 30 Delhi
		System.out.println(u2.name+" "+u2.age+" "+u2.city);  //Neha 27 Bangalore
		System.out.println(u3.name+" "+u3.age+" "+u3.city);  //Prashanth 30 Delhi
		
		//object ref;
		//no ref-->true
		//one ref-->true
		//mult ref-->true		 


	}

}
