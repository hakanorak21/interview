package practice;

import java.util.Arrays;

public class MaxArray {
	
	/**
	Write a method that can find the maximum number from an int Array
	*/
	
	public static void main(String[] args) {
		
		int[] arr = {5, 15, 10};
		System.out.println(maxNumber(arr));
		System.out.println(maxNumber2(arr));
		
	}
	
	//Using for each loop
	public static int maxNumber(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for(int each: arr) {
			if(each > max)
				max = each;
		}
		return max;
		
	}
	
	//Using Array methods
	public static int maxNumber2(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
		
	}

}
