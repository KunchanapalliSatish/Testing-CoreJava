package JavaBasics;

public class Concationoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 100;
		int b = 200; 
		String x= "Hello"; 
		String y = "world"; 
		int c = a+b; 
		
		Double c1= 12.33;
		Double d= 10.33; 
		
		System.out.println(x+y); 
		System.out.println(a+b);
		System.out.println(a+b+x+y);    // 300 hello world 
		System.out.println(x+a+b+y);    // hello100 200world 
		System.out.println(x+y+(c1+d)); // helloworld 22.66 
		System.out.println(y+(a+b));	// world 300 
		System.out.println("The value of a is:" +a);  // the value of a is 100 
		System.out.println("Hello Selenium");
		System.out.println("Hello Testing"); 
		System.out.println("Next year");

	}

}
