package com.renu.day2;

public class FindTupleGivenTarget {

	public static void main(String[] args) {
		int[] arr = {1,3,4,6,8,9};
		int n =arr.length;
		int target=9;
		for(int i =0;i<n-1;i++) {
			for(int j =0;j<n;j++) {
				if(arr[i]+arr[j]==target) {
					 System.out.printf("Pair found (%d, %d) ", arr[i] ,arr[j]);
				}
			}
		}
		
	}

}
