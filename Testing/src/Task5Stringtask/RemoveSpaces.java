package Task5Stringtask;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				StringBuffer str=new StringBuffer("Life    is  Always   depends  on   nature");
				for(int i=0;i<str.length();i++)
				{
					if((str.charAt(i)==' ') && str.charAt(i+1)==' ')
					{
						str.deleteCharAt(i);
						i--;
					}	
				}
				System.out.println(str);
			}
		
	}


