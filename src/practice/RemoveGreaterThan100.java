package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveGreaterThan100 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(50, 150, 0, 500));
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			if((int)itr.next() > 100)
				itr.remove();
		}
		System.out.println(list);
		
		//Muhtar's solution
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int each: list) {
			if(each < 100)
				list2.add(each);
		}
		System.out.println(list2);
		
	}

}
