package ExceptionHandling;

public class ThrowKeyword {
//throw  keyword  is used for customized exception
	public static void main(String[] args) {
		//delebrate we can throw the exception by using throws keyword
		try {  //java.lang.Exception: NAVEEN EXCEPTION
			throw new Exception("NAVEEN EXCEPTION");
		} catch (Exception e) {
			System.out.println("some exception is coming...");
			e.printStackTrace();
			
		}
		
		String data=null;
		if (data==null) {
			try {  //java.lang.Exception: NAVEEN EXCEPTION
				throw new Exception("DATA NOT FOUND EXCEPTION");
			} catch (Exception e) {
				System.out.println("DATA NOT FOUND EXCEPTION\"...");
				e.printStackTrace();
				
			}
		}
		
		//webpage--->element e1
		//e1 is not present
		//e1 prop is missing---->throw new Exception(ELEMENTPROPNOTFOUNDEXCEPTION)
		
		

		
	}

}
