package tayfa_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
18. Given a list of people' names: "Ahmed", "John", Eric",
"Ahmed".....
Write a java operation to remove all the names named Ahmed
*/
public class RemoveAhmed {

	public static void main(String[] args) {
	
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Ahmed");
//		names.add("John");
//		names.add("Eric");
//		names.add("Ahmed");
//		System.out.println(names);
		
		ArrayList<String> names = 
			new ArrayList<String>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
		System.out.println(names);
		
//		ArrayList<String> withoutAhmed = removeAhmed(names);
//		System.out.println(withoutAhmed);
		
		removeAhmed3(names);
		System.out.println(names);
	}
	
//	// List remove method
//	// => ConcurrentModificationException
//	// Iterator is the legit way to remove from a list.
//	public static ArrayList<String> removeAhmed(ArrayList<String> names){
//		
//		for(String each: names) {
//			if(each.equals("Ahmed"))
//				names.remove(each);
//		}
//		return names;
//	}
	
	// second List and add
	public static ArrayList<String> removeAhmed(ArrayList<String> names){
		
		ArrayList<String> names2 = new ArrayList<String>();
		
		for(String each: names) {
			if(!each.equals("Ahmed"))
				names2.add(each);
		}
		return names2;
	}
	
	// Iterator
	public static ArrayList<String> removeAhmed2(ArrayList<String> names){
		
		Iterator itr = names.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().equals("Ahmed"))
					itr.remove();
		}
		
		return names;
		
	}
	
	// List removeAll method
	public static ArrayList<String> removeAhmed3(ArrayList<String> names){
		
		names.removeAll(Arrays.asList("Ahmed"));
		return names;
	}

}
