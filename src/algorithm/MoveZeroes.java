package algorithm;

/**
 * 283. Move Zeroes
 * 
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * Example: Input: [0,1,0,3,12] Output: [1,3,12,0,0]
 * 
 * Note:
 * 1. You must do this in-place without making a copy of the array.
 * 2. Minimize the total number of operations.
 * 
 * @author qiminghao
 *
 */
public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeroes obj = new MoveZeroes();
		int[] nums = new int[] { 0, 1, 0, 3, 12 };
		obj.moveZeroes(nums);
		for (int x : nums) {
			System.out.print(x + " ");
		}
	}
	
	public void moveZeroes(int[] nums) {
		int cur = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[cur++] = nums[i];
			}
		}
		while (cur < nums.length) {
			nums[cur++] = 0;
		}
	}

}
