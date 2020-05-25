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
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnionBankTask2UsingArrayList {

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

