package JavaSessions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//ArrayList--is default class  
		//needs to create object of AL  new keyword
		//AL--it maintains the order/index
		
		ArrayList ar=new ArrayList();  //donot write same class name which is already available in java,,warnings are called generics
		//Default virtual capacity=10  segments/index
		//physical capacity initially is 0 and we are adding the 2 values Pc=2(10-2=8)
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		//in AL we use to get length  (.size)
		
		System.out.println(ar.size()); //2
		
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());
		
		ar.add(500);
		ar.add(600);
		ar.add(700);
		System.out.println(ar.size());
		
		ar.add(12.33);
		ar.add("testing");
		ar.add('n');
		ar.add(true);
		ar.add(500);  //yes we can add duplicate values ,but it is not good ay to write the program,yeah it is ugly program  

		System.out.println(ar.get(0));
		System.out.println(ar.get(6));
		//System.out.println(ar.get(7));  // java.lang.IndexOutOfBoundsException: 
		//System.out.println(ar.get(-1)); // java.lang.IndexOutOfBoundsException
		
//		ar.remove(5);
//		System.out.println(ar.get(5));
//		System.out.println(ar.size());
		
		//to print all the values from AL use loops
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}
