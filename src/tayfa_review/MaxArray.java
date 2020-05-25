package tayfa_review;

import java.util.Arrays;

/*
7. Write a method that can find the maximum number from an int
Array
*/
public class MaxArray {

	public static void main(String[] args) {
		
		int[] arr = {5, 15, 10};
		System.out.println(maxValue2(arr));
		
	}
	
	// for each loop
	public static int maxValue(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		for(int each: arr) {
			if(each > max)
				max = each;
		}
		return max; 
		
	}
	
	// Arrays sort method
	public static int maxValue2(int[] arr) {
		
		Arrays.sort(arr);
		return arr[arr.length-1];
	}

}
