package tayfa;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

/*
5. Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/
public class FrequencyOfCharacters {
	
	public static void main(String[] args) {
		
		String str = "AAABBCDD";
		System.out.println(frequency3(str));
	}
	
	// String manipulations (while loop)
	public static String frequency(String str) {
		
		String result = "";
		
		while(str.length() > 0) {
			 
			int count = 0;
			for(int i=0; i < str.length(); i++) {
				if(str.substring(i).contains(str.substring(0, 1))) {
					count++;	
				}
				
			}
			result += str.substring(0, 1) + count;
			str = str.replaceAll(str.substring(0, 1), "");
		}
		
		return result;
	}
	
	// String manipulations (for loop)
	public static String frequency2(String str) {
		
		String nonDup = "";
		for(int i=0; i < str.length(); i++) {
			if(!nonDup.contains(str.substring(i, i+1)))
				nonDup += str.substring(i, i+1); 
		}
		
		String result = "";
		for(int i=0; i < nonDup.length(); i++) {
			int count = 0;
			for(int j=0; j < str.length(); j++) {
				if(str.charAt(j) == nonDup.charAt(i))
					count++;
			}
			result += nonDup.charAt(i) + "" + count;
		}
		
		return result;	
	}
	
	// LinkedHashSet
	public static String frequency3(String str) {
		
		String nonDup = new LinkedHashSet(Arrays.asList(str.split(""))).toString();
		nonDup = nonDup.replace(", ", "").replace("[", "").replace("]", "");

		String result = "";
		for(int i=0; i < nonDup.length(); i++) {
			int count = 
				Collections.frequency(Arrays.asList(str.split("")), nonDup.substring(i, i+1));
			result += nonDup.substring(i, i+1) + count; 
			
		}
		return result;
	}

}
