package algorithm;

/**
 * 724. Find Pivot Index
 * 
 * Given an array of integers nums, write a method that returns the "pivot"
 * index of this array. We define the pivot index as the index where the sum of
 * the numbers to the left of the index is equal to the sum of the numbers to
 * the right of the index. If no such index exists, we should return -1. If
 * there are multiple pivot indexes, you should return the left-most pivot
 * index.
 * 
 * Example 1: Input: nums = [1, 7, 3, 6, 5, 6] Output: 3
 * Example 2: Input: nums = [1, 2, 3] Output: -1
 * 
 * @author qiminghao
 *
 */
public class FindPivotIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPivotIndex obj = new FindPivotIndex();
		int[] nums = new int[] { 1, 7, 3, 6, 5, 6 };
		int res = obj.pivotIndex(nums);
		System.out.println(res);
		nums = new int[] { 1, 2, 3 };
		res = obj.pivotIndex(nums);
		System.out.println(res);
	}

	public int pivotIndex(int[] nums) {
		int sum = 0, left = 0;
		for (int x : nums) {
			sum += x;
		}
		for (int i = 0; i < nums.length; i++) {
			if (left == sum - left - nums[i]) {
				return i;
			}
			left += nums[i];
		}
		return -1;
	}

}
