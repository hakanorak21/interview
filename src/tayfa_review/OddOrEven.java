package tayfa_review;
/*
13. Write a method which can identifies given number is even or
odd
*/
public class OddOrEven {

	public static void main(String[] args) {
		
		int num = 5;
		
		// Remainder operation with if-else
		if(num%2 == 0) 
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		// Remainder operation with ternary
		String result = num%2 == 0? "Even": "Odd";
		System.out.println(result);

	}

}
