package Ploymorphism;

public class MethodOverLoading {

//	The overloaded and overloading methods must be in the same class (Note: this includes any methods inherited, even implicitly, from a superclass).
//	The method parameters must change: either the number or the type of parameters must be different in the two methods.
//	The return type can be freely modified.
//	The access modifier (public, private, and so on) can be freely modified.
//	Thrown exceptions, if any, can be freely modified.
//		
		int a;
		int b;
		
		public void sum () {
			a=10;
			b=20;
			System.out.println(a+b);
			
		}
		
		
       public void sum (int a1, int b1) {
                a=a1;
                b=b1;
			System.out.println(a1+b1);
		}
		
       public void sum (int a1, int a2, int a3) {
    	   System.out.println(a1+a2+a3);
	
        }

       public void sum (int a1, double b1) {
			
			System.out.println(a1+b1);
	   }
       public static void main(String[] args) {
		MethodOverLoading ml = new MethodOverLoading() ;
		ml.sum();
		ml.sum(12, 12.5);
		ml.sum(10, 10);
		ml.sum(45, 45, 45);
	}
}


