package JavaSessions;

public class Customers {
	
	String name;
	int id;
	static String city="Bangalore";
	static String paymentmethod="CC";
	
	public void getInfo() {
		System.out.println("get info...");
	}
	public static void sentmail() {
		System.out.println("sent mail....");
	}

	public static void main(String[] args) {
		Customers obj=new Customers();  //object hates static 
		//1.call directly
		sentmail();  //sent mail....
		//getInfo();//non static property so we need to create object  //Cannot make a static reference to the non-static method getInfo() from the type Customers 
      obj.getInfo();
      
      //2.using class name
      Customers.sentmail(); //sent mail....  //main method is also static
      
      //3.using obj refere  
      obj.sentmail();  //The static method sentmail() from the type Customers should be accessed in a static way
      
      

	}

}
