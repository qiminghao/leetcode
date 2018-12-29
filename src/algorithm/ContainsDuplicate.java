package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * 
 * Given an array of integers, find if the array contains any duplicates.
 * 
 * Your function should return true if any value appears at least twice in the
 * array, and it should return false if every element is distinct.
 * 
 * Example 1: Input: [1,2,3,1] Output: true
 * 
 * Example 2: Input: [1,2,3,4] Output: false
 * 
 * Example 3: Input: [1,1,1,3,3,4,3,2,4,2] Output: true
 * 
 * @author qiminghao
 *
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsDuplicate obj = new ContainsDuplicate();
		int[] nums = new int[] { 1, 2, 3, 1 };
		boolean res = obj.containsDuplicate(nums);
		System.out.println(res);
	}

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int x : nums) {
			set.add(x);
		}
		return set.size() != nums.length;
	}

}
