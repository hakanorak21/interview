package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class UniqueCharacters {
	
	/*
	Write a return method that can find the unique characters from the String
	Ex: unique("AAABBBCCCDEF") ==> "DEF";
	*/
	public static void main(String[] args) {
		
		String str = "AAABBBCCCDEF"; 
		System.out.println(uniqueCharacters(str));
		System.out.println(uniqueCharacters2(str));
		System.out.println(uniqueCharacters3(str));
		
	}
	
	//Using String manipulations
	public static String uniqueCharacters(String str) {
		
		String result = "";
		while(str.length() > 0) {
			if(str.substring(1).contains(str.substring(0, 1))) {
				str = str.replaceAll(str.substring(0, 1), "");
			}else {
				result += str.substring(0, 1); 
				str = str.replace(str.substring(0, 1), "");
			}				
		}
		return result;
	}
	
	//Using arrays
	public static String uniqueCharacters2(String str) {
		
		char[] arr = str.toCharArray();
		String result = "";
		
		for(int i=0; i < arr.length; i++) {
			
			int count = 0;
			for(int j=0; j < arr.length; j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count == 1)
				result += "" + arr[i];
			
		}
		
		return result;
	}
	
	//Using Collections' frequency method with ternary
	public static String uniqueCharacters3(String str) {
		
		String result = "";
		
		for(String each: str.split("")) {
			
			result += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1)? each: "";
		}
		
		return result;
	}

}
