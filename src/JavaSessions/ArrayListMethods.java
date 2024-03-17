package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		int i[]= {10,20,30,40,50,60};  //array literals
		System.out.println(i);  //[I@156643d4 memory address garbage value
		System.out.println(Arrays.toString(i));  //[10, 20, 30, 40, 50, 60] to print all the values
		
		ArrayList<String>name=new ArrayList<String>(Arrays.asList("Java","Phyton","JS"));
		System.out.println(name);  //[Java, Phyton, JS]
		
		System.out.println("*****************");
		
		ArrayList<String>l1=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String>l2=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String>l3=new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		System.out.println(l1.equals(l3));
		
		System.out.println(l3);
		Collections.sort(l3);  //sorted
		System.out.println(l3);
		
		System.out.println("****************");
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		
		System.out.println("****************");
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println("****************");
		if (l1.equals(l3)) {
			System.out.println("Pass");
		}
		//web page-->drop down -----> 5 elements ------>act list
		//expect list----->5 elements
		
		
		ArrayList<String>l4=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String>l5=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		l4.removeAll(l5);
		System.out.println(l5);  //[A, B, C, D, E]
		System.out.println(l4);  //[F]
		System.out.println("*****************");
		
		//find out the Common element
		
		ArrayList<String>lang1=new ArrayList<String>(Arrays.asList("JAVA","PHYTON","JS","DS","ALGO"));
		ArrayList<String>lang2=new ArrayList<String>(Arrays.asList("JAVA","PHYTON","JS","DS","PHP"));
		
		lang1.retainAll(lang2);   //find out common elements two array list
		System.out.println(lang1);
		
		System.out.println("*****************");
		ArrayList<String>l6=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String>l7=new ArrayList<String>(Arrays.asList("p","q","r"));
		
		l6.addAll(l7);
		System.out.println(l6);//[A, B, C, D, F, p, q, r]
		System.out.println(l7);  //[p, q, r]
 
//		l7.clear();
//		System.out.println(l7);  //[] Everything will be cleared l7
		
		ArrayList<String> clonelist = (ArrayList<String>)l7.clone();  //type cast always write String ,we cannot use directly clone first we need to convert into arraylist
		//ArrayList<Object> clonelist = (ArrayList<Object>)l7.clone();
		System.out.println(clonelist);  //[p, q, r] it will create duplicates  
		System.out.println("***************");
		
		ArrayList<String> l8=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		l8.add(0, "T");
		System.out.println(l8);//[T, A, B, C, D, F] T will be add befor A
		//l8.add(7, "N");
		//System.out.println(l8);//java.lang.IndexOutOfBoundsException: Index: 7, Size: 6
	}

}
