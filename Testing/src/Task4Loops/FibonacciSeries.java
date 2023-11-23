package Task4Loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,1,1,2,3,5,8.
				// adding the previous two numbers in series

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		  int n= sc.nextInt();  
				int a= 0;
				int b=1;
				int c;
				
				for ( int i=0; i<n; i++) {
					System.out.println(a+ " ");
					c=a+b;
					a=b;
					b=c;
				}
				//System.out.println(a+ " ");

	}

}
