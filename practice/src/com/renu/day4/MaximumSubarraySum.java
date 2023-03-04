package com.renu.day4;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4 };	
		int maxSubarraySum =maxSubarraySum(arr);
		System.out.println("Maximum Subarray Sum :"+maxSubarraySum);
	}
public static int maxSubarraySum(int[]arr) {
	int ans = Integer.MIN_VALUE;
	int sum =0;
	for(int num:arr) {
		sum =Math.max(num, sum+num);
		 ans = Math.max(ans, sum);
	}
	 return ans;
}
}
