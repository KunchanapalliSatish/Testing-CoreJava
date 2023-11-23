package Task5Stringtask;

public class RemoveSpecialCharsInWord {

	public static void main(String[] args) {
				StringBuffer str=new StringBuffer("Ma@$*%ro^li*x");
				//String str1="";
			
		        for (int i = 0; i < str.length(); i++) {
		 
		           
		            if (!Character.isDigit(str.charAt(i))
		                && !Character.isLetter(str.charAt(i))
		                && !Character.isWhitespace(str.charAt(i))) {
		                
		            str.deleteCharAt(i);
		            i--;
		            }
		        }
		        System.out.println(str);
			
			}

		}



		

	


			

		

	

