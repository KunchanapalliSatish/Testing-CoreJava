package JavaBasics;

public class Task2SwitchCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instead of writing many if..else statements, you can use the switch statement.

        //The switch statement selects one of many code blocks to be executed:
//		switch(expression) {
//		  case 1:
//		    // code block
//		    break;
//		  case 2:
//		    // code block
//		    break;
//		    case 3:
//		    // code block
//		    break;
//		  default:
		    // code block
//}
		//Above, the expression in the switch parenthesis is compared to each case.
		//When the expression is the same as the case, the corresponding code block in the case gets executed.

		//If all the cases do not match the expression, then the code block defined under the default keyword gets executed.

		//We use the break keyword to terminate the code whenever a certain 
		//condition is met (when the expression matches with a case).
		int day = 7;
		switch (day) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
		
		
		// Ex2
		 // char grade = args[0].charAt(0);
	      char grade = 'B';

	      switch(grade) {
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	      
	      //EX3
	      String username = "Satish";
	        
	        switch (username) {
	          case "Satish":
	            System.out.println("Username is Satish");
	            break;
	          case "satya":
	            System.out.println("Username is satya");
	            break;
	          case "prasad":
	            System.out.println("Username is prasad");
	            break;

	}

}
}
