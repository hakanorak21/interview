package practice;

import java.util.Arrays;

public class SumUpToZero {
	
	/*
	Write a function:
	that, given an integer N (1 < N < 100), 
	returns an array containing N unique integers that sum up to 0. 
	The function can return any such array. 
	For example, given N = 4, the function could return [1,0, -3,2] 
	or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect 
	(because value 1 occurs twice). 
	For N = 3 one of the possible answers is [-1,0,1] 
	(but there are many more correct answers).
	*/
	public static void main(String[] args) {
		
		int a = 4;
		
		//My solution
		int[] arr = sumUpToZero(a);
		System.out.println(Arrays.toString(arr));
		
		//Muhtar's solution
		int[] arr2 = sumUpToZero2(a);
		System.out.println(Arrays.toString(arr2));
		
	}
	
	public static int[] sumUpToZero(int a) {
		
		int[] arr = new int[a];
		
		if(a % 2 == 1)
			arr[a/2] = 0;
		
		for(int i = 0; i < a/2; i++) {
		
			arr[i] = -(i+1);
			arr[a-1-i] = i+1;
			
		}
		
		return arr;
	}
	
	//Muhtar's solution
	public static int[] sumUpToZero2(int a) {
		
		int[] arr = new int[a];
		int sum = 0;
		
		for(int i=0; i < a-1; i++) {
			arr[i] = i;
			sum += i;
		}
		
		arr[a-1] = -sum;
		
		return arr;
	}

}
