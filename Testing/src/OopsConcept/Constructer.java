package OopsConcept;

public class Constructer {
	
	public static void main(String[] args) {
		
	}

	int i=25;
	Constructer cp = new Constructer ();
	Constructer cp1= new Constructer (25); // overloaded by local method variable
	Constructer cp2= new Constructer (20,30);  // this three constructers call implictly directly with out use of create object reference varaiable
	



      private int i1=10;
     // here below we see overloading is happen

     public Constructer () {
	
	 System.out.println("Defalut Constructor");
    }
    public Constructer(int i) {
	this.i =25;
	System.out.println(i);
    }
    public Constructer (int x , int y) {
	System.out.println(x+ " " +y);
   }
      }
