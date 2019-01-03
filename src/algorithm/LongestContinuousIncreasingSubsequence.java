package algorithm;

/**
 * 674. Longest Continuous Increasing Subsequence
 * 
 * Given an unsorted array of integers, find the length of longest continuous
 * increasing subsequence (subarray).
 * 
 * Example 1: Input: [1,3,5,4,7] Output: 3
 * 
 * Example 2: Input: [2,2,2,2,2] Output: 1
 * 
 * Note: Length of the array will not exceed 10,000.
 * 
 * @author qiminghao
 *
 */
public class LongestContinuousIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestContinuousIncreasingSubsequence obj = new LongestContinuousIncreasingSubsequence();
		int[] nums = new int[] { 1, 3, 5, 4, 7 };
		int res = obj.findLengthOfLCIS(nums);
		System.out.println(res);
		nums = new int[] { 2, 2, 2, 2, 2 };
		res = obj.findLengthOfLCIS(nums);
		System.out.println(res);
	}

	public int findLengthOfLCIS(int[] nums) {
		if (nums.length == 0) return 0;
		int res = 1, cur = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] >= nums[i]) {
				cur = 1;
			}else {
				cur++;
			}
			res = Math.max(res, cur);
		}
		return res;
	}

}
