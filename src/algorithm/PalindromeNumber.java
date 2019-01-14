package algorithm;

/**
 * 9. Palindrome Number
 * 
 * Determine whether an integer is a palindrome. An integer is a palindrome when
 * it reads the same backward as forward.
 * 
 * Example 1: Input: 121 Output: true
 * 
 * Example 2: Input: -121 Output: false
 * 
 * Example 3: Input: 10 Output: false
 * 
 * Follow up: Coud you solve it without converting the integer to a string?
 * 
 * @author qiminghao
 *
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		PalindromeNumber obj = new PalindromeNumber();
		int x = 121;
		boolean res = obj.isPalindrome(x);
		System.out.println(res);
		x = -121;
		res = obj.isPalindrome(x);
		System.out.println(res);
		x = 10;
		res = obj.isPalindrome(x);
		System.out.println(res);
	}

	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int p = 0, q = x;
		while (x > 0) {
			p = p * 10 + x % 10;
			x /= 10;
		}
		return p == q;
	}

}
