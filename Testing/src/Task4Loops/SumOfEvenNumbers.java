package Task4Loops;

import java.util.Iterator;
import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum of even numbers from 1 to 20
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range");
		int n = sc.nextInt();
		
		int sum =0;
		for (int i=1; i<=n; i++) {
			if (i%2==0) {
				sum=sum+i ;
			}
		}
		System.out.println(sum);

	}

}
