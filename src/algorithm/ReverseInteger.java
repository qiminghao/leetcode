package algorithm;


/**
 * 7. Reverse Integer Given a 32-bit signed integer, reverse digits of an
 * integer.
 * 
 * Example 1: Input: 123 Output: 321
 * 
 * Example 2: Input: -123 Output: -321
 * 
 * Example 3: Input: 120 Output: 21
 * 
 * Note:Assume we are dealing with an environment which could only store
 * integers within the 32-bit signed integer range: [−2^31, 2^31 − 1]. For the
 * purpose of this problem, assume that your function returns 0 when the
 * reversed integer overflows.
 * 
 * @author qiminghao
 *
 */
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseInteger obj = new ReverseInteger();
		int x = 2314;
		int res = obj.reverse(x);
		System.err.println(res);
	}

	public int reverse(int x) {
		if (Math.abs(x) < 10)
			return x;
		int sign = x > 0 ? 1 : -1;
		String res = new StringBuffer(String.valueOf(Math.abs(x))).reverse().toString();
		return sign*Integer.valueOf(res);
	}

}
