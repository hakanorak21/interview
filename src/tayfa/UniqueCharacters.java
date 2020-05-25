package tayfa;

import java.util.Arrays;
import java.util.Collections;

/*
3. Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
*/
public class UniqueCharacters {
	
	public static void main(String[] args) {
		
		String str = "AAABBBCCCDEF";
		System.out.println(unique3(str));
		
	}
	
	// String manipulations
	public static String unique(String str) {
		
		String result = "";
		
		while(str.length() > 0) {
			
			if(str.substring(1).contains(str.substring(0, 1))) {
				str = str.replaceAll(str.substring(0, 1), "");
			} else {
				result += str.substring(0, 1);
				str = str.replace(str.substring(0, 1), "");
			}
		}
		
		return result;
	}
	
	// String manipulations 2
	public static String unique2(String str) {
		
		char[] arr = str.toCharArray();
		String unique = "";
		
		for(int i=0; i < arr.length; i++) {
			
			int count = 0;
			for(int j=0; j < arr.length; j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count == 1)
				unique += arr[i];
			
		}
		return unique;
	}
	
	// Collections' frequency method with ternary
	public static String unique3(String str) {
		
		String unique = "";
		
		for(String each: str.split(""))
			unique += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1)? each: "";
		
		return unique;
		
	}
	

}
