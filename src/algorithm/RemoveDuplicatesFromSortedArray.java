package algorithm;

/**
 * 26. Remove Duplicates from Sorted Array
 * 
 * Given a sorted array nums, remove the duplicates in-place such that each
 * element appear only once and return the new length. Do not allocate extra
 * space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 * 
 * Example 1: Given nums = [1,1,2],
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 1 and 2 respectively.
 * 
 * It doesn't matter what you leave beyond the returned length.
 * 
 * Example 2: Given nums = [0,0,1,1,1,2,2,3,3,4],
 * 
 * Your function should return length = 5, with the first five elements of nums
 * being modified to 0, 1, 2, 3, and 4 respectively.
 * 
 * It doesn't matter what values are set beyond the returned length.
 * 
 * @author qiminghao
 *
 */
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
		int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
		int res = obj.removeDuplicates(nums);
		for (int i = 0; i < res; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public int removeDuplicates(int[] nums) {
		int cur = 1, res = 1;
		while (cur < nums.length) {
			for (; cur < nums.length && nums[cur] == nums[cur - 1]; cur++);
			if (cur < nums.length) {
				nums[res++] = nums[cur++];
			}
		}
		return res;
	}

}
