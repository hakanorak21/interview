package practice;

public class OddOrEven {
	
	/*
	Write a method which can identify given number is even or odd
	EX:
	identify(5) -> "Odd" 
	identify(6) -> "Even"
	*/
	public static void main(String[] args) {
		
		int num = 6;
		System.out.println(evenOrOdd(num));
		System.out.println(evenOrOdd2(num));
	}
	
	public static String evenOrOdd(int num) {
		if(num%2 == 0)
			return "Even";
		else
			return "Odd";
	}
	
	//Ternary
	public static String evenOrOdd2(int num) {
		return num%2 == 0? "Even": "Odd";
	}
	
}
