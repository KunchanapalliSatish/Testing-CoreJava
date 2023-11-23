package JavaBasics;

import java.util.Scanner;

public class BasicIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=25;
		
	
		if (age>=25) {
			System.out.println("True");
		}
		{
			System.out.println("Not True");
		}
		
		//Inside the if we write a boolean condition means may be true or false
		int a=199;
		double b=199.000;
		if (b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		// for find greatest number of 3 numbers
		int a1=300;
		int b1=800;
		int c1=500;
		 // we need to use nested if else condition here
		if(a1>b1&&a1>c1) {
			System.out.println(" a1 is highest number");
		}
		else if (b1>a1&&b1>c1) {
			System.out.println("b1 is highest number");
		}
		else {
			System.out.println("c1 is highest number");
			System.out.println("---------------");
		}
		
		// EX3
		
		 Scanner in = new Scanner(System.in);
	        System.out.print("Input number: ");
	        int input = in.nextInt();

	        if (input > 0)
	        {
	            System.out.println("Number is positive");
	        }
	        else if (input <0)
	        {
	            System.out.println("Number is negative");
	        }
	       else 
	        {
	            System.out.println("Number is zero");
	        }
	        
	        
	        // Ex4
	       // The Scanner class is used to read input from the user, and the program prompts the user
	        //to enter the first number and stores it in the variable num1. It then prompts the user to enter
	        //the second number and stores it in the variable num2.
	        Scanner Input = new Scanner(System.in);
			System.out.print("Enter the Number1 : ");
			int num1 = Input.nextInt();
			System.out.print("Enter the Number2 : ");
			int num2 = Input.nextInt();
			if(num1>num2)
				System.out.println("Maximum Number is " +num1);
			else if(num1<num2)
				System.out.println("Maximum Number is " +num2);
			else
				System.out.println("Both are Equal " +num1);
		
		
		
		
	}

}
