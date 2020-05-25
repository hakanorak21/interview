package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

import jdk.jfr.Experimental;

public class FrequencyOfCharacters {
	
	/**
	Write a return method that can find the frequency of characters
	Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
	*/
	public static void main(String[] args) {
		
		String str = "AAABBCDD";
		System.out.println(frequencyOfChars(str));
		System.out.println(frequencyOfChars2(str));
	}
	
	//Using String manipulations
	public static String frequencyOfChars(String str) {
		
		String result = "";
		
		while(str.length() > 0) {
			
			int count = 0;
			
			for(int i = 0; i < str.length(); i++) {
			
				if(str.substring(i).contains(str.substring(0, 1))) {
					count++;
				}
			}
			
			result += str.substring(0, 1) + count;
			str = str.replaceAll(str.substring(0, 1), "");
		}
		
		return result;
	}
	
	// String manipulations 2
	// Separate solutions with Collections 
	// Check all 4 solutions by Muhtar
	public static String frequencyOfChars2(String str) {
		
//		String nonDup = ""; 
//		for(int i=0; i < str.length(); i++)
//			if(!nonDup.contains(str.substring(i, i+1))) 
//				nonDup+= str.substring(i, i+1);
		
		String nonDup = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
		nonDup = nonDup.replace(", ", "").replace("[", "").replace("]", "");	
		
		String expectedResult = ""; 
		
//		for( int j=0;j < nonDup.length(); j++) {
//			
//			int count = 0;
//			
//			for(int i=0; i < str.length(); i++) {
//				
//				if(str.charAt(i) == nonDup.charAt(j)) 
//					count++;
//			}
		
		for(int i=0; i < nonDup.length(); i++) {
			
			int count = Collections.frequency( Arrays.asList(str.split("") ) , nonDup.substring(i, i+1) );
		
			expectedResult += nonDup.substring(i, i+1) + count; 
		}
			
		return expectedResult;
	}
	

}
