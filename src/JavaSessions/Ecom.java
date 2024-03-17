package JavaSessions;

public class Ecom {

//	public void login() {  //duplicate function is not allowed in java
//	System.out.println(" default login");  
 //return 100;
//}
	//method overloading:-
	//1.with the same class
	//2.different parameters
	//3.different type of parameters ,order doesn't matters
	//4.sequence of parameters should be different
	
	//within same class .. when you have 3 conditions ,when you have number of methods:
	//with the same name
	//different parameters like login with zero parameter and i cannot create with zero parameter with same method name
	public void login() {  //duplicate function is not allowed in java ,it means same method name and same no of parameters
		System.out.println(" default login");
		
	}
	public int login(String un,String pwd) { //2  2-String parameters
		System.out.println("Login with (This is allowed) :"+un+":"+pwd);
		return 100;  //return doesn't matters
	}
	public void login(String un,int OTP) { //2    1-String ,1-int parameter  ,this is also method overloading
		System.out.println("Login with (This is allowed :"+un+":"+OTP);
	}
	public void login(int OTP,String un) { //2   1-int parameter, 1-String  ,this is also allowed  ,this is also method overloading
		System.out.println("Login with (This is allowed :"+un+":"+OTP);
	}
	public void login(String un,String pwd,int OTP) {
		System.out.println("Login with (This is allowed :"+un+":"+pwd+":"+OTP);
	}
	public void login(long phnum,int OTP) {   
		System.out.println("Login with :"+phnum+":"+OTP);
	}
	public void login(int OTP,long phnum) {  //this is not good practice because both are  doing same it is also method overloading ,just interchanging sequence
		System.out.println("Login with :"+OTP+":"+phnum);
	}
	public void login(int OTP,String un,double numb) { 
		System.out.println("Login with :"+OTP+":"+un+":"+numb);
	}
	//(Feature name)search product--method overloading--Amazon applic
	//filters
	//1.name
	//2.name ,price
	//3.name ,price,seller
	public void search() {
		
	}
    public void search(String productname) {
		
	}
    public void search(String productname,int price) {
		
	}
    public void search(String productname,int price,String seller) {
		
	}
    
    //payment
    public void dopayment(String cc,int OTP) {
    	
    }
//    public void dopayment(String db,int OTP) {  //this is not method overloading
//    	
//    }
    public void dopayments(String db,int OTP,String pwd) {  //this is method overloading
    	
    }
    public void dopayments(long phnumb,int OTP) {
    	
    }
    public void dopayments(long phnumb,int OTP,String upi) {
    	
    }
    
    //Uber:
    //booking
    public void booking(String st,String enddt) {
    	System.out.println(st);
    	System.out.println(enddt);
    	
    	System.out.println("endbookings");  //this parameter we re not using in the logic
    	
    }
    public void booking(String st,String enddt,String Cartype) {
    	
    }
    public void booking(String st,String enddt,String Cartype,String CouponCode) {  //09-32
    	
    }
    
	public static void main(String[] args) {
		
		Ecom e1=new Ecom();
		e1.login("admin", "admin");
		
		//uber
		e1.booking("kormangla", "whitefield");
	}

}
