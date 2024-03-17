package BuilderPattern;

public class EcomApp {

	public EcomApp login() {
		System.out.println("default Login");
		return this;
	}
	//can i over load this constructor
	public EcomApp login(String un,String pwd) {
		System.out.println("Login with : "+ un +":"+ pwd);
		return this;  //every method is returning EcomApp
	}
	
	public EcomApp search() {
		System.out.println("default search...");
		return this;
	}

	//overload the method
	public EcomApp search(String productname) {
		System.out.println("search for : "+productname);
		return this;
	}
	//overload 
	public EcomApp search(String productname,int rating) {
		System.out.println("search for : "+productname+ ":"+ rating);
		return this;
	}
	//add to cart
	public EcomApp addtocart(String productname) {
		System.out.println("add to cart : "+productname);
		return this;
	}
	//do payment
	public EcomApp dopayment(String upi) {
		System.out.println("do payment with : "+upi);
		return this;
	}
	//overload
	public EcomApp dopayment(String CC,int cvv) {
		System.out.println("do payment with : "+CC+ ":" +cvv);
		return this;
	}
    //overload
	public EcomApp dopayment(String CC,int cvv,int otp) {
		System.out.println("do payment with : "+CC+ ":" +cvv + ":" +otp);
		return this;
	}
	
	
	public EcomApp generateOrderid() {
		System.out.println("Order id is :"+1223);
		return this;
	}
	public EcomApp logout() {
		System.out.println("App logout .....");
		return this;
	}

}
