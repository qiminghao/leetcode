package algorithm;

import java.util.Arrays;

/**
 * 581. Shortest Unsorted Continuous Subarray
 * 
 * Given an integer array, you need to find one continuous subarray that if you
 * only sort this subarray in ascending order, then the whole array will be
 * sorted in ascending order, too. You need to find the shortest such subarray
 * and output its length.
 * 
 * Example 1: Input: [2, 6, 4, 8, 10, 9, 15] Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the
 * whole array sorted in ascending order.
 * 
 * Note:
 * 1. Then length of the input array is in range [1, 10,000].
 * 2. The input array may contain duplicates, so ascending order here means <=.
 * 
 * @author qiminghao
 *
 */
public class ShortestUnsortedContinuousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortestUnsortedContinuousSubarray obj = new ShortestUnsortedContinuousSubarray();
		int[] nums = new int[] { 1,2,3,4 };
		int res = obj.findUnsortedSubarray(nums);
		System.out.println(res);
	}

	public int findUnsortedSubarray(int[] nums) {
		int[] copy = nums.clone();
		Arrays.sort(copy);
		int begin = 0, end = nums.length - 1;
		for (; begin < nums.length && nums[begin] == copy[begin]; begin++);
		for (; end >= 0 && nums[end] == copy[end]; end--);
		return Math.max(0, end - begin + 1);
	}

}
