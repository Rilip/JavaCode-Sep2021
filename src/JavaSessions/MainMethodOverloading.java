package JavaSessions;

public class MainMethodOverloading {
	
	//ans :-Yes
  //JVM always looking for the main method
	public static void main(String a[]) {  //String ,array type
		
	System.out.println("Main 1");	  //always prints Main 1,,always check where is the main method
	System.out.println("Main1"+a);    //Main1[Ljava.lang.String;@cac736f
	}
    public static void main(int a) {  //same method but different parameters
    	
		System.out.println("Main 2 "+a);
	}
    public static void main(String a) {  //String normal a parameter
		
    	System.out.println("Main 1");	  
    	}
    public static void main(int a,int b) {  //same method but different parameters
    	
		System.out.println("Main 3 "+a+b);
	}

}
