package OOPS_ABSTRACT;

public class AmazonTest {

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.title();//Overridden methods
		lp.url();//Overridden methods
		lp.header();//inherited methods
		lp.dologin("admin", "admin");  //overloaded methods,individual method
		/*LP---------->title
          Page header
          Login with : :admin:admin*/
		HOMEPAGE hp=new HOMEPAGE();
		//Overridden methods
		hp.title();
		hp.url();
		hp.header();
		//in homepage we don't have individual methods
		//i cant access hp.dologin(); because they are siblings 
		hp.logout();
		
		//page is the abstract class,objects can't be created
		//PAGE pg=new PAGE();  //Cannot instantiate the type PAGE
		
		//can i do top casting:
		//child class object  can be reffered by parent class abstract...class ref variable
		//top casting is allowed
		PAGE p=new LoginPage();  //limitation of top casting i can not access individual method of login class
		p.title();
		p.header();
		p.url();
		//p.dologin  //Reference type check got failed
		
		//down casting  CT also not allowed
	//	LoginPage l1=new PAGE();

	}

}
