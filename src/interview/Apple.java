package interview;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Apple {
	
	/**
	Map<String, Integer> map = new HashMap<>();
	map.put("a", 1);
	map.put("b", 2);
	map.put("c", 3);
	Print out name of the string which has got the maximum integer value
	*/
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		
		int maxValue = Integer.MIN_VALUE;
		
		for (Map.Entry<String,Integer> entry: map.entrySet()) {
			if(entry.getValue() > maxValue)
				maxValue = entry.getValue();
			
		}
            
		System.out.println(maxValue);		
		
	}

}
