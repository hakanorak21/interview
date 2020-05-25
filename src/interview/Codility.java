package interview;

public class Codility {

	public static void main(String[] args) {
		
//		int N = 1000000000;
//		solution(N);
		
		String today = "Sun";
		int afterDays = 3;
		System.out.println(day(today, afterDays));
	}
	
	public static void solution(int N) {
		
		int enable_print = N % 10;
		
		while (N > 0) {
			if (enable_print == 0 && N % 100 != 0) {
				enable_print = 1;
			}
			else if (enable_print >= 1) {
				System.out.print(N % 10);
			}
			N = N / 10;
		}
    }
	
	public static String day(String S, int K) {
		
		int currentDay = 	S.equals("Mon")? 1: S.equals("Tue")? 2:
							S.equals("Wed")? 3: S.equals("Thu")? 4:
							S.equals("Fri")? 5: S.equals("Sat")? 6:
							S.equals("Sun")? 7: 0;
		
		int futureDay = (currentDay + K) % 7;
		
		return (futureDay == 1)? "Mon": (futureDay == 2)? "Tue":
				(futureDay == 3)? "Wed": (futureDay == 4)? "Thu":
				(futureDay == 5)? "Fri": (futureDay == 6)? "Sat": "Sun";
	}
}
