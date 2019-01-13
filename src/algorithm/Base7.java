package algorithm;

/**
 * 504. Base 7
 * 
 * Given an integer, return its base 7 string representation.
 * 
 * Example 1: Input: 100 Output: "202"
 * 
 * Example 2: Input: -7 Output: "-10"
 * 
 * Note: The input will be in range of [-1e7, 1e7].
 * 
 * @author qiminghao
 *
 */
public class Base7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base7 obj = new Base7();
		int num = 100;
		String res = obj.convertToBase7(num);
		System.out.println(res);
		num = -7;
		res = obj.convertToBase7(num);
		System.out.println(res);
	}

	public String convertToBase7(int num) {
		int offset = 0;
		StringBuilder sb = new StringBuilder();
		if (num < 0) {
			sb.append('-');
			offset = 1;
		}
		num = Math.abs(num);
		while (num > 0) {
			sb.insert(offset, num % 7);
			num /= 7;
		}
		return sb.length() == 0 ? "0" : sb.toString();
	}

}
