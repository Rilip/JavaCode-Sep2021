package OOPS_ENCAPSULATION;

public class AmazonTest {

	public static void main(String[] args) {
	
		LoginPage lp=new LoginPage();
		//lp.username i can't give username directly because it is in private in nature
		lp.setUsername("admin@gmail.com");
		lp.setPassword("admin@123");
		
		lp.login(lp.getUsername(), lp.getPassword());  //login with : admin@gmail.com :admin@123
		
		lp.setPassword("admin@23456");
		lp.login(lp.getUsername(), lp.getPassword());  //login with : admin@gmail.com :admin@23456
		
		LoginPage lp11=new LoginPage();
		lp11.login(lp.getUsername(), lp.getPassword());  //login with : admin@gmail.com :admin@23456
		
		LoginPage lp1=new LoginPage();
		lp1.login(lp1.getUsername(), lp1.getPassword());  //login with : null :null. lp1 reference got changed creating 2 objects

				
	}

}
