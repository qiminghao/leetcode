package algorithm;

import java.util.Arrays;

/**
 * 561. Array Partition I
 * 
 * Given an array of 2n integers, your task is to group these integers into n
 * pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of
 * min(ai, bi) for all i from 1 to n as large as possible.
 * 
 * Example 1: Input: [1,4,3,2] Output: 4 
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 * 
 * Note: 
 * n is a positive integer, which is in the range of [1, 10000]. 
 * All the integers in the array will be in the range of [-10000, 10000].
 * 
 * @author qiminghao
 *
 */
public class ArrayPartitionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPartitionI obj = new ArrayPartitionI();
		int[] nums = new int[] { 1, 4, 3, 2 };
		int res = obj.arrayPairSum(nums);
		System.out.println(res);
	}

	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int res = 0;
		for (int i = 0; i < nums.length; i += 2) {
			res += nums[i];
		}
		return res;
	}

}
