package tayfa_review;
/*
14. Write a method that can divide two numbers without using
division operator
*/
public class Division {

	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 4;
		
		if(num2 == 0) {
			System.out.println("Cannot divide by zero!");
		}else if(num1 < num2){
			System.out.println(num1 + " cannot be divided by " + num2);
		}else {
			int result = 0;
			while(num1 >= num2) {
				num1 -= num2;
				result++;
			}
			System.out.println(result + " with a remainder of " + num1);		
		}
	}

}
