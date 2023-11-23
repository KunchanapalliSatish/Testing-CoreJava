package JavaBasics;

public class Ifesle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Any year that is evenly divisible by 4 is a leap year
		//A year is leap, if it is divisible by 4 and 400. But, not by 100.
//		 int year=2023;    
//		    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
//		        System.out.println("LEAP YEAR");  
//		    }  
//		    else{  
//		        System.out.println("COMMON YEAR");  
//		    }  
		    
		    //else if
		    int score=90;  
		      
		    if(score<50){  
		        System.out.println("fail");  
		    }  
		    else if(score>=50 && score<60){  
		        System.out.println("D grade");  
		    }  
		    else if(score>=60 && score<70){  
		        System.out.println("C grade");  
		    }  
		    else if(score>=70 && score<80){  
		        System.out.println("B grade");  
		    }  
		    else if(score>=80 && score<90){  
		        System.out.println("A grade");  
		    }
		    else if(score>=90 && score<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  

	}
		    //Ex3 
		    int time = 16;
		    if (time < 10) {
		      System.out.println("Good morning.");
		    } else if (time < 18) {
		      System.out.println("Good day.");
		    } else {
		      System.out.println("Good evening.");
	}
}
}

