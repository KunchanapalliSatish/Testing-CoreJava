package JavaBasics;

import java.util.Scanner;

public class LoopsReverseNumberTs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);     //
	      System.out.print("Input a number: ");
	     
	      int num = sc.nextInt();    //1234
	      // By using alogoritham
	      int rev=0;
	      
	      while (num!=0) {
	    	  rev= rev*10 + num%10 ; // 0+1234%10=> 4          40+ 123%10=>3 =43   430+12%10=>2= 432   4320+ 1%0=>1=4321
	    	  num=num/10;            // 1234/10=> 123            123/10=>12           12/10=>1        1/10=0
	    	   
	      }
	      
	    	  System.out.println("The reversed number is "+ rev);
	      }
	      }
	      
		
		



