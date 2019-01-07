package algorithm;


/**
 * 53. Maximum Subarray
 * 
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example: Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * Follow up: If you have figured out the O(n) solution, try coding another
 * solution using the divide and conquer approach, which is more subtle.
 * 
 * @author qiminghao
 *
 */
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSubarray obj = new MaximumSubarray();
		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int res = obj.maxSubArray(nums);
		System.out.println(res);
	}
	
	public int maxSubArray(int[] nums) {
		int[] d = new int[nums.length];
		d[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			d[i] = Math.max(nums[i], nums[i] + d[i - 1]);
		}
		int res = d[0];
		for (int x : d) {
			res = Math.max(res, x);
		}
		return res;
    }

}
