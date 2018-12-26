package algorithm;

/**
 * 125. Valid Palindrome
 * 
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * Note: For the purpose of this problem, we define empty string as valid
 * palindrome.
 * 
 * Example 1: Input: "A man, a plan, a canal: Panama" Output: true
 * 
 * Example 2: Input: "race a car" Output: false
 * 
 * @author qiminghao
 *
 */
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome obj = new ValidPalindrome();
		String s = "race a car";
		boolean res = obj.isPalindrome(s);
		System.out.println(res);
	}

	public boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (isAlphaNumeric(s.charAt(i))) {
				sb.append(Character.toLowerCase(s.charAt(i)));
			}
		}
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public boolean isAlphaNumeric(char c) {
		if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
			return true;
		} else {
			return false;
		}
	}

}
