package JavaSessions;

public class FunctionsInJava {

	//Cannot create Function inside the function ,Strictly not allowed  ,,functions are independent 
	//i can call the functions with other functions
	
	//1.no input and no return;
	//void --no return 
	public void test() {
		System.out.println("Test Method");
		int i=10;  //local variable  ,it is not defined after class,  as i told you JVM first goes to main function  ,,jvm always checking that do you have main method 
		System.out.println(i);//to access this variable we need to create object
	}
	
	public void getPrint() {
		System.out.println("Print my paper");
	}
	
	//2.no input but some return
	public int getbalance() {
		System.out.println("get balance");
		int fee=10;
		int tax=5;
		int total=fee+tax;
		return total;
	}
	public String getTrainerName() {
		System.out.println("get traier name");
		String name = "Naveen";
		return name;
	}
	
	public boolean isEmpActive() {
		System.out.println("is emp active");
//		boolean flag=true;
//		return flag;
		return true;
	}
	//3.some input and some return:
	//input paramenters a and b  a and b local variable and method parameters
	public int add(int a ,int b) {
		System.out.println("add method");
		int z=a+b;
		return z;
	}
	public int getCourseFee(String CourseName) {
		System.out.println("get Course Fee for :"+CourseName);
		
		if (CourseName.equals("Selenium")) {
			return 100;
		}else if (CourseName.equals("API")) {
			return 50;
		}else if (CourseName.equals("Mobile")) {
			return 70;
		}else {
			System.out.println("Course not found...");
			return -1;
		}
	}
	
	
	//inside the main method never write return statment
	public static void main(String[] args) {  //main method is also a function,so i cannot create function  in main method
		
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		obj.getPrint();
		int p = obj.getbalance();  //always use 1 st approach
		System.out.println(p);
		
		System.out.println(obj.getbalance());  //2 nd approach
		
		String n1 = obj.getTrainerName();
		System.out.println("Trainer name is:"+n1);  //8-22
		
		obj.getTrainerName();//this functioning returning something you don't have holding parameter,because we need to use gettrainer() so we need to use
		if (obj.isEmpActive()) {
			System.out.println("Pass");
		}
		boolean b = obj.isEmpActive();
		System.out.println(b);
		
		int s1 = obj.add(10, 20);  //10 and 20 are called method arguments,when we pass the values are called method arguments
		System.out.println(s1);
		
		int s2 = obj.add(30, 40);
		System.out.println(s2-10);
		
	    int f1 = obj.getCourseFee("Selenium");
	    System.out.println(f1);
	    
	    int f2 = obj.getCourseFee("C#");
	    System.out.println(f2);
	    
	    if (f2==-1) {
			System.out.println("this is not part of the training");
		}
	}

}
