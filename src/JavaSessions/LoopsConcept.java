package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
	//1.while loop  while is a keyword
	//1 to 10
		int i=1;  //start point is never part of the loop
        while(i<=10) {  //conditional statement
        	System.out.println(i);  //12345678910   //statment
        //	i++; //12345678910
        //	++i;  //12345678910
        	i=i+1; //12345678910  //increment or decrement loop
        }
        int k=1;
        while(true) {
        	System.out.println(k);   //111
        	k++;
        	if(k==20) {  // == is used for primitive data types
        		break;
        	}
        }
        //infinite loop
//        while(true) {
//        	System.out.println("welcome to hotel Taj");
//        }
        //facebook,linkedin app--scroling---lazy page loading
        
       //use cases: we have to use while loop when we are not sure about number of iterations
        //pagination
        //carousel 
        //Calendar date handling
        
        System.out.println("*****************");
        //for loop
        //we have too use for loop when we are sure number of cycles/ iterations
        //menu items fixed
        //total no of links and total no of images
        //dopdown values
        //webtable
        //typical for loop or index based for loop
        //1 to 10
//        for(int p=1; p<=10; p++) {
//        	System.out.println(p);
//        }
//        System.out.println("****************");
//        int q=1;
//        for(;q<=10;q++) {
//        	System.out.println(q);
//        }
//        	
        int q=1;   //in java every statement ended with ";"
        for(;q<=10;) {
        	System.out.println(q);
        //	q++;   //exactly same statement 
        //	++q;  //exactly same statement 
        	q=q+1;  //exactly same statement 
        	
        }
        //infinite for loop
//        for(int g=1;g<=10;) {
//        	System.out.println(g);
//        }
        //infinite loop
//        for(;;) {
//        	System.out.println("welcome to hotel taj");
//        }
        System.out.println("****************");
        //even numbers upto 10
        //2 4 6 8 10
        for(int even=2;even<=10;even=even+2) {
        	System.out.println(even);
        }
        System.out.println("******************");
        //odd numbers upto 10
        //1 3 5 7 9
        for(int odd=1;odd<=10;odd=odd+2) {
        	System.out.println(odd);
        }
        System.out.println("*******************");
        for(double d=1.0;d<=10.0;d++) {
        	System.out.println(d);
        }
        System.out.println("*****************");
        //A--Z
        for(char c='A';c<='Z';c++) {
        	System.out.println(c);
        }
        System.out.println("*************");
        for(char h='a'; h<='z';h++) {
        	System.out.println(h);
        }
        System.out.println("*************");
      for(int as=97;as<=122;as++) {
    	  System.out.println(as);
      }
      System.out.println("*************");  //converting assci number to char (type Casting)
      for(int as1=97;as1<=122;as1++) {
    	  System.out.println((char)as1);
      }
      System.out.println("***************");
      for(int as2=65;as2<=90;as2++) {
    	  System.out.println(as2);
      }
      System.out.println("****************************");
      for(int as3=65;as3<=90;as3++) {
    	  System.out.println((char)as3);
      }
      System.out.println("****************************");
      System.out.println(10%2);
      System.out.println(10%3);
      
      System.out.println("********************");
      for(int t=1;t<=100;t++) {
    	  System.out.println(t);
    	  if (t%5==0) {
			System.out.println("hi");
		}
    	  System.out.println("****************");
    	  for(int u=2;u<=100;u=u+2) {
    		  System.out.println(u);
    		  if(t%2==0) {
    			  System.out.println("even");
    		  }
    	  }
    	  
    	  System.out.println("*******************");
    	  //Do While loop
    	  int r=1;
    	  do {
    		  r++;
    		  System.out.println(r);
			//r++;
			//System.out.println(r);  //234567891011
		} while (r<=10);  //Infinite loop
      }
      
	}

}
