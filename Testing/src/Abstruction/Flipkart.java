package Abstruction;

public class Flipkart  implements Ecommerce{


	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Log in functionality for flipkart application");
		
	}


	public void productsearch() {
		System.out.println("product search functionality for flipkart application");
	}


	public void cart() {
		System.out.println("Cart functionality for flipkart application");
	}

	
	public void Logout() {
		System.out.println("Log out functionality for flipkart application");
	}
	
	public static void main(String[] args) {
		
		Flipkart fp = new Flipkart();
		fp.Login();
		fp.productsearch();
		fp.cart();
		fp.Logout();
	}

}
