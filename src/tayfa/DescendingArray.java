package tayfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
10. Write a return method that can sort an int array in descending order
without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
*/
public class DescendingArray {

	public static void main(String[] args) {
		
		int[] arr = {10,20,7, 8, 90};
		System.out.println(Arrays.toString(sort(arr)));
	}
	
	// Arrays sort and reverse method
	public static int[] sort(int[] arr) {
		
		Arrays.sort(arr);
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	// Nested loop and swap
	public static int[] sort2(int[] arr) {

		for(int i=0; i < arr.length; i++) {

			for(int j=i+1; j < arr.length; j++) {

				if(arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		return arr;
	}
	
	// ArrayList
	public static int[] sort3(int[] arr) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int each: arr)
			list.add(each);

		for(int i=0; i < arr.length; i++) {
			arr[i] = findMax(list);
			list.remove(Integer.valueOf(arr[i]));
		}
		return arr;
	}

	// Maximum value of a list
	public static int findMax(ArrayList<Integer> a) {

		int max = Integer.MIN_VALUE;
		for(int each: a)
			max = Math.max(max, each);
		return max;
	}

		

}
