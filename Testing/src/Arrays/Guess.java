package Arrays;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int[] N = new int[101];
	        for (int i = 0; i < N.length; i++) N[i] = i;
	        int sum = 0;
	        for (int e : N) sum += e;
	        System.out.println(sum);

	}

}
