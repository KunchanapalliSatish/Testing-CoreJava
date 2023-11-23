package Ploymorphism;

public class MethodOverLoading1 {

	
		

	

	public void add() {
		// TODO Auto-generated method stub
		System.out.println("first method");
		
	}

	public void add(int i) {
		// TODO Auto-generated method stub
		System.out.println("second method");
		System.out.println(i);
		
	}

	public void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Thrid method");
		System.out.println(i+j);
		
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading1 obj1= new MethodOverLoading1 ();
		
	obj1.add();
	obj1.add(10);
	obj1.add(10,20);





	}

}
