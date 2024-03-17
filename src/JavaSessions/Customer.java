package JavaSessions;

import java.util.ArrayList;  //for importing statments press Cnrl + Shift+ O

public class Customer {
	
	public ArrayList<String> dosearch(String CategoryName) {
		System.out.println("searching the productname is :"+ CategoryName);
		ArrayList<String>prodlist=new ArrayList<String>();
		
		switch (CategoryName) {
		case "Apple":
			prodlist.add("iphone12");
			prodlist.add("Mackbook pro");
			prodlist.add("iphonemini");
			break;
 
       case "Samsung":
    	   prodlist.add("S8");
    	   prodlist.add("Samsung note");
			break;
			
       case "HP":
    	   prodlist.add("headphones");
    	   prodlist.add("laptops");
			break;
		default:
			System.out.println("product category not found....");
			break;
		}
		return prodlist;
	}
	
	//WAF(Write A Function) -- launch the browser  ,typical example for cross browser
	//input parameter --  browserName(String)
	//return: void
	
		public void launchbrowser(String browserName ) {  //limit we can pass 255  parameters 
		
		System.out.println("browser name is: "+browserName);
		
		if (browserName.equals("Chrome")) {
			System.out.println("Launch Chrome");
		}else if (browserName.equals("Firefox")) {
			System.out.println("Launch Firefox");
		}else if (browserName.equals("Safari")) {
			System.out.println("Launch Safari");
		}else {
			System.out.println("please pass the right browser:"+browserName);
		}
	}

		//WAF:--   register letter
		//parm like fn,ln,email,ph,password,age,dob,city,address,country
		//java says we should not pass  more than 5 parameters
		//we will pass class object
		
		public void register(String fn, String ln,String ph,String pwd,int age) {
			
		}
		
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.launchbrowser("Chrome");
	
		
		ArrayList<String> applelist = c1.dosearch("Apple");
       System.out.println(applelist.size());
        System.out.println(applelist);
        for(String e:applelist) {
        	System.out.println(e);
        }
        
      ArrayList<String> HPLIST = c1.dosearch("HP");
      System.out.println(HPLIST.size());
      System.out.println(HPLIST);
      for (String e : HPLIST) {
		System.out.println(e);
	}
      
     ArrayList<String> SamsungList = c1.dosearch("Samsung");
     System.out.println(SamsungList.size());
     System.out.println(SamsungList);
     for(String e:SamsungList) {
    	 System.out.println(e);
     }
     
    ArrayList<String> nokialist = c1.dosearch("Nokia");
    System.out.println(nokialist.size());
    System.out.println(nokialist);
     for (String e : nokialist) {
		System.out.println(e);
	}
		
	}

}
