package tayfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
20. Given an array of 3 characters print all permutation
combinations from the given characters
*/
public class Permutation {

	public static void main(String[] args) {
		
		String str = "abc";
		char[] arr = str.toCharArray();
		
		for(int i=0; i < arr.length; i++) {
			
			ArrayList<Character> abc = new ArrayList<Character>();
			
			for(char each: arr)
				abc.add(each);
			
			String output = "";
			output += arr[i];
			abc.remove(Character.valueOf(arr[i]));
			
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
