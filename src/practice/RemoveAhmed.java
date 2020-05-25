package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveAhmed {
	
	public static void main(String[] args) {
		
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Ahmed");
//		names.add("John");
//		names.add("Eric");
//		names.add("Ahmed");		
		
		//Or
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed",
									"John", "Eric", "Ahmed"));
		System.out.println(names);
		
//		//Solution 1: RemoveAll
//		names.removeAll(Arrays.asList("Ahmed"));
//		System.out.println(names);
		
		//Solution 2: Iterator
		Iterator itr = names.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("Ahmed"))
				itr.remove();
		}
		System.out.println(names);
		
	}

}
