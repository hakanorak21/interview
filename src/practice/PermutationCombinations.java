package practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PermutationCombinations {
	
	/*
	Given an array of 3 characters print all permutation combinations 
	from the given characters
	*/
	public static void main(String[] args) {
		
		String str = "abc";
		char[] arr = str.toCharArray();
//		System.out.println(Arrays.toString(arr));
		permute(str,0,str.length()-1);
		
//		//Muhtar's solution
//		printPermutation(arr);
			
	}
	
	public static void permute(String chosenPermutation, int startIndex, int endIndex){

		if(startIndex==endIndex) {
			System.out.println(chosenPermutation);
		} else {
			for (int i = startIndex; i <= endIndex; i++) {
				chosenPermutation=swapLetters(chosenPermutation,startIndex,i);
				permute(chosenPermutation,startIndex+1,endIndex);
				chosenPermutation=swapLetters(chosenPermutation,startIndex,i);
			}
		}
	}
	public static String swapLetters(String str, int index1, int index2){
		char[] charArray = str.toCharArray();
		char temp = charArray[index1] ;
		charArray[index1] = charArray[index2];
		charArray[index2] = temp;
		return String.valueOf(charArray);
	}
	
	//Muhtar's solution with String Set
	public static void printPermutation(char[] ch) {
		for(String s: permutation(ch))
			System.out.println(Arrays.toString(s.toCharArray()));
	}
	
	public static Set<String> permutation(char[] ch){
		
		String str = Arrays.toString(ch).replace(", ", "").
						replace("[", "").replace("]", "");
		Set<String> set = new LinkedHashSet<>();
		
		if (str.length() == 1){ 
			set.add(str);
		}else {
			for(int i = 0; i < str.length(); i++) {
				String a3 = str.substring(0, i) + str.substring(i+1);
				char[] ch2 = a3.toCharArray();
				for(String permutation: permutation(ch2))
					set.add(str.charAt(i)+permutation);
			}
		}
		
		return set;
		
	}

}
