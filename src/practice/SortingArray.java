package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingArray {
	
	/**
	Write a return method that can sort an int array 
	in Ascending order without using the sort method of the Arrays class
	Ex:
	int[] arr = {10, 9, 8, 7};
	arr = Sort(arr); ==>{ 7, 8, 9, 10};
	*/
	
	public static void main(String[] args) {
		
		int[] arr = {10, 9, 8, 7};
		int[] arr2 = sortArray2(arr);
		System.out.println(Arrays.toString(arr2));
	}
	
	public static int[] sortArray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) { 
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}

		}
		return arr;
	}
	
	//Using ArrayList
	public static int[] sortArray2(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int each: arr)
			list.add(each);
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = findMin(list);
			list.remove(Integer.valueOf(arr[i]));
			
		}
		return arr;
	}
		
	public static int findMin(ArrayList<Integer> a) {
		
		int min = Integer.MAX_VALUE;
		
		for(int each: a)
			min = Math.min(min, each);
		
		return min;
	}

}
