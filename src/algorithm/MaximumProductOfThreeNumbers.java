package algorithm;

/**
 * 628. Maximum Product of Three Numbers
 * 
 * Given an integer array, find three numbers whose product is maximum and
 * output the maximum product.
 * 
 * Example 1: Input: [1,2,3] Output: 6
 * Example 2: Input: [1,2,3,4] Output: 24
 * 
 * Note:
 * 1. The length of the given array will be in range [3,104] and all elements
 * are in the range [-1000, 1000].
 * 2. Multiplication of any three numbers in the input won't exceed the range of
 * 32-bit signed integer.
 * 
 * @author qiminghao
 *
 */
public class MaximumProductOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumProductOfThreeNumbers obj = new MaximumProductOfThreeNumbers();
		int[] nums = new int[] { 1, 2, 3, 4 };
		int res = obj.maximumProduct(nums);
		System.out.println(res);
	}

	public int maximumProduct(int[] nums) {
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE,
				min2 = Integer.MAX_VALUE;
		for (int x : nums) {
			if (x > max1) {
				max3 = max2;
				max2 = max1;
				max1 = x;
			} else if (x > max2) {
				max3 = max2;
				max2 = x;
			} else if (x > max3) {
				max3 = x;
			}
			if (x < min1) {
				min2 = min1;
				min1 = x;
			} else if (x < min2) {
				min2 = x;
			}
		}
		return Math.max(max1 * max2 * max3, max1 * min1 * min2);
	}

}
