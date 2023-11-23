package Task4Loops;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prime number is a number that is divisible by only two numbers : 1 and itself. (divisors)
		//A prime number is a whole number greater than 1 whose only factors are 1 and itself
		 //  Conditions 1. Number>1    2.number has  only 2 factors , 1 & itself
		//Ex: 5-> 1, 5 ,7,11    prime
		//Ex:6 -> 1,2,3,6  not prime

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number ");
//		  int n= sc.nextInt();  
		int n=25;
				int count = 0;
				
				for (int i =1; i<=n; i++ ) {  // here for loop is used for to check the how many factors are have for that number
					if (n % i == 0) {
						count ++ ;   // when n is divisible and remainder is 0 change then the count value will increse
					}
				} 
				if (count==2) {     // if count = then  it is prime number
					System.out.println(n +" is Prime Number");
				}
				else {
					System.out.println( n + " Not a Prime Number");
				}
			}

		}


	


