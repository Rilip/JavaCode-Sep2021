package SuperKeyword;

public class TestPage {

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.getTimeOut();  //200 ,  preference will be given to child class
		//can i say variable overriding--No there is no concept of variable overriding (it is not exists) ,, it always method overriding
		lp.loginInfo(); //first it will  calls the parent class constructor ,Page default...constructor
		/*login Info method
          Page Display*/  
		lp.display();
		/*login Info method
          LP Page Display
          LP Page Display
        */
		lp.display();
		/*login Info method
          Page Display
          LP Page Display
          Page Display*/
		lp.display();
		/*Page Display
         LP Page Display
         Page Display
         LP Page Display
         Page Display
         LP Page Display
         Page Display*/

	}

}
