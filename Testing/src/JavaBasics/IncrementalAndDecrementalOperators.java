package JavaBasics;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=i++;//post increment
		/* Here post increment means first take the value of i and give it to j
		* and then increment the value means first i was 1 so j will be 1. then
		* increment the value of i by 1 means now i is 2
		* run the below sysout to see values of i and j.
		*/
		System.out.println(i);
		System.out.println(j);
		System.out.println("************");

		int a =1;
		int b =++a; // pre increment
		/* in above case first increment the value of a and give it to b means a will be incremental
		* and this 2 value is assigned to b and  also now a is 2
		* so the value for both a and b is 2.
		*/
		System.out.println(a);
		System.out.println(b);
		System.out.println("------------");
		   
		int m = 2;
		int n = m--; // post decrement
		/*here post decrement means first assign the value of m to n means n is 2
		* then decrease the value of m by 1 means m is now 1.
		*/
		System.out.println(m);
		System.out.println(n);
		System.out.println("+++++++++++");

		int x=5;
		int y=--x; // pre decrement
		/* here pre decrement means first decrement the value of x and give it to y means x will be decremental
		* and this 4 is assigned to y and also now x is 4
		*/
		System.out.println(x);
		System.out.println(y);


	}

}
