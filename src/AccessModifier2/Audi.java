package AccessModifier2;

import AccessModifier1.Car;

public class Audi extends Car {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.color="Honda";  //public
		a.price=40;  //protected
		//Car c=new Car();
		

	}

}
