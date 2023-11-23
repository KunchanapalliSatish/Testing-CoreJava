package inheritance;

public class B  extends singleinheritanceA{
	
	String model= "AUDI";
	public static void main(String[] args) {
		B car= new B();
		System.out.println(car.model);
		System.out.println(car.a);
	}

}
