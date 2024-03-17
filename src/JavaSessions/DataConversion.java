package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {
	
		String x="100";
		System.out.println(x+20); //10020 --cocatination
		
		//Wraper classes -Integer ,double   --this is non primitive, class are always non primitive
		//the main purpose of wrapper class is for DataCoversion
		//string to int
		int i = Integer.parseInt(x);  //pure numeric value
        System.out.println(i+20);  //120
        
       // String y="100A";
      // int j = Integer.parseInt(y);
      // System.out.println(j);  //java.lang.NumberFormatException:
       //parseint obviously it is static  method
       
       //String to double
       String p="12.33";
       System.out.println(p+20);
       
       double d = Double.parseDouble(p);  //pure double value
       System.out.println(d+20);
       
       //whenever your using from external source we need to use toString()
       //int to String
       int total=100;
       String t = String.valueOf(total);
       System.out.println(t+20);  //10020
       
       //Data Conversion will happen using wrapper class
       
       String g="true";
       //conversion
       if (Boolean.parseBoolean(g)) {
		System.out.println("Pass");
	}
	}

}
