package BuilderPattern;

public class TestAmazon {

	public static void main(String[] args) {
		EcomApp user=new EcomApp();
		//Usecas1
		/*Login with : kaur@gmail.com:kaurl123
          search for : Nike Tshirt
          add to cart : Nike Tshirt
          do payment with : 65430 684648 776767 8777:989
          Order id is :1223
          App logout .....*/
		//i want to create by using builder pattern
		user.login("kaur@gmail.com", "kaurl123").
		search("Nike Tshirt")  
		.addtocart("Nike Tshirt")
		.dopayment("65430 684648 776767 8777", 989)
		.generateOrderid()
		.logout();
		
		//Usecase-2  17-36
		/*
		 * Login with : kaur@gmail.com:kaurl123
           add to cart : Mackbook Pro
           do payment with : test@icici
           Order id is :1223
           App logout .....*/
		 
		user.login("kaur@gmail.com", "kaurl123")
		.addtocart("Mackbook Pro")
		.dopayment("test@icici")
		.generateOrderid()
		.logout();
		
		//Usecase -3
		user.login()
		.addtocart("Puma shoes")
		.logout();
		
		//Usecase-4
		user.login("Naveen@gmail.com", "naveen@123")
		.search("Gym Equipments", 4)
		.logout();
		
		//usecase-5
		user.login("dhara@gmail.com", "dhara234")
		.logout();
		
		//Login with : kaur@gmail.com:kaurl123  
		//it is returning current class object
		/*
		 * default Login
           search for : Mackbook
           add to cart : mackbook

		 */
//		user.login();
//		user.search("Mackbook");
//		user.addtocart("mackbook");

	}

}
