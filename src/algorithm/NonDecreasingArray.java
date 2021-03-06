package algorithm;

/**
 * 665. Non-decreasing Array
 * 
 * Given an array with n integers, your task is to check if it could become
 * non-decreasing by modifying at most 1 element. We define an array is
 * non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 * 
 * Example 1: Input: [4,2,3] Output: True Explanation: You could modify the
 * first 4 to 1 to get a non-decreasing array.
 * 
 * Example 2: Input: [4,2,1] Output: False Explanation: You can't get a
 * non-decreasing array by modify at most one element.
 * 
 * Note: The n belongs to [1, 10,000].
 * 
 * @author qiminghao
 *
 */
public class NonDecreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonDecreasingArray obj = new NonDecreasingArray();
		int[] nums = new int[] { 4, 2, 3 };
		boolean res = obj.checkPossibility(nums);
		System.out.println(res);
		nums = new int[] { 4, 2, 1 };
		res = obj.checkPossibility(nums);
		System.out.println(res);
	}

	public boolean checkPossibility(int[] nums) {
		int i = 1;
		for (; i < nums.length && nums[i] >= nums[i - 1]; i++);
		if (i >= nums.length - 1) {
			return true;
		} else if (i == 1 || nums[i] >= nums[i - 2]) {
			i = i + 1;
		} else if (nums[i + 1] >= nums[i - 1]) {
			i = i + 2;
		}
		for (; i < nums.length && nums[i] >= nums[i - 1]; i++);
		return i >= nums.length;
	}

}
