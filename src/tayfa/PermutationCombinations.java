package tayfa;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
12. Given an array of 3 characters print all permutation
combinations from the given characters
*/
public class PermutationCombinations {

	public static void main(String[] args) {
		
		String str = "abc";
		char[] arr = str.toCharArray();
		printPermutation(arr);
	}
	
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
