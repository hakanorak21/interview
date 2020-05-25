package tayfa_review;

import java.util.Arrays;

/*
11. Write a function that, given an integer N (1 < N < 100), 
returns an array containing N unique integers that sum up to 0. 
The function can return any such array. For example, given N = 4, 
the function could return [1,0, -3,2] or [-2,1, -4,5]. 
The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). 
For N = 3 one of the possible answers is [-1,0,1] 
(but there are many more correct answers).

5

    -2 -1 0 1 2
    
4

    -2 -1  1  2
*/
public class SumUpToZero {

	public static void main(String[] args) {
		
		int num = 2;
		int[] arr = unique2(num);
		System.out.println(Arrays.toString(arr));
	}
	
	
	// adding negative and positive numbers
	public static int[] unique(int num) {
	
		int[] arr = new int[num];
		
		if(num%2 == 1)
			arr[num/2] = 0;
		
		for(int i=0; i < num/2; i++) {
			arr[i] = -(i+1);
			arr[num-1-i] = i+1;
		}
		
		
		return arr;
	}
	
	// -sum 
	public static int[] unique2(int num) {
		
		int[] arr = new int[num];
		int sum = 0;
		
		for(int i=0; i < num-1; i++) {
			arr[i] = i+1;
			sum += i+1;
		}
		arr[num-1] = -sum;
		
		return arr;
	}

}
