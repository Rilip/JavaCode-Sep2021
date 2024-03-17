package ExceptionHandling;

public class ThrowsKeyword {
 
	//ThrowsKeyword is using after main method
	public void m1() {// throws ArithmeticException {
		System.out.println("m1");
		m2();
	}
	public void m2()  {//throws ArithmeticException{
		System.out.println("m2");
		try {
			m3();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	public void m3() {// throws ArithmeticException {
		System.out.println("m3");
		int i=9/0;
//		try {
//			int i=9/0;
//		} catch (ArithmeticException e) {
//			System.out.println("AE is coming..");
//			e.printStackTrace();
//		}
	}
	//i can't handle the exception by using ThrowsKeyword
	public static void main(String[] args) {  //jvm called main method, how can jvm decide the exception  ,throws ArithmeticException
		
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.m1();
		System.out.println("Bye..");  //hence proved  "Bye " Is not printing

	}

}
