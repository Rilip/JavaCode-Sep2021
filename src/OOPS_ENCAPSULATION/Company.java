package OOPS_ENCAPSULATION;

public class Company {

	public String  name;
	private int shareprice;  //class variable
	public String hq;
	
	//setter:
	//sharePrice--local variable  ,to access the local variable we need to use this keyword is pointing current class object
	public void setshareprice(int shareprice) {
	//	shareprice=shareprice;  //The assignment to variable shareprice has no effect
		this.shareprice=shareprice;  //setter will be void in nature
	}
	
	//getter: create public method
	public int getSharePrice() {
		return shareprice;
	}
	
	//when you have class i have to declare some private variables ,and also same class we have some public methods having its own body will be using
	//private variable will be using
	public static void main(String[] args) {
	
		Company obj=new Company();
		obj.name="IBM";
		obj.shareprice=100;  //Without any problem we can access private variable

	}

}
