package Task4Loops;

import java.util.Scanner;

public class SumOddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=805; 
//		int sum=0;


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		  int n= sc.nextInt();  
		int sum = 0;
		for (int i = 730; i <=n; i++) 
		{
			if (i % 2 != 0) 
			{
				sum = sum + i;
			}
		}
		System.out.println("The Sum Of  Odd Numbers from 730 to 805 are:" + sum);

}
}
