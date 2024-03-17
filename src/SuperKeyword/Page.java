package SuperKeyword;

public class Page {

	//super ()---uses of super keyword1)you can access parent class variable 2)parent class method 3) u can call the parent class constructor but it should be first ststment always
	//super keyword is representing parent class object
	int timeout=100;
	//constructor
	public Page() {
		System.out.println("Page default...constructor");
	}
	//override the page constructor
	public Page(int a) {
		System.out.println("Page default...constructor: "+a);
	}
	public Page(int a,int b) {
		System.out.println("Page default...constructor: "+(a+b));
	}
	
	public void display() {
		System.out.println("Page Display");
	}
}
