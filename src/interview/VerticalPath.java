package interview;

import java.util.Arrays;

public class VerticalPath {

	public static void main(String[] args) {
		
		int[] x = {1,8,7,3,4,1,8};
		
		for(int i = 0; i < x.length; i++) {

			for(int j = i+1; j < x.length; j++) {

				if(x[i] < x[j]) { 
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		
		int maxDistance = 0;
		
		for(int i=0; i < x.length - 1; i++) {
					
			if((x[i] - x[i+1]) > maxDistance) {
				maxDistance = x[i] - x[i+1];
			}
			
		}
		
		System.out.println(maxDistance);

	}

}
