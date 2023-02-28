package practice;

public class PrintEvenFibonacciNums {
	/*
	 * Each new term in the Fibonacci sequence is generated by adding the previous
	 * two terms. By starting with 1 and 2, the first 10 terms will be:
	 * 
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * 
	 * By considering the terms in the Fibonacci sequence whose values do not exceed
	 * N, find the sum of the even-valued terms
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; 
	    int b = 0;
	    int c =1;
	    int sum = 0;
//System.out.print(a+ " "+b);
	    for (int i =2; i < 20; i++) {
	    	// Finds fibonacci sequence
	        a = b;
	        b = c;
	        c = a + b;
System.out.print(" "+c);
	        if ( c % 2 == 0) { // Check if it's even
	        	if(c<100) {
	            sum =sum+ c;
	        	}
	        }
	    }
	    System.out.println();
	    System.out.println(sum);

	}

}