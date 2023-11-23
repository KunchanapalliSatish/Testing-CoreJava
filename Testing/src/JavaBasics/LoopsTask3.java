package JavaBasics;

import java.util.Scanner;

public class LoopsTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  int n = 4526;
//		  int rev = 0; // reversed number
//	      int rem;   // remainder
//	       
//	      while(n>0){
//	          
//	        rem = n%10;
//	        rev = (rev*10) + rem;
//	        n = n/10;
//	        System.out.println(rev);
	      
	       
//	      
//	      Scanner sc = new Scanner(System.in);     //
//	      System.out.print("Input a number: ");
//	      int num = sc.nextInt();
		 int num=121;
	      
	      int org_num=num; 
	 	 int rev = 0;    
	      while(num!=0)
	 	   {    
	          
	         rev = (rev*10)+num%10;   // 0*10+ 121%10 =>  0+1=1
	         num = num/10;            // 121/10 = 12.1
	        }    
	      System.out.println(rev);
	       if(org_num==rev)            // 121==1 
	    	   
	         System.out.println("It is a Palindrome number.");    
	       else    {
	         System.out.println("Not a palindrome");  
	       }
	}

}
