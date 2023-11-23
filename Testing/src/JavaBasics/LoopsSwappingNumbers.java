package JavaBasics;

import java.util.Scanner;

public class LoopsSwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Take input from the user
        //Create an instance of the Scanner Class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a ");
        int num1=sc.nextInt();
        System.out.println("Enter b ");
        int num2=sc.nextInt();
        System.out.println("Before Swapping numbers are: ");
        System.out.println("a is "+num1);
        System.out.println("b  is "+num2);
        //Use a temporary variable to swap the numbers
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping numbers are: ");
        System.out.println("a is "+num1);
        System.out.println("b is "+num2);

	}

}
