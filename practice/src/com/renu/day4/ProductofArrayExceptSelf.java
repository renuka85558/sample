package com.renu.day4;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		ProductofArrayExceptSelf pa = new ProductofArrayExceptSelf();
		int arr[] = { 1, 2, 3, 4 };
		int n = arr.length;
		System.out.println("The product array is : ");
		pa.productArray(arr, n);

	}

	void productArray(int arr[], int n) {

		// Base case
		if (n == 1) {
			System.out.print("0");
			return;
		}

		int i, temp = 1;

		int prod[] = new int[n];

		for (int j = 0; j < n; j++)
			prod[j] = 1;

		for (i = 0; i < n; i++) {
			prod[i] = temp;
			temp *= arr[i];
		}

		temp = 1;

		for (i = n - 1; i >= 0; i--) {
			prod[i] *= temp;
			temp *= arr[i];
		}

		for (i = 0; i < n; i++)
			System.out.print(prod[i] + " ");

		return;
	}
}
