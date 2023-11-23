package OopsConcept;

public class Constructer1 {

			
			int empid; 
			String empname; 
			public  Constructer1(int id, String name){ 
			empid = id ; 
			empname = name; 
			}
		public static void main (String [] args){
				Constructer1 cons = new Constructer1(1152,"Satish");
			System.out.println(cons.empid+" "+cons.empname);
			}
		
	

	}


