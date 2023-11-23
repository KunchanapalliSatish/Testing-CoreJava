package OopsConcept;

public class This {

	
		int s;
		public This (int s) {
			this.s=s;
		}
		
		void display () {
			System.out.println(s);

	}
		public static void main(String[] args) {
			This th = new This(5);
			th.display();
		}

}
