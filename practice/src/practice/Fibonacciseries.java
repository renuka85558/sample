package practice;

public class Fibonacciseries {

	public static void main(String[] args) {
		
		int n1=0; int n2=1; int n3; int num=10;
		System.out.print("Fibonacci Series till " + num + " terms: ");
		System.out.print(n1+" "+n2);
		for(int i=0;i<=num; i++) {
			n3 =n1+n2;
			System.out.print(" "  +n3 );
			n1 =n2;
			n2=n3;
		}
		

	}

}
