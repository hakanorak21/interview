package practice;

public class Division {
	
	/*
	Write a method that can divide two numbers 
	without using division operator
	*/
	public static void main(String[] args) {
		
		System.out.println(divide(13, 4));
		
	}
	
	public static String divide(int a, int b) {
		
		if(b == 0) {
			
			System.out.println("Cannot divide by zero!");
			System.exit(0);
			
		} else if(b > a){
			
			System.out.println(a + " cannot be divided by " + b);
			System.exit(0);
		} else {
		
			int result = 0;
			while(a >= b) {
				a -= b;
				result++;
			}
			return "" + result + " with remainder of " + a;
		}
		
		return null;
	}
}
