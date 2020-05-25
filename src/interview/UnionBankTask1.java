package interview;
/*
Task 1: censorFromBlacklistAndReplace
You are writing a program to censor and replace certain words for an
organization. Given a string (the "sample text"), an array of strings (the
"blacklist"), and a string (the "replacement text"), return an edited version of
the sample text.

Replace every substring in the sample text that matches any string in the
blacklist with the replacement text.

For instance, given:
sample_text = "Today the S&P 500 had its best performance in ten years"
blacklist = ["had", "ten years"]
replacement = "__"

Return:
"Today the S&P 500 __ its best performance in __"	
*/	
public class UnionBankTask1 {
	
	public static void main(String[] args) {

		String sample_text = "Today the S&P 500 had its best performance in ten years";
		String[] blacklist = {"had", "ten years"};
		String replacement = "__";
		String result =
			censorFromBlacklistAndReplace(sample_text, blacklist, replacement); 
		System.out.println(result);

	}
	
	static String censorFromBlacklistAndReplace(String sample_text, 
							String[] blacklist, String replacement) 
	{
		for(String each: blacklist) {
			sample_text = sample_text.replaceAll(each, replacement);
		}
		return sample_text;
	}

}
