package tayfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
		
		// or
		ArrayList<String> names = 
			new ArrayList<String>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
		System.out.println(names);
		
//		removeAhmed(names);
//		System.out.println(names);
		
		ArrayList<String> names2 = removeAhmed3(names);
		System.out.println(names2);

	}
	
	// remove
	public static ArrayList<String> removeAhmed(ArrayList<String> names){
	
		for(String each: names) {
			if(each.equals("Ahmed"))
				names.remove("Ahmed");
		}
		return names;
	}
	
	// second ArrayList
	public static ArrayList<String> removeAhmed2(ArrayList<String> names){
		
		ArrayList<String> names2 = new ArrayList<>();
		
		for(String each: names) {
			if(!each.equals("Ahmed"))
				names2.add(each);		
		}
		
		return names2;
	}
	
	
	// Iterator
	public static ArrayList<String> removeAhmed3(ArrayList<String> names){
	
		Iterator itr = names.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().equals("Ahmed"))
				itr.remove();
		}
		
		return names;
	}
	
	// List removeAll method
	public static ArrayList<String> removeAhmed4(ArrayList<String> names){
		
		names.removeAll(Arrays.asList("Ahmed"));
		
		return names;
	}

}
