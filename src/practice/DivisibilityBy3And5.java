package practice;

public class DivisibilityBy3And5 {
	
	/**
	Write a method which prints out the numbers from 1 to 30 but
	for numbers which are a multiple of 3, print "FIN" instead of the number 
	and for numbers which are a multiple of 5, print "RA" instead of the number. 
	for numbers which are a multiple of both 3 and 5, 
	print "FINRA" instead of the number.
	*/
	
	public static void main(String[] args) {
		isDivisibleBy3And5();
	}
	
	public static void isDivisibleBy3And5() {
		
		int number = 30;
		
		for(int i = 1; i <= number; i++) {
			
			if(i%3 == 0 || i%5 == 0) {
				if(i%3 == 0)
					System.out.print("FIN");
				if(i%5 == 0)
					System.out.print("RA");
				System.out.println();
			}else {
				System.out.println(i);
			}
			
		}
	}
}
