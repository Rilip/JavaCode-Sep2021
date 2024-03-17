package JavaSessions;

public class Browser {
	
	String name;
	double version;
	String vendor;
	//can we pass class reference in method
	//ans :-Yes we can pass
	
	public void getInfo(Browser br) {
		System.out.println(br.name+" "+br.version+" "+br.vendor);
	}
	//call by value
	public void sum(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		Browser b=new Browser();
		b.getInfo(b);  //default values null 0.0 null
		
		b.name="chrome";
		b.version=91.1;
		b.vendor="Google";
		b.getInfo(b);  //chrome 91.1 Google  ..//Call by reference or pass by reference both are same
		
		b.sum(10, 20); //call by value 
		
		
	}

}
