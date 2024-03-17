package ConstructorConcept;

public class TestCustomer {

	public static void main(String[] args) {
	//	Customer c1=new Customer(); we cant create default constructor we redtricted
		Customer c1=new Customer("Tom", 30, "IBM");  //setters work can be done by constructor,Constructor is helping me to assign the values same work is doing by seetter
		//c1.Customer(String name, int age, String comp) {  we can't access because it is in private in nature
		
		// main purpose of setter is  to update the values
		System.out.println(c1.getName());  //Tom
		System.out.println(c1.getAge());   //30
		System.out.println(c1.getComp());  //IBM
		
		c1.setComp("MS");
		c1.setAge(33);
		
		System.out.println(c1.getName());  //Tom
		System.out.println(c1.getAge());   //33
		System.out.println(c1.getComp());  //MS
		
		Customer c2=new Customer();
		c2.setName("Poornima");
		c2.setAge(35);
		c2.setComp("Google");
		
		System.out.println(c2.getComp());  //Google

	}

}
