package com.renu.day14;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int [] arr = {9, 9, 8};   
		 
		int[]ans=plusOne(arr);   
		
		System.out.println(Arrays.toString(ans));  

	}
	public static int[] plusOne(int[] nums)   
	{
	int n = nums.length;  
	for(int i=n-1; i>=0; i--)   
	{  
	if(nums[i] < 9)   
	{  
	nums[i]++;   
	return nums;  
	}  
	nums[i] = 0;  
	}  
	int[] newNumber = new int [n+1];  
	newNumber[0] = 1;  
	return newNumber;  
	}  
}
