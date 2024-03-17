package JavaSessions;

public class SwitichCaseStatement {

	public static void main(String[] args) {
		
		String browser="CHROME ";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch IE");
			break;

		default:
			System.out.println("please pass the right browser name");
			break;
		}
		//
		int marks=90;
		switch (marks) {
		case 100:
			System.out.println("A");
			break;
		case 90:
			System.out.println("B");
			break;
		default:
			System.out.println("Fail");
			break;
		}
		
		//can
		//int num=10;
		//switch (num<=10) {  // boolean expression not been used in key,can't handle boolean in switch expression
		//case value:
			
		//	break;

//		default:
//			break;
//		}
		
		//== will be used for primitive comparison
		
		double d1=12.33;
		double d2=12.34;
		if (d1==d2) {
			
		}
		//< <= >= > == !=
		boolean flag=true;
		
		if (!flag) {
			System.out.println("BYE");
		}
		else {
			System.out.println("PASS");
		}
		
	}

}
