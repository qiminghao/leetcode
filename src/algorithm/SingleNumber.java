package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 136. Single Number
 * 
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Note:
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * Example 1: Input: [2,2,1] Output: 1
 * 
 * Example 2: Input: [4,1,2,1,2] Output: 4
 * 
 * @author qiminghao
 *
 */
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNumber obj = new SingleNumber();
		int[] nums = new int[] { 4, 1, 2, 1, 2 };
		int res = obj.singleNumber(nums);
		System.out.println(res);
	}

	public int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int sum1 = 0, sum2 = 0;
		for (int x : nums) {
			set.add(x);
			sum1 += x;
		}
		for (int x : set) {
			sum2 += x;
		}
		return 2 * sum2 - sum1;

//		Map<Integer, Integer> map = new HashMap<>();
//		for (int x : nums) {
//			map.putIfAbsent(x, 0);
//			map.put(x, map.get(x) + 1);
//		}
//		int res = 0;
//		for (int key : map.keySet()) {
//			if (map.get(key) == 1) {
//				res = key;
//				break;
//			}
//		}
//		return res;
	}
}
