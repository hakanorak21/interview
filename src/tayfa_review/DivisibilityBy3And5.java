package tayfa_review;
/*
15. Write a method which prints out the numbers from 1 to 30 but
for numbers which are a multiple of 3, print "FIN" instead of the
number and for numbers which are a multiple of 5, print "RA" instead
of the number. for numbers which are a multiple of both 3 and 5, print
"FINRA" instead of the number.
*/
public class DivisibilityBy3And5 {

	public static void main(String[] args) {
		
		for(int num=1; num <= 30; num++) {
			
			if(num%3 == 0 || num%5 == 0) {
				
				if(num%3 == 0)
					System.out.print("FIN");
				
				if(num%5 == 0)
					System.out.print("RA");
				System.out.println();
				
			}else {
				System.out.println(num);
			}
			
		}

	}

}
