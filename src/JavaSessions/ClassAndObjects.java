package JavaSessions;

public class ClassAndObjects {
    int i=20;
	//int i=10;//class variable ,in case it is not duplicate element ,the scope of the variable is globally
	//how to access class variable ,ans:- need to create object
    //we cannot access the class variable without the creating the object
    //class :-it is the template or blueprint of all objects
	public static void main(String[] args) {
		
		int i=10;   //local variable  is a variable which is available in inside the main method,the scope of the variable is within the method
		System.out.println(i); //10
	//	System.out.println(i); //10
		
		//create the object of the class
		ClassAndObjects obj=new ClassAndObjects();
		System.out.println(obj.i);  //20
		
		 //class :-it is the template or blueprint /category of all objects
		//objects:-objects always physical entity


	}

}
