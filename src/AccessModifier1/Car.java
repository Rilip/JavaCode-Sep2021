package AccessModifier1;

public class Car {

	String name;//if we not write anything  that will be default variable
	public String color;// public variable
	protected int price;
	private int licenseumber;
	
	public static void main(String[] args) {
		Car c=new Car();// within the same class i can access all properties ,there is no restrictions
		c.name="BMW";
		c.color="Black";
		c.price=50;
		c.licenseumber=123;
		
		//i can access default,public,protected,private variable----same class,same package
		//same package &Subclass-accept private variable we can access all variable
		//same package but different class non subclass all properties we can access except private 
		//different package but  subclass--default and private you can't access ,but public and protected u can access
		//Different package but non subclass  i can access only public 
		
		//local variable we can not assign the public ,private,protected,default layer is not allowed only for the class variables
		//in local variable i can access only final keyword
		//static property is not for local variable
	}

}
