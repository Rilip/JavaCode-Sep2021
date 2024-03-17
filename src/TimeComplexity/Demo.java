package TimeComplexity;

public class Demo {

	public static void main(String[] args) {
		int i=10;
		System.out.println(i);  //10
		//time complexity denoted by Big O
		//O(1) O of 1  constant time
		
		int j=15;
		int sum=i+j;
		System.out.println(sum);  //25
		
		//1 to 10
		for(int k=1;k<=10;k++) {
			System.out.println(k);
		}
		//1+n+n+n =>(1+3n)=>3n`O(3)-O(n)
		//3n+1-->linear equation
		
		for(int p=1;p<=10;p++) {
			for(int q=1;q<=10;q++) {
				
				for(int r=1;r<=10;r++) {
					System.out.print(p+" "+q+ ""+r+" ");
				}
				//(1+n+n+n)(1+n+n+n)
			}
			System.out.println();
			//(1+n+n+n)(1+n+n+n)===(1+3n)(1+3n)==>1+3n+3n+9n^2===>9n^2+6n+1(quadratic eq)
			//9n^2 +6n==>3(3n+2n)==>3n(3n) 9^2 ==>n^2===>O(n^2)
		}
	}

}
