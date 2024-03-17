package AccessModifier1;

public class BMW extends Car {

	public static void main(String[] args) {
		Car c=new Car(); //accept private variable we can access all variable in the child class with in same package
		c.name="BMWS520";
		c.color="Black";
		c.price=1234;
		//c.licenseumber  // Car.licenseumber is not visible because it is private variable
		BMW b=new BMW();
		b.color="Black";
		b.name="Hundai";
		b.price=29;
		
		

	}

}
