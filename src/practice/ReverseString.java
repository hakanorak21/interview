package practice;

public class ReverseString {
	
	/**
	Write a return method that can reverse String 
	Ex: Reverse("ABCD"); ==> DCBA
	*/
	
	public static void main(String[] args) {
		
		String str = "ABCD";
		System.out.println(reverseString(str));
		System.out.println(reverseString2(str));
		System.out.println(reverseString3(str));
		
	}
	
	//Using while loop with String manipulations
	public static String reverseString(String str) {
		
		String result = "";
		
		while(str.length() > 0) {
			result += str.substring(str.length()-1);
			str = str.substring(0, str.length()-1);
		}
		
		return result;
	}
	
	//Using for loop
	public static String reverseString2(String str) {
		String result = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
//			result += str.substring(i, i+1); 
			result += str.toCharArray()[i];
		}
		
		return result;
		
	}
	
	//Using StringBuffer
	public static String reverseString3(String str) {
		
		return new StringBuffer(str).reverse().toString();
		
	}
	

}
