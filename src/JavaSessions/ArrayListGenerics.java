package JavaSessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
	//	ArrayList ar=new ArrayList();  //ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		//int AL
		ArrayList<Integer>ar=new ArrayList<Integer>();		//class is always primitive type,<int>it is not allowed
		ar.add(100);
		//ar.add(12.33);  //now i can store only integer type
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		//for each
		for(Integer e:ar) {
			System.out.println(e);
		}
		System.out.println("*******************");
		for(int e:ar) {
			System.out.println(e);
		}
		System.out.println("***************");
		
		//double AL
		ArrayList<Double>ar1=new ArrayList<Double>();
		ar1.add(12.33);
//		ar1.add(100); //The method add(int, Double) in the type ArrayList<Double> is not applicable for the arguments (int)

		ar1.add(100.00);
		for(Double e:ar1) {
			System.out.println(e);
		}
		System.out.println("*****************");
		//String AL
		ArrayList<String>productlist=new ArrayList<String>();
		productlist.add("Apple");
		productlist.add("Samung");
		productlist.add("Nokia");
		//priductlist.add(100);  //The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		
		for(String e:productlist) {
			System.out.println(e);
		}
		System.out.println("************");
		//Object AL
		ArrayList<Object> empdata=new ArrayList<Object>();
		empdata.add("Dhara");
		empdata.add(25);
		empdata.add("F");
		empdata.add(12.33);
		empdata.add(true);
		
		System.out.println(empdata.size());
		System.out.println("****************");
		
		for(Object e:empdata) {
			System.out.println(e);
		}
	}

}
