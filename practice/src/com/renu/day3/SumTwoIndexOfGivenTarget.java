package com.renu.day3;

import java.util.HashMap;
import java.util.Map;

public class SumTwoIndexOfGivenTarget {

	public static void main(String[] args) {
		int[] arr = {1,3,24,5,8,9,6};
		
		int target =6;
		int[] result =twoSum(arr,target);
		System.out.println(result);

	}
	 public static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        int[] ans = new int[2];
	        for (int i = 0; i < nums.length; i++) {
	            if (map.containsKey(target - nums[i])) {
	                ans[0] = map.get(target - nums[i]);
	                ans[1] = i;
	                return ans;
	            }
	            map.put(nums[i], i);
	        }
	        return ans;
		  }
}
