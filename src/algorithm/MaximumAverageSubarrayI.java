package algorithm;

/**
 * 643. Maximum Average Subarray I
 * 
 * Given an array consisting of n integers, find the contiguous subarray of
 * given length k that has the maximum average value. And you need to output the
 * maximum average value.
 * 
 * Example 1: Input: [1,12,-5,-6,50,3], k = 4 Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 * 
 * Note:
 * 1. 1 <= k <= n <= 30,000.
 * 2. Elements of the given array will be in the range [-10,000, 10,000].
 * 
 * @author qiminghao
 *
 */
public class MaximumAverageSubarrayI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumAverageSubarrayI obj = new MaximumAverageSubarrayI();
		int[] nums = new int[] { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		double res = obj.findMaxAverage(nums, k);
		System.out.println(res);
		nums = new int[] { 4, 2, 1, 3, 3 };
		k = 2;
		res = obj.findMaxAverage(nums, k);
		System.out.println(res);
	}

	public double findMaxAverage(int[] nums, int k) {
		int sum = 0, i = 0;
		for (; i < k; i++) {
			sum += nums[i];
		}
		int maxSum = sum;
		for (; i < nums.length; i++) {
			sum = sum + nums[i] - nums[i - k];
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum * 1.0 / k;
	}

}
