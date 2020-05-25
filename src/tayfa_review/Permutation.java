package tayfa_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
(same as 12)
20. Given an array of 3 characters print all permutation
combinations from the given characters
[a,b,c]
abc
acb
bac
bca
cab
cba
*/
public class Permutation {

	public static void main(String[] args) {
		
		String str = "abc";
		char[] arr = str.toCharArray();
//		printPermutation(arr);
		
		for(int i=0; i < arr.length; i++) {
			
			ArrayList<Character> abc = new ArrayList<Character>();
			
			for(char each: arr)
				abc.add(each);
//			System.out.println(abc);
			
			String output = "";
			output += arr[i];
			abc.remove(Character.valueOf(arr[i]));
			
			Iterator itr = abc.iterator();
			while(itr.hasNext())
				output += itr.next();
			System.out.println(output);
			
			String output2 = "" + output.charAt(0) + output.charAt(2) + output.charAt(1);
			System.out.println(output2);
		}
		
	}
	
	// recursive method
	public static void printPermutation(char[] ch) {

		for(String str: permutation(ch))
			System.out.println(Arrays.toString(str.toCharArray()));
	}

	public static Set<String> permutation(char[] ch){

		String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");

		Set<String> set = new LinkedHashSet<>();
		if(str.length() == 1) {
			set.add(str);
		}else {
			for(int i=0; i < str.length(); i++) {
				String a3 = str.substring(0, i) + str.substring(i+1);
				char[] ch2 = a3.toCharArray();
				for(String permutation: permutation(ch2)) 
					set.add(str.charAt(i) + permutation);
			}
		}
		return set;
	}

}
