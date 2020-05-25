package tayfa_review;
/*
16. Swap two variables without using a third variable
*/
public class Swap {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
//		// using a third variable
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
		
//		// total
//		a = a + b; // a=30, b=20
//		b = a - b; // a=30, b=10
//		a = a - b; // a=20, b=10
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
		
		// Seyfo
		a += b - (b=a); 
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}

}
