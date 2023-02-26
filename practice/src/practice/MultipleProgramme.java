package practice;

import java.util.Scanner;

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.*/
public class MultipleProgramme {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int T = scanner.nextInt();
	    int n;
	    for (int i = 0; i < T; i++) {
	        n = scanner.nextInt();
	        System.out.println(getSumMult(n - 1));

	    }

	}
	 public static int getSumMult(int n){
	        int res;
	        int q3 = n/3;
	        int q5 = n/5;
	        int q15 = n/15;
	        int s3 = (3*q3*(q3+1))/2;
	        int s5 = (5*q5*(q5+1))/2;
	        int s15 = (15*q15*(q15+1))/2;
	        return s3+s5-s15;
	    }
}
