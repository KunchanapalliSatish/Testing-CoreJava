package JavaBasics;

public class ConditioanlOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if condition
		 int userage =25;  
		    if(userage>18){  
		        System.out.println("User age is greater than 18");  
		
		
		//else
		
		 int number=26;  
		    if(number%2==0){  
		        System.out.println(" given number is even number");  
		    } 
		    else {  
		        System.out.println("given number is odd number"); 
          }

}
		    //Example2
		    int time = 17;
		    if (time < 12) {
		      System.out.println("Good morning.");
		    } else if (time>12&&time<16) {
		      System.out.println("Good afternoon.");
		    }
		      else if ( time>16&& time<19) {
		    	  System.out.println("Good evening");
		      }
		      else {
		    	  System.out.println("Good night");
		      }
}
}

