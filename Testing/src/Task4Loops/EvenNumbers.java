package Task4Loops;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // >Start
		  //>Start a loop for i = 1 to 100
		 //>Check if i is divisible by 2
		 //If true, print the number
		//If false, increment the number
		//End 
//		 int n1=100;  
//	        System.out.print("List of even numbers from 1 to 100: \n");  
//	        for (int i=2; i<=n1; i= i+2)   
//	        {
//	            System.out.print(i + " ");
//	        }
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		  int n= sc.nextInt();  
	        System.out.print("List of even numbers from 637 to 840: \n");  
	        for (int i=637; i<=n; i++)   
	        { 
	            if ( i%2 == 0 )
	            {
	                System.out.print(i + " ");
	            }
	        }

	}

}
