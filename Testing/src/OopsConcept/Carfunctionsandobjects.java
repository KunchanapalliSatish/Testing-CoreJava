package OopsConcept;

public class Carfunctionsandobjects {

	int wheel;
	int mod;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new key word is used to create object and a,b,c are object reference varaiables.
		//Carfunctionsandobjects a = new Carfunctionsandobjects () ; // here new Car (); is the car class and
		// a,b,c is object reference and object variables are mod and wheel.
		// we cannot create duplicates class object  reference names like using a twice we cannot do.
	     	Carfunctionsandobjects a = new Carfunctionsandobjects () ;
		 Carfunctionsandobjects b = new Carfunctionsandobjects ();
		 Carfunctionsandobjects c = new Carfunctionsandobjects ();
		 
		 
		 a.mod=2014; // as mod is int type here, here we are intilizing the value to a a.mod
		 a.wheel=4;
		 
		 b.mod=2015;
		 b.wheel=5;

		 
          c.mod=2013;
		 c.wheel=6;
		 
		 System.out.println("Before assigning the reference");
		 System.out.println("The model is " +a.mod);
		 System.out.println(a.wheel);
		 
		 System.out.println("The model is "+b.mod);
		 System.out.println(b.wheel);
		 
		 System.out.println("The model is "+c.mod);
		 System.out.println(c.wheel);
		 
		 System.out.println("After shifting the reference");
		             a=b;
		             b=c;
		             c=a;
		            a.mod=10;
		System.out.println("The model is "+a.mod);
	   //here the value of a.mod is 10
		System.out.println(a.wheel);
		    
		c.mod=20;
		System.out.println("The model is "+c.mod);
		// here the value of a.mod will be 20
		//as c=a
	   System.out.println(a.wheel);
	   b.mod=30;
	   System.out.println("The model is"+b.mod);
	   System.out.println(b.wheel);


	}

}
