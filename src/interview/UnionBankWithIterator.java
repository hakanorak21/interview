package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnionBankWithIterator {

	public static void main(String[] args) {
		
		String[] applicants_ids = {"A", "B", "C", "D", "C", "E"};
		int[] credit_scores = {445, 435, 425, 475, 450, 500};
		
		String result = sortAndFilterCreditScores(applicants_ids, credit_scores);
		System.out.println(result);

	}
	
	public static String sortAndFilterCreditScores
	(String[] applicant_ids, int[] credit_scores) 
	{
	    
		// Creating Maps for data storage
		Map<String, Integer> applicants = new Hashtable<>();
		Map<String, Integer> unsortedMap = new Hashtable<>();

		// Identifying and removing duplicates from applicants Map
		for(int i=0; i<applicant_ids.length; i++){
			applicants.put(applicant_ids[i], applicants.getOrDefault(applicant_ids[i], 0) + 1);
			unsortedMap.put(applicant_ids[i], credit_scores[i]);
		} 
	
		// Updating values of applicants Map with corresponding credit scores
		// Using Iterator to avoid ConcurrentModificationException
		Iterator<Map.Entry<String, Integer>> itr = applicants.entrySet().iterator(); 
		while(itr.hasNext()){
			Map.Entry<String, Integer> entry = itr.next(); 
			if(entry.getValue() > 1){
				itr.remove();
			}else{
				applicants.put(entry.getKey(), unsortedMap.get(entry.getKey()));
			}
		}
		
		// Sorting the Map by values in ascending order
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		applicants.entrySet()
					.stream()
					.sorted(Map.Entry.comparingByValue())
					.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		
		// Getting the keySet and then concating to get desired output
		Set<String> keySet = sortedMap.keySet();
		String output = "";
		for(String each: keySet) {
			output += each;
		}

		return output;

	}
	
}

