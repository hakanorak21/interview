package practice;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {
	
	/*
	1. Write a return method that check if a string is build out of 
	the same letters as another string.
	Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:
	*/
	public static void main(String[] args) {
		String a = "abccc";
		String b = "cab";
//		System.out.println(haveSameLetters(a, b));
//		System.out.println(same(a, b));
		System.out.println(Same(a, b));	
	}
	
	public static boolean haveSameLetters(String a, String b) {
		
		if(a.length() == b.length()) {
			while(a.length() > 0) {
				if(b.contains(a.substring(0, 1))){
					b = b.replace(a.substring(0, 1), "");
					a = a.substring(1);
				}
				else {
					return false;
				}
			}
			return a.length() == b.length();
			
			
		} else {
			return false;
		}
		
	}
	
	//Solution with char array
	public static boolean same(String a, String b) {
		char[] stringA = a.toCharArray();
		char[] stringB = b.toCharArray();
//		System.out.println(Arrays.toString(stringA));
		Arrays.sort(stringA);
		Arrays.sort(stringB);
//		System.out.println(Arrays.toString(stringB));
		a = "";
		b = "";
		for(char each: stringA) {
			if(!a.contains(""+each))
			a += each;
		}
//		System.out.println(a);
		for(char each: stringB) {
			if(!b.contains(""+each))
			b += each;
		}
		return a.equals(b);
	}
	
	//Solution with TreeSet
	//TreeSet is one of the most important implementations 
	//of the SortedSet interface
	//Duplicates are not allowed
	//Sorts in ascending order
	public static boolean Same(String a, String b) {
		
//		if(a.length() == b.length()) {
//		a = new TreeSet(Arrays.asList(a.split(""))).toString();
//		b = new TreeSet(Arrays.asList(b.split(""))).toString();
//		
//		return a.equals(b);
//		
//		}else {
//		
//			return false;
//		}
		
//		System.out.println("Original strings:");
//		System.out.println(a);
//		System.out.println(b);
		a = new TreeSet(Arrays.asList(a.split(""))).toString();
		b = new TreeSet(Arrays.asList(b.split(""))).toString();
//		System.out.println("Treesets:");
//		System.out.println(a);
//		System.out.println(b);
		return a.equals(b);
		
	}

}
