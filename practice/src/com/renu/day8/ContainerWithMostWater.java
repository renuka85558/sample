package com.renu.day8;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] arr= {1,8,6,2,5,4,8,3,7};
		int maxAreaWithwater = maxArea(arr);
		System.out.println(maxAreaWithwater);

	}
	public static  int maxArea(int[] height) {
	    int ans = 0;
	    int l = 0;
	    int r = height.length - 1;

	    while (l < r) {
	      final int minHeight = Math.min(height[l], height[r]);
	      ans = Math.max(ans, minHeight * (r - l));
	      if (height[l] < height[r])
	        ++l;
	      else
	        --r;
	    }

	    return ans;
	  }
}
