package com.renu.day10;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int [] arr = {2,4,3,6,8};
		int a =firstMissingPositive(arr);
		System.out.println(a);

	}
	public  static int firstMissingPositive(int[] nums) {
	    final int n = nums.length;

	    
	    for (int i = 0; i < n; ++i)
	      while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1])
	        swap(nums, i, nums[i] - 1);

	    for (int i = 0; i < n; ++i)
	      if (nums[i] != i + 1)
	        return i + 1;

	    return n + 1;
	  }

	  private static void swap(int[] nums, int i, int j) {
	    final int temp = nums[i];
	    nums[i] = nums[j];
	    nums[j] = temp;
	  }
}
