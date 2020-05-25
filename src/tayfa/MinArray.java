package tayfa;
/*
8. Write a method that can find the minimum number from an int Array
*/
import java.util.Arrays;


public class MinArray {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 5, 15};
		System.out.println(minValue2(arr));
	}
	
	// For loop
	public static int minValue(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		for(int each: arr) {
			if(each < min)
				min = each;
		}
		return min;
	}
	
	// Arrays' sort method
	public static int minValue2(int[] arr) {
		
		Arrays.sort(arr);
		return arr[0];
	}

}
