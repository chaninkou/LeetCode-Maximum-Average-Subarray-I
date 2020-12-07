package leetcode643;

public class FindMaximumAverageOfK {
	// O(n) time.
    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        
        for (int i = 0; i < k; i++){
            sum += nums[i];
        } 
        
        long curerntMax = sum;
        
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            curerntMax = Math.max(curerntMax, sum);
        }
        
        return curerntMax / 1.0 / k;
    }
}
