package JavaBasics;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount =20000;
		if (amount<=10000) {
			System.out.println("withdrawl successful");
		}
		if (amount>10000) {
			System.out.println("withdrawal procces failed ");
		}
		
		//Ex2
		
		//First we create scanner object
		Scanner sc= new Scanner(System.in);
		String status = "",Class="";
		int marks=50;
   
          // Taking an integer input from the user for the marks obtained
        // Check if marks>45
        if (marks > 45) {
        	System.out.println("passed");
        }
            
            // marks=<100 and marks >85
            if (marks <= 100&&marks>85) {
            System.out.println(" with 1st class");
            }
            
            // Check if marks <85 and marks >65
            if (marks < 85&& marks>65) {
               System.out.println("with 2nd Class");
            }
            
            // Check if marks <65 and marks >45
            if (marks < 65 && marks>45) {
                System.out.println("with 3rd Class");    
                }
          else {
        	System.out.println("failed");
            
	   }
            // for find rectangle or square
            Scanner s = new Scanner(System.in);
            System.out.println("Enter length:");
            int x = s.nextInt();
            System.out.println("Enter breadth:");
            int y = s.nextInt();
            if(x==y){
              System.out.println("Square");
            }
            else{
              System.out.println("Rectangle");
            }
            

	}

}
