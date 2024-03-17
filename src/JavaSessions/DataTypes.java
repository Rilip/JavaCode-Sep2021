package JavaSessions;  //package is default keyword ,never write keyword with capital letter

public class DataTypes {

	public static void main(String[] args) {
		
		//Data Types:Type of data
		//strict type:- 
		//1.primitive data types:- no need any objects
		 //1.Boolean Types: boolean (true/false)
		 //2.Numeric data Types:
		    //1.character type :char
		    //2.Integral Type:
		       //1.Integer:byte, short, int ,long
		       //2.Floating-point:float , double
		
		//2.Non primitive data Types:where object oriented programming starts  , needs to create objects
		//String ,Array ,Interface , Classes
		//String x=10
		int x=10;  //yellow line indicates it is not used ,it taken some memory 
		//1.byte:it is coming from integer family
//		byte b=10;  //byte b=20; duplicates is not allowed
//		b=20; //java is allowed without data type
//		b=30; //them the value is 30
//		byte b1=40; //only two variables are created b ,b1
		//memory always divides into bytes and bits
		//size 1 byte =8 bits
		//range -128 to 127
		//byte d=128;showing error out of range
		//byte d=-129;
		byte b=10;
		b=20;
		b=30;
		byte b1=40;
		byte b2=0;
		byte b3=120;
		byte b4=-50;
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b+b1);
		
		//2.short(it is big brother of byte)
		//size:- 2 bytes=16 bits
		//range:- -32768 to 32767
		short s1=1234;
		//short s2=329999; out of range
		//short s3=-32769; out of range
		System.out.println(s1);
		
		//3.int:(it is big brother of short)
		//size:- 4 bytes =32bits
		//range:- -2147483648 to2147483647
		int i1=23450;
		int i2=-190;
		int k=1;//integer will take 4 bytes in your system
		//int b6=12.33; //Type mismatch: cannot convert from double to int
		
		//4.long:(big brother of integer)
		//size:-8 bytes =64 bits
		//range:--9223372036854775808 to 9223372036854775807
		long pop=1223334220;
		long g=23332222223322L;
		System.out.println(g);  //23332222223322

		//float:-
		//size:-4bytes=32 bits
		//range:-after . it will take upto 7digits
		//float f1=12.33; //Type mismatch: cannot convert from double to float
		float f1=12.33f;
		float f2=(float)34.55;  //castedintofloat
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1+f2);
		
		float f3=100;
		System.out.println(f3);
		
		//6.double :-big brother of float
		//size =8 byte =64 bits
		//range= after. (upto 16 decimal digits)
		double d=12.33;
		double d1=34.5555;
		
		double d3=1.1;//wastage of memory
		
		//7.char
		//size = 2 bytes=16 bits
		//range ;- single digit value
		char c1='e';  //i cannot write ee because it will take single digit e  (a -z) (A -Z)
		char c2='1'; //0 - 9
		char c3='$';
		System.out.println(c1);
		
		//8.boolean:- true and false
		//size= around ~1 bit
		boolean flag=true;
		boolean flag1=false;
		System.out.println(flag);
		System.out.println(flag1);
		
		
		
	}

}
