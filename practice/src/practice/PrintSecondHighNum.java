package practice;

public class PrintSecondHighNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]intergerArrary = {2,3,4,56,78,90,23,78,89};
		int secondHighestNum =printSecondhighNum(intergerArrary);
		System.out.println("second highest number :"+secondHighestNum);

	}
public static int printSecondhighNum(int[]nums) {
	int highestNum=0;
	int secondHighestNum=0;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]>highestNum) {
			secondHighestNum = highestNum;
			highestNum=nums[i];
		}
		else if(nums[i] > secondHighestNum && nums[i]  != highestNum) {
			secondHighestNum= nums[i];
		}
	}
	return secondHighestNum;
}
}
