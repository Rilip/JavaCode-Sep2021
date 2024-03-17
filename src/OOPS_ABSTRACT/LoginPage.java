package OOPS_ABSTRACT;

public class LoginPage extends PAGE {

	//at run time it will create default constructor internally is called hidden constructor  ..by JAVA
	//creating constructor
	public LoginPage() {
		System.out.println("LP--------------->Default constructor");
	}
	
	@Override
	public void title() {
		System.out.println("LP---------->title");
		
	}

	@Override
	public void url() {
	System.out.println("LP------------->url");
		
	}
//individual methods
	public void dologin(String un,String pwd) {
		System.out.println("Login with : "+":"+un+":"+pwd);
	}
	//overloaded methods ,method overloading
	public void dologin(String un,String pwd,long phnumb) {
		System.out.println("Login with : "+":"+un+":"+pwd+":"+phnumb);
	}
}
