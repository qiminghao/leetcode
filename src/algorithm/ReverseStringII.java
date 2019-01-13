package algorithm;

/**
 * 541. Reverse String II
 * 
 * Given a string and an integer k, you need to reverse the first k characters
 * for every 2k characters counting from the start of the string. If there are
 * less than k characters left, reverse all of them. If there are less than 2k
 * but greater than or equal to k characters, then reverse the first k
 * characters and left the other as original.
 * 
 * Example: Input: s = "abcdefg", k = 2 Output: "bacdfeg"
 * 
 * Restrictions: The string consists of lower English letters only. Length of
 * the given string and k will in the range [1, 10000]
 * 
 * @author qiminghao
 *
 */
public class ReverseStringII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStringII obj = new ReverseStringII();
		String s = "abcdefg";
		int k = 3;
		String res = obj.reverseStr(s, k);
		System.out.println(res);
	}

	public String reverseStr(String s, int k) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < s.length(); i += 2 * k) {
			if (i + k >= s.length()) {
				for (int j = Math.min(i + k, s.length()) - 1; j >= i; j--) {
					res.append(s.charAt(j));
				}
			} else {
				for (int j = i + k - 1; j >= i; j--) {
					res.append(s.charAt(j));
				}
				for (int j = i + k; j < Math.min(i + 2 * k, s.length()); j++) {
					res.append(s.charAt(j));
				}
			}
		}
		return res.toString();
	}

}
