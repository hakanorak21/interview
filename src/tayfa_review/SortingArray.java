package tayfa_review;

import java.util.ArrayList;
import java.util.Arrays;

/*
9. Write a return method that can sort an int array in Ascending
order without using the sort method of the Arrays class
Ex:
int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
*/
public class SortingArray {

	public static void main(String[] args) {
		
		int[] arr = {10, 9, 8, 7};
		System.out.println(Arrays.toString(sort3(arr)));
//		sortAscending(arr);
	}
	
	// nested loop and swap
	public static int[] sort(int[] arr) {
		
		for(int i=0; i < arr.length; i++) {
			
			for(int j=i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
	
	//ArrayList
	public static void sortAscending(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int each: arr)
			list.add(each);
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = findMin(list);
			list.remove(Integer.valueOf(arr[i]));
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	// minimum value of a list
	public static int findMin(ArrayList<Integer> a) {
		
		int min = Integer.MAX_VALUE;
		for(int each: a)
			min = Math.min(min, each);
		return min;
	}
	
	// Arrays sort method
	public static int[] sort3(int[] arr) {
		
		Arrays.sort(arr);
		return arr;
	}

}
