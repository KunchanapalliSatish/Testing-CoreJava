package JavaBasics;

import java.util.Scanner;

public class Scannerclassex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // for find rectangle or square
		
		//Scanner s= new Scanner(System.in);
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter length:");
//        int x = s.nextInt();
//        System.out.println("Enter breadth:");
//        int y = s.nextInt();
//        if(x==y){
//          System.out.println("Square");
//        }
//        else{
//          System.out.println("Rectangle");
//          System.out.println("--------");
//        }
        
        
        Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("Hello "+name);
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("Your age is "+age);
		System.out.println("what is your state?");
		String state = sc.nextLine();
	//	System.out.println("Your from" + state);
		String state1 = sc.nextLine();
		System.out.println("Your from "+ state1);
		sc.close();

	}

}
