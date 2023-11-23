package JavaBasics;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int [] i= {1,2,3};
			System.out.println(i[3]);
			
		} catch (Exception e) {
		 System.out.println(e);
			//e.printStackTrace();
		
	
		System.out.println("Something Went Wrong");
	}
		
		finally  {
			System.out.println("The 'try catch' is finished");
		}
		
		
	
	

	}


}
