package StringConcepts;

public class StringManipulation {

	//String constant pool (SCP)all string stores
	//scp it is separate memory after jdk 1.7 it is part of heap memory
	public static void main(String[] args) {
		//String is a class and non primitive type
		String s="This is my java code and I am so happy";
	//	String is collection of characters and it is noted in double codes
		
		System.out.println(s.length());  //38
		System.out.println(s.charAt(0));  //T
		System.out.println(s.charAt(37)); //y
		//System.out.println(s.charAt(38));  //java.lang.StringIndexOutOfBoundsException
	//	System.out.println(s.charAt(-1));  // java.lang.StringIndexOutOfBoundsException:
		
		System.out.println(s.indexOf('j'));  //11
		System.out.println(s.indexOf('i'));  //2  //first occurrence of 'i'
		System.out.println(s.indexOf('i', 3));  //5
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		System.out.println(s.indexOf("code"));
		//System.out.println(s.indexOf("phyton"));  //-1
		
		String msg="Welcome Admin";
		if (msg.indexOf("Admin")>0) {
			System.out.println("Pass");
		}
		System.out.println(s.toLowerCase()); //this is my java code and i am so happy
		System.out.println(s.toUpperCase());  //THIS IS MY JAVA CODE AND I AM SO HAPPY
		
		String str= "   hello world    ";
		System.out.println(str.trim()); //hello world
		System.out.println(str.replaceAll(" ", ""));  //helloworld
		
		String dob="01-01-1990";  //01/01/1990
		System.out.println(dob.replace('-', '/'));  //01/01/1990
		System.out.println(dob.replace("/", "-"));  //01-01-1990

		//String is a class
		//contains function
		String s1="your user id is NaveeAutomation";
		System.out.println(s1.contains("NaveeAutomation"));  //contains function will return boolean
		if (s1.contains("NaveeAutomation")) {  //contains function is used to check a specific value
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		//Comparisons
		String t1="Hello java";  //this are Sting literals, whenever literal comparison happens always checks the values
		String t2="Hello java";  //if i wrote "J" it will give false (Java is case Sensitive language) space added so it will give false
		//t2="Hello Phyton";
		System.out.println(t1.equals(t2));  //soft comparison  ,String  will store in SCP (Heap memory) after JDK1.8
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2);
		
		String t5=new String("Hello ruby");  //String Object , we can't have duplicate values in String Constant Pool
		String t6="Hello ruby";
		String t7=new String("Hello ruby");   
		
		System.out.println(t5==t7);//false  (reference comparison (reference address)so it is giving false)
		System.out.println(t5==t6);
		
		//split
		String lang="JAVA_PHYTON_RUBY_PHP";
		String langArr[]=lang.split("_");
		System.out.println(langArr[0]);  //JAVA
	//	System.out.println(langArr[4]);  //java.lang.ArrayIndexOutOfBoundsException:
		
		for (String e : langArr) {
			System.out.println(e);
		}
		
		String name="xXtestingxXjavaxXXSeleniumXxXPython";
		String nameArr[]=name.split("xX");
		System.out.println(nameArr.length);
		System.out.println(nameArr[0]);
		System.out.println(nameArr[0].length());
		System.out.println(nameArr[0]);
		System.out.println(nameArr[1]);
		System.out.println(nameArr[2]);
		System.out.println(nameArr[3]);
		System.out.println(nameArr[4]);
		
		String empdata="Hiren:Patel:40:NY:USA:01-01-1970:selenium:QA";
		String emp[]=empdata.split(":");  //split gives array so u need to store in Array
		for (String e : emp) {
			System.out.println(e);
		}
		
		String credinetials="admi:admin";
		System.out.println(credinetials.split(":")[0]);
		System.out.println(credinetials.split(":")[1]);
		
		//substring
		//String message="Your Order id is 12345";
		String message="testing Your Order id is 12345";
		message.substring(8);
		System.out.println(message.substring(8));  //er id is 12345
        System.out.println(message.substring(17));  //12345
        System.out.println(message.substring(0, 9));  //Your Orde
        System.out.println(message.substring(0, 10));  //Your Order
        System.out.println(message.substring(message.indexOf("is"), message.length())); //is 12345
        System.out.println(message.substring(message.indexOf("is")+3, message.length())); //12345
        String OrderId=message.substring(message.indexOf("is")+3, message.length());
        System.out.println(OrderId);//12345
        
        
	}

}
