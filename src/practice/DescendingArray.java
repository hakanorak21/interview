package practice;

import java.util.Arrays;
import java.util.Collections;

public class DescendingArray {
	
	/*
	Write a return method that can sort an int array in descending order 
	without using the sort method of the Arrays class
	Ex: int[] arr = {10,20,7, 8, 90};
	arr = Sort(arr); ==> {90, 20, 10, 8, 7};
	*/
	public static void main(String[] args) {
	
		int[] arr = {10,20,7, 8, 90};
		System.out.println(Arrays.toString(sortArray(arr)));
		
		//Using Collections
		Integer[] arr2 = {10,20,7, 8, 90};
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2));
		
	}
	
	public static int[] sortArray(int[] arr) {
	
		for(int i = 0; i < arr.length; i++) {

			for(int j = i+1; j < arr.length; j++) {

				if(arr[i] < arr[j]) { 
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		
		return arr;
		
	}

}
