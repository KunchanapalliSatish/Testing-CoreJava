package JavaBasics;

public class ExceptionHandling {

	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("Start programm");
				//uncaught exception
//				 int  n =2/0;
//				System.out.println(n); // this will give arthametic exception
				// so overcome this error and runs the further programm we use 
				// try catch block
				//An Exception is an event, which occurs during the execution of a program, 
				//that disrupts the normal flow of the program's instructions or in simple words, any issue which makes your test case stop 
				//in between the execution is an Exception.
				//An Error "indicates serious problems that a reasonable application should not try to catch."

				//An Exception "indicates conditions that a reasonable application might want to catch."
				//Exception handling refers to the anticipation, detection, and resolution of programming application,
				//and communications errors. It is the block of code that processes the exception object and helps us by giving us a chance to act on it.
				try {
				
				//int i= 2/0 ; // this block will throws exception
				int a []= new int [2];
				a[0]=1;
				a[1]=2;
				a[2]=3;
				System.out.println(a[3]); // it throws the index out of bound exception
				
				}
				catch (Throwable e) {
					//e.printStackTrace();
					System.out.println(e);
					
				}
//				catch (IndexOutOfBoundsException e) {
//					System.out.println(e);
//				}
//				catch (ArithmeticException e) {
//					System.out.println(e);
//				}
//				catch (Exception e) {
//					System.out.println(e);
//				}
				
				System.out.println("End Programm");
				

			}

		


	}


