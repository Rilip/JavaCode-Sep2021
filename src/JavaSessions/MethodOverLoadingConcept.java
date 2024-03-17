package JavaSessions;

public class MethodOverLoadingConcept {
	//method overloading :-only within the same class,there is no concept of parent and child
	//Method Overloading :-this is called (Static)Compile time polymorphism
	//method overloading
	public void start() {
		
	}
	public void start(int a) {
		System.out.println(a);
	}
	public void start(String a,int b) {
		System.out.println("the below values : "+a+" "+b);
	}

	public static void main(String[] args) {
		
		MethodOverLoadingConcept obj=new MethodOverLoadingConcept();
		obj.start(10);  //10
        obj.start("Comile", 10);
	}

}
