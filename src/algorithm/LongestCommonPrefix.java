package algorithm;

/**
 * 14. Longest Common Prefix
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * 
 * Example 2:
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * Note:
 * All given inputs are in lowercase letters a-z.
 * 
 * @author qimin
 *
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonPrefix obj = new LongestCommonPrefix();
		String[] strs = { "","b" };
		String res = obj.longestCommonPrefix(strs);
		System.out.println(res);
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		int minLen = strs[0].length();
		String res = strs[0];
		for (String s : strs) {
			if (minLen > s.length()) {
				minLen = s.length();
				res = s;
			}
		}
		for (int i = 0; i < minLen; i++) {
			char s = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != s) {
					return strs[0].substring(0, i);
				}
			}
		}
		return res;
	}

}
