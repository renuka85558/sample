package com.renu.day4;

public class GetMaxxProfit {

	public static void main(String[] args) {
		int[] arr= {2,4,5,6,9};
		int profit = maxProfit(arr);
		System.out.println("maximum  profit :"+profit);

	}
	public static int maxProfit(int[] prices) {
	    int sellOne = 0;
	    int holdOne = Integer.MIN_VALUE;

	    for (final int price : prices) {
	      sellOne = Math.max(sellOne, holdOne + price);
	      holdOne = Math.max(holdOne, -price);
	    }

	    return sellOne;
	  }
}
