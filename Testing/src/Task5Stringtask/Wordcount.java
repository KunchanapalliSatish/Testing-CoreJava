package Task5Stringtask;

import java.util.Iterator;

public class Wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "welcome to the Hyderabad";
		 int count=1;
		 for (int i =0; i<str.length(); i++) {
			 
			 if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
{
				 
			 count++;

				 
			 }
		 }
			 
		 
		 System.out.println(" Words in welcome to the Hyderabad is: "+count);
	}
}


