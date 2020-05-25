package tayfa_review;

import java.util.Arrays;
import java.util.TreeSet;

/*
1. Write a return method that check if a string is build out of the same
letters as another string.
Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:
*/
public class SameLetters {
	
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abb";
		System.out.println(same(str1, str2));
		
		
	}
	
	public static boolean same(String str1, String str2) {
		
		if(str1.length() == str2.length()) {
			while(str1.length() > 0) {
				if(str2.contains(str1.substring(0, 1))) {
					str2 = str2.replace(str1.substring(0, 1), "");
					str1 = str1.substring(1);			
				}
				
			}
			return str1.length() == str2.length();
		}else {
			return false;
		}
		
	}
	
	// Arrays sort method
	public static boolean same2(String a, String b) {
		
		char[] stringA = a.toCharArray();
		char[] stringB = b.toCharArray();
		
		
		Arrays.sort(stringA);
		Arrays.sort(stringB);
		
		return Arrays.equals(stringA, stringB);
//		String a1 = "";
//		String b1 = "";
//		
//		for(char each: stringA) {
//			if(!a1.contains(""+each))
//				a1 += each;
//		}
//		
//		for(char each: stringB) {
//			if(!b1.contains(""+each))
//				b1 += each;
//		}
//		return a1.equals(b1);
		
	}
	
	//TreeSet
	public static boolean same3(String a, String b) {
		
		a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
		b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
				
		return a.equals(b);
	}
		

}
