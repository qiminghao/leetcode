package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.
 * 
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3 
 * Explanation: The answer is "abc", with the length of 3. 
 * 
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3. 
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * @author qiminghao
 *
 */

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
		String s = "dvdf";
		int res = obj.lengthOfLongestSubstring(s);
		System.out.println(res);
	}

	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int res = 1, j = 1;
		Map<Character, Integer> map = new HashMap<>();
		map.put(s.charAt(0), 0);
		for (; j < s.length(); j++) {
			int tmp = -1;
			if (map.containsKey(s.charAt(j))) {
				tmp = map.get(s.charAt(j));
				map.clear();
				for (int i = tmp + 1; i < j; i++) {
					map.put(s.charAt(i), i);
				}
			}
			map.put(s.charAt(j), j);
			res = Math.max(res, map.size());
		}
		return res;
	}

}
