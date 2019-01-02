package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 219. Contains Duplicate II
 * 
 * Given an array of integers and an integer k, find out whether there are two
 * distinct indices i and j in the array such that nums[i] = nums[j] and the
 * absolute difference between i and j is at most k.
 * 
 * Example 1: Input: nums = [1,2,3,1], k = 3 Output: true
 * Example 2: Input: nums = [1,0,1,1], k = 1 Output: true
 * Example 3: Input: nums = [1,2,3,1,2,3], k = 2 Output: false
 * 
 * @author qiminghao
 *
 */
public class ContainsDuplicateII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsDuplicateII obj = new ContainsDuplicateII();
		int[] nums = new int[] { 1, 2, 3, 1 };
		int k = 3;
		boolean res = obj.containsNearbyDuplicate(nums, k);
		System.out.println(res);
		nums = new int[] { 1, 0, 1, 1 };
		k = 1;
		res = obj.containsNearbyDuplicate(nums, k);
		System.out.println(res);
		nums = new int[] { 1, 2, 3, 1, 2, 3 };
		k = 2;
		res = obj.containsNearbyDuplicate(nums, k);
		System.out.println(res);
	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (k < 1) return false;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < k && i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			} else {
				set.add(nums[i]);
			}
		}
		for (int i = 0; i < nums.length - k; i++) {
			set.remove(nums[i]);
			if (set.contains(nums[i + k])) {
				return true;
			} else {
				set.add(nums[i + k]);
			}
			if (set.contains(nums[i])) {
				return true;
			}
		}
		return false;
	}

}
