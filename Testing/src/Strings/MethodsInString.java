package Strings;

public class MethodsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In string we can create the objects in the two ways
		//Heap Memory : The Java heap is the area of memory used to store objects instantiated 
		//by applications running on the JVM. When the JVM is started, heap memory is created and
		//any objects in the heap can be shared between threads as long as the application is running.
		//>> String Constant pool SCP
		String word= new  String("nature ") ;
		
		System.out.println(word.charAt(5));
		
		System.out.println(word.length());
		
		System.out.println(word.trim());
		
		System.out.println(word.toUpperCase());
		
		System.out.println(word.substring(3));
		
		

	}

}
