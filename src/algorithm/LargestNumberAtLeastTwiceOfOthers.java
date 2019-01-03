package algorithm;

/**
 * 747. Largest Number At Least Twice of Others
 * 
 * In a given integer array nums, there is always exactly one largest element.
 * Find whether the largest element in the array is at least twice as much as
 * every other number in the array. If it is, return the index of the largest
 * element, otherwise return -1.
 * 
 * Example 1: Input: nums = [3, 6, 1, 0] Output: 1
 * Example 2: Input: nums = [1, 2, 3, 4] Output: -1
 * 
 * Note:
 * 1. nums will have a length in the range [1, 50].
 * 2. Every nums[i] will be an integer in the range [0, 99].
 * 
 * @author qiminghao
 *
 */
public class LargestNumberAtLeastTwiceOfOthers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNumberAtLeastTwiceOfOthers obj = new LargestNumberAtLeastTwiceOfOthers();
		int[] nums = new int[] { 3, 6, 1, 0 };
		int res = obj.dominantIndex(nums);
		System.out.println(res);
		nums = new int[] { 1, 2, 3, 4 };
		res = obj.dominantIndex(nums);
		System.out.println(res);
		nums = new int[] { 1 };
		res = obj.dominantIndex(nums);
		System.out.println(res);
	}

	public int dominantIndex(int[] nums) {
		int max1 = -1, max2 = -1, index1 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max1) {
				max2 = max1;
				max1 = nums[i];
				index1 = i;
			} else if (nums[i] > max2) {
				max2 = nums[i];
			}
		}
		return max1 >= 2 * max2 ? index1 : -1;
	}

}
