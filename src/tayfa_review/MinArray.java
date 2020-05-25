package tayfa_review;

import java.util.Arrays;

/*
8. Write a method that can find the minimum number from an int
Array
*/
public class MinArray {

	public static void main(String[] args) {
		
		int[] arr = {55, 15, 10, 20};
		System.out.println(minValue2(arr));
	}
	
	// for each loop
	public static int minValue(int[] arr) {

		int min = Integer.MAX_VALUE;
		for(int each: arr) {
			if(each < min)
				min = each;
		}
		return min; 

	}
	
	// Arrays sort method
	public static int minValue2(int[] arr) {

		Arrays.sort(arr);
		return arr[0];
	}

}
