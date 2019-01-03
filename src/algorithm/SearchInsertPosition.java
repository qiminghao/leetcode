package algorithm;

/**
 * 35. Search Insert Position
 * 
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order. You may assume no duplicates in the array.
 * 
 * Example 1: Input: [1,3,5,6], 5 Output: 2
 * Example 2: Input: [1,3,5,6], 2 Output: 1
 * Example 3: Input: [1,3,5,6], 7 Output: 4
 * Example 4: Input: [1,3,5,6], 0 Output: 0
 * 
 * @author qiminghao
 *
 */
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInsertPosition obj = new SearchInsertPosition();
		int[] nums = new int[] { 1, 3, 5, 6 };
		int target = 5;
		int res = obj.searchInsert(nums, target);
		System.out.println(res);
		nums = new int[] { 1, 3, 5, 6 };
		target = 2;
		res = obj.searchInsert(nums, target);
		System.out.println(res);
		nums = new int[] { 1, 3, 5, 6 };
		target = 7;
		res = obj.searchInsert(nums, target);
		System.out.println(res);
		nums = new int[] { 1, 3, 5, 6 };
		target = 0;
		res = obj.searchInsert(nums, target);
		System.out.println(res);
	}

	public int searchInsert(int[] nums, int target) {
		int left = 0, right = nums.length, mid;
		while (left < right) {
			mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

}
