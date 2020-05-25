package tayfa;
/*
4. Write a return method that can reverse String 
Ex: Reverse("ABCD"); ==> DCBA
*/
public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "ABCD";
		System.out.println(reverseString3(str));
	}
	
	// String manipulations (for loop)
	public static String reverseString(String str) {
		
		String reverse = "";
		
		for(int i=str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		
		return reverse;
		
	}
	
	// String manipulations (while loop)
	public static String reverseString2(String str) {
		
		String reverse = "";		
		
		while(str.length() > 0) {
			reverse += str.charAt(str.length()-1);
			str = str.substring(0, str.length()-1);
		}		
		
		return reverse;
	}
	
	// StringBuffer
	public static String reverseString3(String str) {
		
		return new StringBuffer(str).reverse().toString();
	}
}
