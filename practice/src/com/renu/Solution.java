package com.renu;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] input = { 1, 1, 2, 3, 5, 5 ,5,5,7, 9,9,9}; 
		
		int[] register = new int[input.length];
		
		for (int i : input) { 
			register[i] = 1;
			System.out.println();
			} 
		 
		System.out.println("missing numbers in given array"); 
		for (int i = 1; i < register.length; i++) { 
			if (register[i] == 0) {
				System.out.println(i);
				}
		}
		
		}

		
}
