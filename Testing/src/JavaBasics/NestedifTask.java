package JavaBasics;

import java.util.Scanner;

public class NestedifTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;  // holds a year
		// we crate scanner class for user input
	   Scanner scaner=new Scanner(System.in);
	   //Get the year
	   System.out.println("Enter a Year: ");
	   year = scaner.nextInt();
	   
	   // we find that the given year is leap or not 
	   if(year%4 == 0)
	   {
		   if (year % 100 == 0)
		   {
			   if (year%400==0)
			   {
				   System.out.println("It is Leap Year");
			   }
			   else
			   {
				   System.out.println("it is not a leap year");
			   }
		   }
		   else
		   {
			   System.out.println("it is a leap year");
		   }
		   
	   }
	   else {
		   System.out.println("it is not a leap year");
	   }

	}

}
