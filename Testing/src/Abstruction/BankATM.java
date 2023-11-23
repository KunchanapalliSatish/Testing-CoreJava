package Abstruction;

public class BankATM  implements ATM1,ATM2{  // Two parent interfaces  are implemenated in one  child class

	
	public void Deposit() {
		System.out.println("Deposited Money");
		
	}

	
	public void Withdrawl() {
		System.out.println("Withdral the Money");
		
	}
	public static void main(String[] args) {
		
		BankATM bank = new BankATM();
		bank.Deposit();
		bank.Withdrawl();
	}

}
