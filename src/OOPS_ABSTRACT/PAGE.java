package OOPS_ABSTRACT;
//if i add abstract keyword then it will become abstract class
//Abstract:-just like interface ,if the class declared with abstract ,but we can't create object of abstract class
//abstract class  object can not be created
//abstract class constructor can be created
//it will be called when we create object of child class
//in abstract class you can have abstract methods and non abstract methods
//abstract method is the method which method body doesnot have
public abstract class PAGE {
	//constructor
	public PAGE() {
		System.out.println("PAGE-----default Constructor");
	}
	//can i overload the constructor---Yes
	public PAGE(int i) {
		System.out.println("PAGE--------->one ..parameter ..constructor");
	}
	//constructor will be called when the object has been created

	public abstract void title();  //can't have the method body,only method declaration
	public abstract void url();
	
	//non abstract methods(normal methods)
	public void header(){
		System.out.println("Page header");
	}
	//page logo os final of all pages so we need to make to final so we are not giving access to all pages
	public final void Logo() {
		System.out.println("Page------------>Logo");
	}
}
