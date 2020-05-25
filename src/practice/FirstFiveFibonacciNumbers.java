package practice;

public class FirstFiveFibonacciNumbers {
	
	public static void main(String[] args) {
		
		fibonacci(10);
//		fibonacci2(10);
//		System.out.println();
//		System.out.println(fibonacci3(5));
		
		
		
	}
	
	//Without recursion
	public static void fibonacci(int n) {
		
		int num1 = 0;
		int num2 = 1;
		
		for (int i = 1; i <= n; i++) {
			
			System.out.print(num1+" ");
			int temp = num2;
			num2 = num2 + num1;
			num1 = temp;
			
		}
	}
	
	//Another solution without recursion
	public static void fibonacci2(int count) {
		
		int n1=0,n2=1,n3;    
		
		System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		for(int i=2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed    
		{    
		  n3 = n1 + n2;    
		  System.out.print(" " + n3);    
		  n1 = n2;    
		  n2 = n3;    
		}    
	}
	
	//With recursion
	public static int fibonacci3(int n) {
		  if (n == 1) return 1;
		  else if (n == 2) return 1;
		  else return fibonacci3(n-1) + fibonacci3(n-2);
	  }    
	
	

}
