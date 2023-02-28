package practice;

import java.util.ArrayList;

/*Given an array, nums, of n integers, find all unique triplets (three numbers, a, b, & c) in nums such that a + b + c = 0. 
Note that there may not be any triplets that sum to zero in nums,
and that the triplets must not be duplicates.*/
public class FindTriplets {

	public static void main(String[] args) {
		int arr[]={-1,0,1,2,-1,-4};
        ArrayList < ArrayList < Integer >> ans;
        ans = threeSum(arr);
        System.out.println("The triplets are as follows: " +ans);
	}
	
	 static ArrayList < ArrayList < Integer >> threeSum(int nums[]) {
        ArrayList < ArrayList < Integer >> ans = new ArrayList < > ();

        int i, j, k;
        for (i = 0; i < nums.length - 2; i++) {
            for (j = i + 1; j < nums.length - 1; j++) {
                for (k = j + 1; k < nums.length; k++) {
                    ArrayList < Integer > temp = new ArrayList < > ();
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                    }
                    if (temp.size() != 0)
                        ans.add(temp);
                }
            }
        }

        return ans;
}
}
