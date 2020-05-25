package code_review;
/*
Task 2: sortAndFilterCreditScores
You are given two arrays as input into a function. One of the arrays is a list of
applicant identifiers in string format. The other is a list of integers
representing credit scores. The length of the two arrays will always be equal.

Each credit score is attributable to one applicant identifier. The items in the
two arrays correspond to each other based on their index.

For instance, the first item in the "credit scores" array corresponds to the first
item in the "applicant ids" array. The second item in the "credit scores" array
corresponds to the second item in the "applicant ids" array, and so forth.

Write a function that will return a string with applicant identifiers
concatenated together without spaces. You must also implement the following
requirements:
1. Any applicant identifiers that have appeared more than once do not
appear in the returned string at all
2. Applicant identifiers are to be sorted by their credit score in ascending
order

You can assume that applicant identifiers are NOT unique in the applicant
identifier array, but that all credit scores are unique in the credit score array.

For example, given the following input:
applicant_ids = ["A", "B", "C", "D", "C", "E"]
credit_scores = [445, 435, 425, 475, 450, 500]

Return the following:
"BADE"
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UnionBankTask2 {
	
	public static void main(String[] args) {
		
		String[] applicant_ids = {"A", "B", "C", "D", "C", "E"};
		int[] credit_scores = {445, 435, 425, 475, 450, 500};
		String result = sortAndFilterCreditScores(applicant_ids, credit_scores);
		System.out.println(result);
		
	}
	
	static String sortAndFilterCreditScores(String[] applicant_ids, int[] credit_scores) {
		
		/*
		 * Algorithm:
		 * Create applicants MAP to store ids and scores.
		 * Remove duplicates and add them to unsortedMap.
		 * Update applicants MAP with credit scores.
		 * Sort the applicants MAP according to the scores
		 * and copy it to sortedMap.
		 * Print out ids from sortedMap as a String.  
		 */
		
		//Create applicants MAP to store ids and scores.
		Map<String, Integer> applicants = new LinkedHashMap<>();
		Map<String, Integer> unsortedMap = new LinkedHashMap<>();
		
//		//For try-catch block solution
//		Map<String, Integer> applicants = new Hashtable<>();
//		Map<String, Integer> unsortedMap = new Hashtable<>();
		
		//Identifying duplicates in applicant_ids
		for(int i=0; i<applicant_ids.length; i++) {
			
			//applicants: ID and Count (to see duplicates)
			applicants.put(applicant_ids[i], applicants.getOrDefault(applicant_ids[i], 0) + 1);
			////{A=1, B=1, C=2, D=1, E=1}
			
			//unsortedMap: ids and scores as Map
			unsortedMap.put(applicant_ids[i], credit_scores[i]);
			//{A=445, B=435, C=450, D=475, E=500}
		}
		System.out.println(applicants);
		System.out.println(unsortedMap);
		
		// Updating values of applicants Map with corresponding credit scores
		// Original code gives ConcurrentModificationException				
		for(Map.Entry<String, Integer> each: applicants.entrySet()){
			if(each.getValue() > 1){
				applicants.remove(each.getKey());
			}else{
				applicants.put(each.getKey(), unsortedMap.get(each.getKey()));
			}
		}
		
//		// Using try-catch blocks to avoid ConcurrentModificationException
//		// Different result due to LinkedHashMap (worked with Hashtable)
//		try {
//			for(Map.Entry<String, Integer> each: applicants.entrySet()){
//				if(each.getValue() > 1){
//					applicants.remove(each.getKey());
//				}else{
//					applicants.put(each.getKey(), unsortedMap.get(each.getKey()));
//				}
//			}
//		}catch(ConcurrentModificationException ex) {
//			System.out.println("ConcurrentModificationException is occured");
//		}

				
//		// Using arrays to avoid ConcurrentModificationException
//		Object[] keys = applicants.keySet().toArray();
//		System.out.println(Arrays.toString(keys));
//		
//		for(int i=0; i < keys.length; i++){
//			if(applicants.get(keys[i]) > 1){
//				applicants.remove(keys[i]);
//			}else{
//				applicants.put((String)keys[i], unsortedMap.get(keys[i]));
//			}
//		}
		
//		// Using Iterator to avoid ConcurrentModificationException
//		Iterator<Map.Entry<String, Integer>> itr = applicants.entrySet().iterator(); 
//		while(itr.hasNext()){
//			Map.Entry<String, Integer> entry = itr.next(); 
//			if(entry.getValue() > 1){
//				itr.remove();
//			}else{
//				applicants.put(entry.getKey(), unsortedMap.get(entry.getKey()));
//			}
//		}
		
		System.out.println(applicants);
		
		// Sorting the Map by values in ascending order
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		applicants.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByValue())
			.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		System.out.println(sortedMap);
		
		// Getting the keySet and then concating to get desired output
		Set<String> keySet = sortedMap.keySet();
		String output = "";
		for(String each: keySet) {
			output += each;
		}

		return output;
	}

}
