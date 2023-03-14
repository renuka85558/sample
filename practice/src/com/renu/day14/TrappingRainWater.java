package com.renu.day14;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] arr = {1,5,0,8,9,6};
		int water = trapRainwater(arr);
		System.out.println("trapping rain water :" +water);
	}
	public static int trapRainwater(int[]arr) {
		int n =arr.length;
		int[] left = new int[n];
		int[] rightSide = new int[n];
		int waterTraped =0;
		left[0]= arr[0];
		for(int i=1;i<n;i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		rightSide[n-1]=arr[n-1];
		for(int j =n-2;j>0;j--) {
			rightSide[j]=Math.max(rightSide[j+1], arr[j]);
			
		}
		for(int i =0;i <n;i++) {
			waterTraped += Math.min(left[i],rightSide[i])-arr[i];	
		}
		return waterTraped;
	}

}
