package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroesToTheEnd {
	
	/*
	Write a method that can move all the zeros to  last indexes of the array 
	(Do Not Use Sort Method)

	Ex:

	input:  {1,0,2,0,3,0,4,0};
	output: [1, 2, 3, 4, 0, 0, 0, 0]
	*/
	public static void main(String[] args) {
		
		int[] arr = {1,0,2,0,3,0,4,0};
		System.out.println(Arrays.toString(arr));
		System.out.println(moveZeroes(arr));
		
	}
	
	public static ArrayList<Integer> moveZeroes(int[] arr) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arrayList.add(arr[i]);
			}
				
		}
		
		int numberOfZeroes = arr.length - arrayList.size();
		for(int i=0; i < numberOfZeroes; i++) {
			arrayList.add(arrayList.size()-i, 0);
		}
		return arrayList;
	}

}
