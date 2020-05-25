package tayfa;

import java.util.Arrays;
import java.util.TreeSet;

/*
1. Write a return method that check if a string is build 
out of the same letters as another string.
*/
public class SameLetters {
	
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "cab";
		System.out.println(same(str1, str2));
		
	}
	
	// String manipulations
	public static boolean same(String a, String b) {
		
		if(a.length() == b.length()) {
			while(a.length() > 0) {
				if(b.contains(a.substring(0, 1))) {
					b = b.replace(a.substring(0, 1), "");
					a = a.substring(1);
				}
			}
			return a.length() == b.length();
			
		}else if(a.length() > b.length()){
			while(b.length() > 0 && b.length() > 0) {
				if(a.contains(b.substring(0, 1))) {
					a = a.replaceAll(b.substring(0, 1), "");
					b = b.substring(1);
				}
			}
			return a.length() == b.length();
		
		}else {
			while(b.length() > 0 && a.length() > 0) {
				if(b.contains(a.substring(0, 1))) {
					b = b.replaceAll(a.substring(0, 1), "");
					a = a.substring(1);
				}
			}
			return a.length() == b.length();
		
		}
			
	}
	
	// Arrays
	public static boolean same2(String a, String b) {
		
		char[] stringA = a.toCharArray();
		char[] stringB = b.toCharArray();
		
		Arrays.sort(stringA);
		Arrays.sort(stringB);
		
		String a1 = "";
		String b1 = "";
		
		for(char each: stringA) {
			if(!a1.contains(""+each)) {
				a1 += each;
			}
		}
		
		for(char each: stringB) {
			if(!b1.contains(""+each)) {
				b1 += each;
			}
		}
		
		return a1.length() == b1.length();
		
	}
	
	//TreeSet
	public static boolean same3(String a, String b) {
		
		a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
		b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
		
		return a.length() == b.length();
		
	}

}
