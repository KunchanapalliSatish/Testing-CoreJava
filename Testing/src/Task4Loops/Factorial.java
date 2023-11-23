package Task4Loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6! = 1*2*3*4*5*6 // your number is multiples with next number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		  int n= sc.nextInt();  
				int temp =1;
				
				for(int i =1; i<=n ; i++) {
					temp = temp*i;
					
					
				}
					System.out.println("factorial of " +n + "is:"+temp);

	}

}
