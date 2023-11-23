package JavaBasics;

public class postandpreincrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

          int a=10;
          System.out.println(a);  //  10
          System.out.println(++a); // 11
          System.out.println(a++); // 11
          System.out.println(a);  // 12
          //a++;
          --a;
         System.out.println(a); // 11
         System.out.println(a++); // 11
         //++a;
        System.out.println(a++); // 12
        System.out.println(a);  // 13
        
        
        //ex2
        int m=1; int n =2;
         
        int o =   m++ + n + ++m;            // It goes like m++ = 1, n = 2, ++m = 1+ incremented 'm' from m++
                                      //                                                         = 1 + (1+m) = 1+ (1+1) = 3
                                                                   //  o = 1   + 2 +   3 = 6 
        System.out.println("Example \n o = "+ o);

	}

}
