package Task6CorejavaTask;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Charcter ");
	   char ch = sc.nextLine().charAt(0);
	
	   char lowercase=Character.toLowerCase(ch);
		
		System.out.println("the entered charater after converting "+lowercase);
	   switch(lowercase)
	   {
	   case 'a':
	   case 'e':
	   case 'i':
	   case 'o':
	   case 'u':
		   System.out.println("Given character is an vowel");
	   
	   break;
	   default:
		   System.out.println("Given character is consonant");
	   }

	}

}
