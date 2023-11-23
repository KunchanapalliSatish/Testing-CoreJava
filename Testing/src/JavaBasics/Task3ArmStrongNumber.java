package JavaBasics;

import java.util.Scanner;

public class Task3ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();   //371
		
		int temp=num;
		int rem;
		int arm=0;
		
		while(num>0) {
			rem=num%10;    // 1    7    3
			num=num/10;    // 37   3    0
			arm=(rem*rem*rem)+arm;      //  1*1*1 +0=1 1st iteration
			         // 343+1= 344 2nd iteration 
			        //  27+344=  371
		}
		if (arm==temp) {
			System.out.println("The given number is Arm strong number"); 
		}
			else {
				System.out.println("Given number is not a arm strong number");
			}
			
		}
		

	}


