package practice;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "javavaj";
		System.out.println(isPalindrome(str));

	}
	
	public static boolean isPalindrome(String str) {
		
		String reverse = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		
		return reverse.equalsIgnoreCase(str);
			
	}
	
}
