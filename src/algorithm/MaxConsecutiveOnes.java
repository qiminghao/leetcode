package algorithm;

/**
 * 485. Max Consecutive Ones
 * 
 * Given a binary array, find the maximum number of consecutive 1s in this
 * array.
 * 
 * Example 1: Input: [1,1,0,1,1,1] Output: 3 
 * Explanation: The first two digits or the last three digits are consecutive 1s. 
 * The maximum number of consecutive 1s is 3.
 * 
 * Note: 
 * The input array will only contain 0 and 1. 
 * The length of input array is a positive integer and will not exceed 10,000
 * 
 * @author qiminghao
 *
 */
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
		int[] nums = new int[] { 1, 1, 0, 1, 1, 1 };
		int res = obj.findMaxConsecutiveOnes(nums);
		System.out.println(res);
	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int res = 0, start = 0, end = 0;
		while (start < nums.length) {
			for (; start < nums.length && nums[start] != 1; start++);
			for (end = start; end < nums.length && nums[end] == 1; end++);
			res = Math.max(res, end - start);
			start = end;
		}
		return res;
	}

}
