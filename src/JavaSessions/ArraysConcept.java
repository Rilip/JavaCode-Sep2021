package JavaSessions;

public class ArraysConcept {
	
	public static void main(String[] args) {
		
		//two major limitationd
		//1.array got fixed to overcome this problem we need to use Array list comes into this picture
		//2.similar type of data :to overcome this problem,use dynamic array --ArrayList/Static obj
		
		//use cases:
		//static data;
		//months 12/days 31
		
//		int i=10;
//		    i=20;
//		    i=30;
//		System.out.println(i);  
		//array is capability to store multiple values in single variable,which is non primitive type data
		//index will always starts from Zero--LI
		//hi--highest index=length-1
		//lowest index of any array =0;
		//Array size ,Array length both are same=i.length--->current size of the array
		
		/*****************************************************/
		//1.int array  ,new is a keyword which allocates memory
		int i[]=new int[4];  //in which 'i' will be divided into 4 sections  ,li=0 and hi=3  length=4
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;  //1 byte=4 ,4*4=16 bytes  it is always continuous memory allocation 
		System.out.println(i[0]);
		System.out.println(i[3]);
	//	System.out.println(i[4]);  // java.lang.ArrayIndexOutOfBoundsException:
   //	System.out.println(i[-1]); // java.lang.ArrayIndexOutOfBoundsException,,negative index is not allowed in java
//		System.out.println(i);  //[I@cac736f
		System.out.println(i[0]+i[2]);
		
		int len = i.length;
		System.out.println("length = "+len);  //4
		System.out.println("Hi = "+(len-1));
		System.out.println("Li = " + 0);
		
		//print all the values from array
		
		for(int k=0;k<=len-1;k++) {  //if " = " then we need to use length-1
			System.out.println(i[k]);  //10 20 30 40
		}
		for(int k=0;k<len;k++) {  
			System.out.println(i[k]);  //10 20 30 40
		}
		for(int k=0;k<i.length;k++) {  
			System.out.println(i[k]);  //10 20 30 40
		}
		System.out.println("**************");
		
		//for-each loop or enhanced loop
		for(int e:i) {
			System.out.println(e);  //10 20 30 40
		}
		System.out.println("*****************");
		//double array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=100;
		d[2]=34.44;
		//d[3]=20.33;
		//System.out.println(d[3]);   //java.lang.ArrayIndexOutOfBoundsException:
		for(double e:d) {
			System.out.println(e);
		}
		
		System.out.println("****************");
		//char array
		char c[]=new char[3];  //c is the variable name
		c[0]='a';
		c[1]='$';
		c[2]='1'; 
		
		for(char e:c) {
			System.out.println(e);
		}
		System.out.println("****************");
		//String array
		String lang[]=new String[4];
		lang[0]="Java";
		lang[1]="Phyton";
		lang[2]="JS";
		lang[3]="RUBY";
		
		System.out.println(lang[0] + lang[1]);
		
		for(int p=0;p<lang.length;p++) {
			System.out.println(p+":"+lang[p]);
		}
		System.out.println("****************");
		
		for(String e:lang) {
			System.out.println(e);  //1 :size of the array is fixed  --amazon:products are there 50 in sept month which to be listed,suddenly on November product got increased 100 products shutdown the application u need to update  first biggest problem  
	                               //to solve this problem we need to use dynamic array  EX:-ArrayList  
		
		}
		//Object Array:
		Object emp[]=new Object[4];
		emp[0]="Tom";
		emp[1]=25;
		emp[2]='M';
		emp[3]=23.44;
		
		for(Object e:emp) {
			System.out.println(e);
		}
		
		//
		String product[]=new String[100];
		product[0]="Mackbook Pro";
		product[1]="Macbook Air";
	}

}
