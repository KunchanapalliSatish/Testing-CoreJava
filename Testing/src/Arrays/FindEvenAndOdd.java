package Arrays;

public class FindEvenAndOdd {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int a[]= {13,20,4,15,35,56,45};
				//int[] a1=new int[3];
				System.out.println("even numbers are");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2==0) {
						System.out.println(a[i]);
					}
				}
				System.out.println("Odd numbers are");
				for(int i=0;i<a.length;i++)
				{
					 if(a[i]%2!=0)
					{
						System.out.println(a[i]);
					}
					
				}

			}

		



	}


