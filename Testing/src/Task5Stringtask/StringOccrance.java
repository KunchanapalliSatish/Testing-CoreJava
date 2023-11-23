package Task5Stringtask;

public class StringOccrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
//				String str=new String("My name is nature");
//				int count=0;
//				for(int i=0 ;i<=str.length()-1; i++) 
//				{
//					if((str.charAt(i)=='a'))
//					{
//						count++;
//					}
//				}
//				System.out.println(count);
//			}
	
			String str=new String("Yellowwooddoor");
			int count=0;
			int count1=0;
			for(int i=0 ;i<=str.length()-1; i++) 
			{
				if((str.charAt(i)=='o'))
				{
					count++;
				}
				else if(str.charAt(i)=='d')
				{
					count1++;
				}
			}
			System.out.println("Count of o: "+count);
			System.out.println("Count of d: "+count1);
		}
		}

		


	


