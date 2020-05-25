package tayfa;
/*
13. Write a method which can identifies given number is even or
odd
*/

public class OddOrEven {

	public static void main(String[] args) {
		
		int num = 2;
		oddOrEven(num);
		System.out.println(oddOrEven2(num));
	}
	
	// Remainder operation with if-else
	public static void oddOrEven(int num) {
		
		if(num%2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");		
	}
	
	// Remainder operation with ternary
	public static String oddOrEven2(int num) {
			
		return num%2 == 0? "Even": "Odd";		
	}

}
