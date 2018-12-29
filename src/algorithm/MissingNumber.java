package algorithm;

/**
 * 268. Missing Number
 * 
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
 * the one that is missing from the array.
 * 
 * Example 1: Input: [3,0,1] Output: 2
 * 
 * Example 2: Input: [9,6,4,2,3,5,7,0,1] Output: 8
 * 
 * @author qiminghao
 *
 */
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumber obj = new MissingNumber();
		int[] nums = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int res = obj.missingNumber(nums);
		System.out.println(res);
	}

	public int missingNumber(int[] nums) {
		int sum = 0, n = nums.length;
		for (int x : nums) {
			sum += x;
		}
		return n * (n + 1) / 2 - sum;
	}

}
