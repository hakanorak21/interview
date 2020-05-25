package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
20. Given an array of 3 characters print all permutation
combinations from the given characters
*/
public class Permutations3 {

	public static void main(String[] args) {
		
		String str = "abc";
		char[] arr = str.toCharArray();
//		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i < arr.length; i++) {
			
			ArrayList<Character> abc = new ArrayList<Character>();
			
			for(char each: arr)
				abc.add(each);
//			System.out.println(abc);
			
			String output = "";
			
			output += arr[i];
			abc.remove(Character.valueOf(arr[i]));
//			System.out.println(abc2);
			
			Iterator<Character> itr = abc.iterator();
			while(itr.hasNext())
				output += itr.next();
			
			System.out.println(output);
			System.out.println(swap(output));
			
		}
		
	}
	
	public static String swap(String str) {
		
		str = "" + str.charAt(0) + str.charAt(2) + str.charAt(1);
		return str;
	}

}
