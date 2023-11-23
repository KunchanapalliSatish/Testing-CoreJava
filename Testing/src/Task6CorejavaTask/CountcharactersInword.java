package Task6CorejavaTask;

public class CountcharactersInword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("Technology Modern");
		int count = 0;
		for(int i=0 ;i<=str.length()-1; i++) 
		{
			if((str.charAt(i)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
		
		

	}

}
