package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	
	/*
	Write a return method that can remove the duplicated values from String
	Ex: removeDup("AAABBBCCC") ==> ABC
	*/
	public static void main(String[] args) {
		
		String str = "AAABBBCCCAC"; 
		System.out.println(removeDuplicates(str));
		System.out.println(removeDup(str));
		
	}
	
	//Using String manipulations
	public static String removeDuplicates(String str) {
		
		String result = "";
		
//		while(str.length() > 0) {
//			result += str.substring(0, 1);
//			str = str.replaceAll(str.substring(0, 1), "");
//		}
		
		for(int i=0; i < str.length(); i++) {
			if(!result.contains("" + str.charAt(i)))
				result += "" + str.charAt(i);
		}
		
		return result;
	}
	
	//Using LinkedHashSet
	public static String removeDup(String str) {
		
		str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
		str = str.replace(", ", "").replace("[", "").replace("]", "");
		
		return str;
	}

}
