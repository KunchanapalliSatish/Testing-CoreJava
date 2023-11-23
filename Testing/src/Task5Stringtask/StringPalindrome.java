package Task5Stringtask;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				 String str=new String ("level");
				 String rev="";
			
				 for(int i=str.length()-1;i>=0;i--)
				 {
					 rev=rev+str.charAt(i);
				 }
			//	 System.out.println(rev);
				
				 if(str.equals(rev))
					
				 {
					 System.out.println("String is Palindrome");
				 }
				 else
				 {
					 System.out.println("String is not Palindrome");
				 }
				
		}
		

	}


