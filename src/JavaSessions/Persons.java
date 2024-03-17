package JavaSessions;

public class Persons {
	
	public void m1() {
		System.out.println("m1");
		m2();
	}
    public void m2() {
    	System.out.println("m2");
		m3();
	}
    public void m3() {
	System.out.println("m3");
	p2(); //i can access cma 
    }
   /*
    * method chaining concept
    m1
    m2
    m3*/
    public static void p1() {   //for static objects is not applicable
    	System.out.println("p1");
    	p2();
    	Persons pp=new Persons();
    	pp.m1();
    }
    public static void p2() {
    	System.out.println("p2");
    	p3();
    	Persons ppp=new Persons();
    	ppp.m3();
    }
    public static void p3() {
    	System.out.println("p3");
    }

	public static void main(String[] args) {
		
		Persons p1=new Persons();
        p1.m1();
        p1.m2();
        p1.m3();
        
        
        p1();
        Persons.p1();
        
	}

}
