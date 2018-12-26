package algorithm;

/**
 * 169. Majority Element
 * 
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * Example 1: Input: [3,2,3] Output: 3
 * 
 * Example 2: Input: [2,2,1,1,1,2,2] Output: 2
 * 
 * @author qiminghao
 *
 */
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityElement obj = new MajorityElement();
		int[] nums = new int[] { 2, 2, 3 };
		int res = obj.majorityElement(nums);
		System.out.println(res);
	}

	public int majorityElement(int[] nums) {
		int res = nums[0], cnt = 1;
		for (int i = 1; i < nums.length; i++) {
			if (cnt == 0) {
				res = nums[i];
			}
			if (nums[i] == res) {
				cnt++;
			} else {
				cnt--;
			}
		}
		return res;
	}

}
