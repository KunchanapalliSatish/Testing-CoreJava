package Abstruction;

public class Banklist implements Bank1,bank2 {
	
	public void name () {
		System.out.println("Canarabank");
	}
	
	public void type () {
		System.out.println("private");
	}
	
	public static void main(String[] args) {
		
		Banklist bl = new Banklist();
		bl.name();
		bl.type();
		
		
	}

}
