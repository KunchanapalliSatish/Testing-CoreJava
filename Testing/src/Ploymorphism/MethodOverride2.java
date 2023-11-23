package Ploymorphism;

public class MethodOverride2 extends MethodOverridding{
	
	public void  car () {
	System.out.println("Car is out of stock");
}
	
	public static void main(String[] args) {
		
//		MethodOverride2 mr= new MethodOverride2();
//		mr.car();
		MethodOverridding mr1 = new MethodOverride2();
		mr1.car();
		
	}

}
