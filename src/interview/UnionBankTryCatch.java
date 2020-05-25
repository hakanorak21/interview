package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnionBankTryCatch {

	public static void main(String[] args) {
		
		String[] applicants_ids = {"A", "B", "C", "D", "C", "E"};
		int[] credit_scores = {445, 435, 425, 475, 450, 500};
//		String result = sortAndFilterCreditScoresUsingArrays(applicants_ids, credit_scores);
//		System.out.println(result);
		
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
		// ConcurrentModificationException
		try {
			for(Map.Entry<String, Integer> each: applicants.entrySet()){
				if(each.getValue() > 1){
					applicants.remove(each.getKey());
				}else{
					applicants.put(each.getKey(), unsortedMap.get(each.getKey()));
				}
			}
		}catch(ConcurrentModificationException ex) {
			System.out.println("ConcurrentModificationException is occured");
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
	
	public static String sortAndFilterCreditScoresUsingArrays
	(String[] applicant_ids, int[] credit_scores) 
	{
		
		// Removing duplicates from applicant_ids
		List<String> ids = new ArrayList<String>();
		List<Integer> scores = new ArrayList<Integer>();
		
		for(int i=0; i < applicant_ids.length; i++) {
			
			if(ids.contains(applicant_ids[i])){
				int index = ids.indexOf(applicant_ids[i]);
				ids.remove(applicant_ids[i]);
				scores.remove(index);
			}else {
				ids.add(applicant_ids[i]);
				scores.add(credit_scores[i]);
			}
			
		}
		System.out.println(ids);
		System.out.println(scores);
		System.out.println("========================");
		
		//Creating one list with scores and ids
		List<String> scoresAndIds = new ArrayList<String>();
		for(int i=0; i < scores.size(); i++) {
			scoresAndIds.add(""+scores.get(i)+ids.get(i));
		}
		System.out.println(scoresAndIds);
		
		//Now, let's sort the list
		Collections.sort(scoresAndIds);
		System.out.println(scoresAndIds);
		
		//Remove the scores and concate id's as String
		String result = "";
		for(String each: scoresAndIds) {
			result += each.substring(3);
		}
		
		return result;
	}

}

