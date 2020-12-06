package leetcode643;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		
		int k = 3;
		
		System.out.println("Num: " + Arrays.toString(nums) + " K: " + k);
		
		FindMaximumAverageOfK solution = new FindMaximumAverageOfK();
		
		System.out.println("Solution: " + solution.findMaxAverage(nums, k));
	}
}
