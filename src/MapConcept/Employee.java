package MapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		//Hash MAp is kind of data structure which will hold the values key & value pair format
		//list will maintaining order it will maintain the indexing
		//Map is the interface which is already their i Java ,
		//HashMap class
		//Map(I)<-----------HashMap(C)
		
		HashMap<String,String>empdata=new HashMap<String ,String>();  //hash map will ever maintain the order or idexing
		empdata.put("A", "Tom");
		//empdata.put(1, "Peter");  //list is the order base collection
		empdata.put("B", "Peter");
		empdata.put("C", "Robert");  //HashMap is order less collection
		System.out.println(empdata.get("A"));  //Tom  //threshold value=8  ,Ologin
		
		System.out.println("***************");
		
		empdata.forEach((k,v) -> System.out.println(k +":"+v));
		
		System.out.println("**************");
		
		HashMap<String,Integer>studentmap=new HashMap<String ,Integer>();
		studentmap.put("Tom", 100);
		studentmap.put("Peter", 200);
		studentmap.put("Peter", 300);
		studentmap.put("Naveen", 300);
		studentmap.put(null, 400);
		studentmap.put(null, 500);
		
		System.out.println("*************");
		
		studentmap.forEach((k,v) -> System.out.println(k+ ":" +v));
		
		System.out.println("*************");
		
		System.out.println(studentmap.get("Peter"));  //300 ,yes i can maintain the duplicate keys but always gives latest value
		System.out.println(studentmap.get(null));  //400  ,can i have multiple null keys--yes i can have duplicate keys but always give latest values
		
		HashMap<Integer,Integer>m1=new HashMap<Integer ,Integer>();
		m1.put(1, 100);
		m1.put(2, 200);
		m1.put(3, 300);
		
		HashMap<Integer,String>UserMap=new HashMap<Integer,String>();
		UserMap.put(101, "Tom");
		
		
	}

}
