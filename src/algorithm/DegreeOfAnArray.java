package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 697. Degree of an Array
 * 
 * Given a non-empty array of non-negative integers nums, the degree of this
 * array is defined as the maximum frequency of any one of its elements. Your
 * task is to find the smallest possible length of a (contiguous) subarray of
 * nums, that has the same degree as nums.
 * 
 * Example 1: Input: [1, 2, 2, 3, 1] Output: 2
 * Example 2: Input: [1,2,2,3,1,4,2] Output: 6
 * 
 * Note:
 * 1. nums.length will be between 1 and 50,000.
 * 2. nums[i] will be an integer between 0 and 49,999.
 * 
 * @author qiminghao
 *
 */
public class DegreeOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DegreeOfAnArray obj = new DegreeOfAnArray();
		int[] nums = new int[] { 1, 2, 2, 3, 1 };
		int res = obj.findShortestSubArray(nums);
		System.out.println(res);
		nums = new int[] { 1, 2, 2, 3, 1, 4, 2 };
		res = obj.findShortestSubArray(nums);
		System.out.println(res);
		nums = new int[] { 1, 1, 2, 2, 2, 1 };
		res = obj.findShortestSubArray(nums);
		System.out.println(res);
	}

	public int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int times = 0, res = nums.length + 1;
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		List<Integer> list = new ArrayList<>();
		for (int key : map.keySet()) {
			if (map.get(key) > times) {
				list.clear();
				list.add(key);
				times = map.get(key);
			} else if (map.get(key) == times) {
				list.add(key);
			}
		}
		for (int key : list) {
			int right = nums.length - 1, left = 0;
			for (; left < nums.length; left++) {
				if (key == nums[left]) {
					break;
				}
			}
			for (; right >= 0; right--) {
				if (key == nums[right]) {
					break;
				}
			}
			res = Math.min(res, right - left + 1);
		}
		return res;
	}

}
