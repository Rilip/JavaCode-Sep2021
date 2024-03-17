package JavaSessions;

//String is non primitive data type
//String is default class
//All the class name should start from capital letter "String"
// can i say String is combined of multiple character
public class StringConcatination {

	public static void main(String[] args) {
		String s="hello world";
		String s1="100"; //String treated has string 100 not numeric 100
		String ph="343434";
		String cc="1231 1231 1231";
	
		String x="Hello";
		String y="Testing";
		
		int a=100;
		int b=200;
		
		System.out.println(a+b);  //addition operator   //300
		System.out.println(x+y);  //Concatenation operator   //hellotesting
		
		System.out.println(x+a);  //hello100
		System.out.println(a+x);  //100Hello
        System.out.println(a+b+x+y);  //300HelloTesting  //Exceution will starts from Left to Right
        System.out.println(x+y+a+b);  //HelloTesting100200
        System.out.println(x+y+(a+b)); //HelloTesting300
        
        System.out.println(x+y+a+b+a+b);  //HelloTesting100200100200
        System.out.println("hi");  //hi
        System.out.println("the value of a :"+a); //the value of a :100
        System.out.println("the value of b :"+b); //the value of b :200
        System.out.println("the sum is :"+a +b);  //the sum is :100200
        System.out.println("the sum of:"+(a+b));  //the sum of:300

        System.out.println(x+y);  //HelloTesting
        System.out.println(x+" "+y);  //Hello Testing
        //string will be concatenate with any value
        
        double c=12.33;
        double d=23.44;
        System.out.println(x+y+c+d);  //HelloTesting12.3323.44
        
        char c1='a';  //97
        char c2='b';  //98
        System.out.println(c1+c2);  //195 -it will consider as numeric (Ascii values) 97+98=195 
        //97 to 122(a to z) 
        //65 to 90 (A to Z)
        //48 to 57 ( o to 9)
        
        System.out.println(c1+""+c2);  //ab
        
        byte b1=120;  
        byte b2=50; 
        //byte b3=b1+b2;
       // System.out.println(b3);//170
        System.out.println(b1+b2);
        
        byte b4=60;
        byte b5=50;
        int b6=b4+b5;// byte b6=b4+b5;  //byte--short--int--long
        System.out.println(b6);
        
        int g=10;
        int h=2;
        System.out.println(g/h);  //5
        System.out.println(10.0/2);  //5.0
        System.out.println(10.0/2.0); //5.0
        System.out.println(10/2.0);  //5.0
        System.out.println(10/3.0);  //3.3333333333333335
    //    System.out.println(9/0);  //Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(0/9);  //0
   //   System.out.println(0/0);  //Exception in thread "main" java.lang.ArithmeticException: / by zero
   //   System.out.println(0.0/0);  //NaN  -NOT A NUMBER
    //  System.out.println(0/0.0);  //NaN
   //   System.out.println(0.0/0.0);  //NaN
  //    System.out.println(5/0.0);  //Infinity
 //     System.out.println(5.0/0.0); //Infinity
   
        char t='a';
        System.out.println(t);
        int g1=10;
        int h1=3;
        System.out.println(g1/h1);  //3
         
        char z='a';
        System.out.println((int)z);  //97  //Asci value  //we are doing casting here ,we are converting into  numeric
        char y1='z';
        System.out.println((int)y1);  //122

        
        	
	}

}
