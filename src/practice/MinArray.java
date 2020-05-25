package practice;

import java.util.Arrays;

public class MinArray {
	
	public static void main(String[] args) {
	
		int[] arr = {10, 5, 15};
		System.out.println(minNumber(arr));
		System.out.println(minNumber2(arr));
		
	}
	
	//Using for each loop
	public static int minNumber(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for(int each: arr) {
			if(each < min)
				min = each;
		}
		
		return min;
	}
	
	//Using Array sort method
	public static int minNumber2(int[] arr) {
		
		Arrays.sort(arr);
		return arr[0];
	}

}
