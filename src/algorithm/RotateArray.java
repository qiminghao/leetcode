package algorithm;

/**
 * 189. Rotate Array
 * 
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * 
 * Example 1: Input: [1,2,3,4,5,6,7] and k = 3 Output: [5,6,7,1,2,3,4]
 * Explanation: rotate 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to
 * the right: [6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * Example 2: Input: [-1,-100,3,99] and k = 2 Output: [3,99,-1,-100]
 * Explanation: rotate 1 steps to the right: [99,-1,-100,3] rotate 2 steps to
 * the right: [3,99,-1,-100]
 * 
 * Note: 1. Try to come up as many solutions as you can, there are at least 3
 * different ways to solve this problem. 2. Could you do it in-place with O(1)
 * extra space?
 * 
 * @author qiminghao
 *
 */
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray obj = new RotateArray();
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		obj.rotate(nums, k);
		for (int x : nums) {
			System.out.print(x + " ");
		}
	}

	public void rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length);
		reverse(nums, 0, k);
		reverse(nums, k, nums.length);
	}

	// reverse array [begin, end)
	public void reverse(int[] nums, int begin, int end) {
		for (int i = 0; i < (end - begin) / 2; i++) {
			int tmp = nums[begin + i];
			nums[begin + i] = nums[end - i - 1];
			nums[end - i - 1] = tmp;
		}
	}

}
