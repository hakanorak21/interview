package tayfa;
/*
16. Swap two variables without using a third variable
*/
public class Swap {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		swap3(a, b);

	}
	
	// third value
	public static void swap(int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
	
	// total
	public static void swap2(int a, int b) {
		
		a = a + b; // a=30, b=20
		b = a - b; // a=30, b=10
		a = a - b; // a=20, b=10
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
	
	// Seyfo
	public static void swap3(int a, int b) {
		
		a += b - (b=a);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
	
	// binary operation (no idea)
	public static void swap4(int a, int b) {
		
		a = a ^ b;
		b = a ^ b;		
		a = a ^ b;
		
	}

}
