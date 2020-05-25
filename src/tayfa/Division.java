package tayfa;
/*
14. Write a method that can divide two numbers without using
division operator
*/
public class Division {

	public static void main(String[] args) {
		
		divide(13, 4);
	}
	
	public static void divide(int num1, int num2) {
		
		if(num2 == 0){
			
			System.out.println("Cannot divide by zero!");
		
		}else if(num2 > num1) {
			
			System.out.println(num1 + " cannot be divided by " + num2);
			
		}else {
			
			System.out.println(num1 + " divided by " + num2 + " is:");
			
			int result = 0;
			while(num1 >= num2) {
				num1 -= num2;
				result++;
			}
			
			System.out.println(num1 + " with a remainder of " + num2);
			
		}
	}
}
