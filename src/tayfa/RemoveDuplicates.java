package tayfa;

import java.util.Arrays;
import java.util.LinkedHashSet;

/*
2. Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
*/
public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "AAABBBCCC";
		System.out.println(removeDup2(str));
	}
	
	// String manipulation (while or for loop)
	public static String removeDup(String str) {
		
		String result = "";
		
//		while(str.length() > 0) {
//			if(!result.contains(str.substring(0, 1))) {
//				result += str.subSequence(0, 1);
//				str = str.replaceAll(str.substring(0, 1), "");
//			}
//		}
		
		for(int i = 0; i < str.length() - 1; i++) {
			if(!result.contains(str.substring(i, i+1)))
				result += str.substring(i, i+1);
		}
		
		return result;
	}
	
	// LinkedHashSet
	public static String removeDup2(String str) {
		
		str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
		str = str.replace(", ", "").replace("[", "").replace("]", "");
		
		return str;
	}
		
}
