package SuperKeyword;

public class LoginPage extends Page {

	int timeout=200;
	//creating LoginPage Constructor
	public LoginPage() {
	//	System.out.println("hi");
		//Constructor call must be the first statement in a constructor
		super();  //calls the parent class constructor ,super will be the first statement in your child class 
		//you dont have duplicates super() in java ,inside the child class you dont have two super statements
		//super(10);
	//	super(10,20);
		//System.out.println("LP---------->default constructor");
	}
	
	public void loginInfo() {
		System.out.println("login Info method");
		super.display();  //to access parent class ,parent class display()
		display();  //child class
	}
	@Override  //overiding the login page method
	public void display() {
		System.out.println("LP Page Display");
	    super.display();
	}
	public void getTimeOut() {
		System.out.println(timeout);
		System.out.println(super.timeout);  //to access parent class variable  (100)
	}
}
