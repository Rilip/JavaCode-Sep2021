package JavaSessions;

public class TestBlock {
	
	//statoc block
	//currently static is keyword
	/*
	 * static block  --1 st executing static block before the main method
       this is the main
       this is the test method
	 */
	static{
		System.out.println("static block");
	}
	
	public static void test() {
		System.out.println("this is the test method");
	}

	public static void main(String[] args) {
	//jvm always looking for main method
		System.out.println("this is the main");
        test();  //this is the test method,static method called directly or by class name we can call
	}

}
