package JavaBasics;

import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int my_input;
	      System.out.println("Required packages have been imported");
	      Scanner my_scanner = new Scanner(System.in);
	      System.out.println("A reader object has been defined ");
	      System.out.print("Enter the number : ");
	      my_input = my_scanner.nextInt();
	      if(my_input % 2 == 0)
	         System.out.println("The number " +my_input + " is an even number");
	      else
	         System.out.println("The number " +my_input + " is an odd number");

	}

}
