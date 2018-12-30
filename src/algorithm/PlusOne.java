package algorithm;

/**
 * 66. Plus One
 * 
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer. The digits are stored such that the most significant
 * digit is at the head of the list, and each element in the array contain a
 * single digit. You may assume the integer does not contain any leading zero,
 * except the number 0 itself.
 * 
 * Example 1: Input: [1,2,3] Output: [1,2,4] Explanation: The array represents
 * the integer 123.
 * 
 * Example 2: Input: [4,3,2,1] Output: [4,3,2,2] Explanation: The array
 * represents the integer 4321.
 * 
 * @author qiminghao
 *
 */
public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne obj = new PlusOne();
		int[] digits = new int[] { 8, 9, 9 };
		int[] res = obj.plusOne(digits);
		for (int x : res) {
			System.out.print(x + " ");
		}
	}

	public int[] plusOne(int[] digits) {
		int C = 1, i = digits.length - 1, sum = 0;
		while (i >= 0) {
			sum = digits[i] + C;
			C = sum / 10;
			digits[i] = sum % 10;
			i--;
		}
		if (C == 0) {
			return digits;
		} else {
			int[] res = new int[digits.length + 1];
			res[0] = C;
			for (int j = 0; j < digits.length; j++) {
				res[j + 1] = digits[j];
			}
			return res;
		}

	}

}
