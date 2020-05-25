package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Siblings {

	public static void main(String[] args) {
		
		int num = 451;
		System.out.println(solution(num));

	}
	
	public static int solution(int N) {
		
		List<Integer> number = new ArrayList<Integer>();
		
		while(N > 0) {
			number.add(N % 10);
			N /= 10;
			
		}
		
		Collections.sort(number);
		
		int[] arr = new int[number.size()];
		for(int i=0; i < number.size(); i++) {
			arr[i] = number.get(number.size()-i-1);
		}
		
		String bigSibling = Arrays.toString(arr);
		bigSibling = bigSibling.replace("[", "").replace(", ", "").replace("]", "");
		N = Integer.parseInt(bigSibling);
		
		return N;
	}

}
