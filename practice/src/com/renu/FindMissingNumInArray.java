package com.renu;

public class FindMissingNumInArray {

	public static void main(String[] args) {
		int arr[] = {1, 3, 7, 5, 6, 2};
		int n = arr.length;

		// Function call
		findMissing(arr, n);
	}

	public static void findMissing(int arr[], int size) {

		int temp[] = new int[size + 1];
		/*
		 * for (int i = 0; i <= size; i++) { temp[i] = 0; }
		 */

		for (int i = 0; i < size; i++) {
			temp[arr[i] - 1] = 1;
			
		}
		int ans = 0;
		for (int i = 0; i <= size; i++) {
			if (temp[i] == 0) {
				ans = i + 1;
			}
		}
		System.out.println(ans);

	}

}
