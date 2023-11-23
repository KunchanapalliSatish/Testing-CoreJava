package Task6CorejavaTask;

import java.util.Scanner;

public class ReverseTheOderOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String word = sc.nextLine();
		String str2="";
		String str3="";
		for ( int  i=0; i<word.length(); i++) 
		{ 
			str2= str2+word.charAt(i);
			if((word.charAt(i)==' ')||(i==word.length()-1))
    {
				str3= str2+" "+ str3;
				str2=" ";
	
    }
			
		}
		System.out.println(str3);
		     }
}

		

	    

	


