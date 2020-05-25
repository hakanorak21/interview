package tayfa_review;
/*
4. Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
*/
public class ReverseString {

	public static void main(String[] args) {
		
		String str1 = "ABCD";
		System.out.println(reverse3(str1));

	}
	
	// for loop
	public static String reverse(String str) {
		
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
	
	// while loop
	public static String reverse2(String str) {
		
		String reverse = "";
		while(str.length() > 0) {
			reverse += str.charAt(str.length()-1);
			str = str.substring(0, str.length()-1);
		}
		return reverse;
	}
	
	// StringBuffer
	public static String reverse3(String str) {
		
		return new StringBuffer(str).reverse().toString();
	}
	

}
