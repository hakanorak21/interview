package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnionBankUsingArrayList {

	public static void main(String[] args) {
		
		String[] applicants_ids = {"A", "B", "C", "D", "C", "E"};
		int[] credit_scores = {445, 435, 425, 475, 450, 500};
		String result = sortAndFilterCreditScores(applicants_ids, credit_scores);
		System.out.println(result);

	}
		
	public static String sortAndFilterCreditScores
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

