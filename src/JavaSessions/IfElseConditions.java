package JavaSessions;

public class IfElseConditions {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//a is greater than b
		if (a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		//all  primitive data types we need to do comparison  ,,== assignment operator
		if (a==b) {
			System.out.println("both are equal");
		}
		if (true) {
		System.out.println("hi");	
		}else {    //dead code  compiler :-java not able to reach else block
			System.out.println("bye");
		}
		boolean flag=true;  //Everything is depends in future flag becomes false
		if (flag) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
//		int number=90;
//		if (number<=100) {  //number is less than equal to 100
//			
//			if (number>=90) {
//				System.out.println("Grade A");
//			}
//			if (number>=75) {
//				System.out.println("Grade B"); //Grade A
//				                               //Grade B
//			}
			int number=101;
			if (number<=100) {  //number is less than equal to 100
				if (number>=90) {
					System.out.println("Grade A");
				}
				if (number>=75) {
					System.out.println("Grade B"); 
					                               
				}
			}
			else {
					System.out.println("Invalid number");
		}
//			String browser="firefox";  //in string comparison never use ==  ,it is always using the primitive comparison,String comparision we need to use ".equals"
//			//String browser="Opera";
//			if (browser.equals("chrome")) {
//				System.out.println("launch chrome");
//			}if (browser.equals("firefox")) {
//				System.out.println("launch firefox");
//			}if (browser.equals("safari")) {
//				System.out.println("launch safari");
//			}if (browser.equals("IE")) {
//				System.out.println("launch IE");
//			}
//			else {
//				System.out.println("pls pass the right browser...");
//			}
			
			String browser="firefox";
			if (browser.equals("chrome")) {
				System.out.println("launch chrome");
			}
			else if (browser.equals("firefox")) {
				System.out.println("launch firefox");
			//	break;   break cannot be used outside of a loop or a switch
			}
			else if (browser.equals("safari")) {
				System.out.println("launch safari");
			}
			else if (browser.equals("IE")) {
				System.out.println("launch IE");
			}
			else {
				System.out.println("please pass the right browser");
			}
				
	}

}

