package OOPS_ENCAPSULATION;

public class Employee {

	public static void main(String[] args) {
		
		//i can create object  of any class
		
		Company c1=new Company();  //we are giving 3 properties of company class,so you are creating outside of the company class
		//but we cant access share price because it is in private in nature
		c1.name="MS";
		c1.hq="HYD";
		
		System.out.println(c1.name);
		System.out.println(c1.hq);
		
		c1.setshareprice(1000);
		
		int p1 = c1.getSharePrice();  //so we are giving indirect access for share price
		System.out.println(p1);  //default value of share price is 0

	}

}
