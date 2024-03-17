package ExceptionHandling;

public class TryCatchBlock {
	//Errors are system problems ,means could be environment problem or system problem or configuration problem or memory problem stack over flow
	String name;
	//Throwable class is parent of Exception class
//Exception is super class of all exceptions like Arithmetic ,NPE etc
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj=new TryCatchBlock();
		obj.name="Tom";
		//obj=null;  //null reference
		//System.out.println(obj.name);  //Tom
		//System.out.println(obj.name);  //java.lang.NullPointerException:  npe
		
		//int i=9/3;
		//int i=9/0;  //" java.lang.ArithmeticException: / by zero  it will terminate the program it will not print "B" 
		
		try { //single try block have multiple catch block
			System.out.println(obj.name);  //after getting exception directly jumps to catch block,t will not print "Hi"
			int i=9/0; //it will not terminate the program,once exception is coming it will not check the arithmetic exception
			System.out.println("Hi");  //Hi it will not print once the exception is coming,immediately it will jump to catch block
			System.out.println("Hi");
			System.out.println("Hi");
		}//catch(Throwable e) {  //java.lang.Throwable,don not write exception and throwable class in catch block
		//object don't write in exception,it is paren class ,we can write Throwable  ,exception or any specific exception
//		catch (Error e) {
//		System.out.println("some exception os coming ...");
//		e.printStackTrace();
//		}
//		catch (Exception e) {  //dont prefer the Exception super class, because we don't have which exception is coming
//			//we can not handle multiple exception in catch block
//			System.out.println("Some Exception is coming...");
//			e.printStackTrace();
//		}
		catch (ArithmeticException  e) {
		//it is used to report the exception
			System.out.println("Aithematic Exception is coming..");
			e.printStackTrace();
    	}catch (NullPointerException e) {
			System.out.println("NullPointer Exception is coming..");
			e.printStackTrace();
		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
