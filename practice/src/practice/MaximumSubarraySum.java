package practice;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 3, 8, -2, 6, -8, 5};
		int sum =16;
        System.out.println(maxSubarraySum(a,sum));
	}
public static int maxSubarraySum(int[]arr,int sum) {
	int n = arr.length;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i <= n - 1; i++) {
        int currSum = 0;
        for (int j = i; j <= n - 1; j++) {
        currSum += arr[j];
        if (currSum > maxSum) {
            maxSum = currSum;
        }
        }
    }

    return maxSum;	
			
}
}
