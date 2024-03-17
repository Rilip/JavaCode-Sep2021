package OOPS_INHERITANCE;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.start();  //BMW-------->start,you already overridden the start method ,preference always given for child class(overridden) child class exact same method which is defined parent class
        b.stop();  //Car--------------->Stops  (inherited)  the method which are take from parent class
        b.refuel();  //Car--------------->Refuel (inherited)
        b.autoParking(); //BMW--------------->(Individual)AutoParking  //individual method of child class
        b.engine();  //vehicle--------->engine  extends from grand parent
        BMW.drive();  //BMW----------->drive
     //   b.drive();  //The static method drive() from the type BMW should be accessed in a static way
        
        
        //create object of parent class
        CAR c=new CAR(); //create parent class  object
        c.start();  //Car--------------->Starts ,preference will be given for parent class
        c.stop();   //Car--------------->Stops
        c.refuel(); //Car--------------->Refuel
        //c1.autoParking // java is not allowing from child class property  to parent class
       c.engine(); //vehicle--------->engine
       CAR.drive();  //yes i can access static  drive individual method (Car----------->drive)
       
       Audi a=new Audi();
       a.start();
       a.stop();
       a.threadsafety();
       a.sportsMode();
       
        //child class object can be referred by parent class ref variable
        //top casting 
        new BMW(); //no reference object,it is eligible for garbage collector
        CAR c1=new BMW();  //parent class reference refereed by child class object  ,(top casting)
        c1.start();  //BMW--------------->Starts ,child class object will be called parent class
        c1.stop();  //Car--------------->Stops
        c1.refuel(); //Car--------------->Refuel
        
     //   c1.autoParking();  //i cat access autoParking method (individual method of the child class),here reference type checks will comes into this picture
        
        //child class  object  can be reffered by grand parent class variable
        Vehicle v1=new Vehicle();
        v1.engine(); //vehicle--------->engine only from grand parent
        //down casting  :-is not allowed in java at runtime
        //parent class object can be reffered by child class ref variable
    //   BMW b= new CAR();  
         BMW b1= (BMW) new CAR();  //compile time
     //  b1.start();// java.lang.ClassCastException  //runtime 
         
         //grand parent class object can be reffered by parent class ref variable
        BMW b2= (BMW) new Vehicle(); //
        
         
       
       
	}

}
