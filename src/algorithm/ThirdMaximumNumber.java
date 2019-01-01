package algorithm;

/**
 * 414. Third Maximum Number
 * 
 * Given a non-empty array of integers, return the third maximum number in this
 * array. If it does not exist, return the maximum number. The time complexity
 * must be in O(n).
 * 
 * Example 1: Input: [3, 2, 1] Output: 1
 * Explanation: The third maximum is 1.
 * 
 * Example 2: Input: [1, 2] Output: 2
 * Explanation: The third maximum does not exist, so the maximum (2) is returned
 * instead.
 * 
 * Example 3: Input: [2, 2, 3, 1] Output: 1
 * Explanation: Note that the third maximum here means the third maximum
 * distinct number. Both numbers with value 2 are both considered as second
 * maximum.
 * 
 * @author qiminghao
 *
 */
public class ThirdMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdMaximumNumber obj = new ThirdMaximumNumber();
		int[] nums = new int[] { -2147483648,-2147483648,-2147483648,-2147483648,1,1,1 };
		int res = obj.thirdMax(nums);
		System.out.println(res);
	}

	public int thirdMax(int[] nums) {
		Integer max1 = null, max2 = null, max3 = null;
		for (Integer x : nums) {
			if (x.equals(max3) || x.equals(max2) || x.equals(max1)) {
				continue;
			} else if (max1 == null || x > max1) {
				max3 = max2;
				max2 = max1;
				max1 = x;
			} else if (max2 == null || x > max2) {
				max3 = max2;
				max2 = x;
			} else if (max3 == null || x > max3) {
				max3 = x;
			}
		}
		return max3 == null ? max1 : max3;
	}

}
