package JavaBasics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //Arthametic operators
		// They are +, -, %, *, / 
		int a=30, b=20;
		int c=a+b;
		System.out.println("addition "+c);
		
		
		int d=a-b;
		System.out.println("substarction "+d);
		
		int e=a%b;
		System.out.println("divide "+e);
		
		int f=a*b;
		System.out.println("multiplication "+f);
		
		System.out.println("-----------------");
		
		// Comparision operators also calles Reletional operators
		int i=150, j=200;
		boolean s=i>j;
		System.out.println(s);          // > greater then
		
		boolean k1=i<j;
		System.out.println(k1);        // < less then
		
		boolean k2=i<=j;
		System.out.println(k2);        // <= less then are equal
		
		boolean k3= i>=j;
		System.out.println(k3);       // >= greater then eqaul
		
		boolean k4 = i!=j;
		System.out.println(k4);       // != Not equal to
		 System.out.println("--");
	
		 boolean b2 ;
	System.out.println(i==j);         // == eqaul to
		
		// Logical operators 
	   int x = 5;          // Logical AND
       System.out.println(x > 3 && x < 10);      // returns true because 5 is greater than 3 AND 5 is less than 10
       
       //logical OR
       int y= 5;
       System.out.println(x > 3 || x < 4);      // returns true because one of the conditions are true
                                                // (5 is greater than 3, but 5 is not less than 4)
       //Logical not
       int z = 5;
       System.out.println(!(x > 3 && x < 10));    // returns false because ! (not) is used to reverse the result
     }
	}


