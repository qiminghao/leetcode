package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 830. Positions of Large Groups
 * 
 * In a string S of lowercase letters, these letters form consecutive groups of
 * the same character.
 * 
 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
 * 
 * Call a group large if it has 3 or more characters. We would like the starting
 * and ending positions of every large group.
 * 
 * The final answer should be in lexicographic order.
 * 
 * Example 1: Input: "abbxxxxzzy" Output: [[3,6]]
 * Explanation: "xxxx" is the single large group with starting 3 and ending positions 6.
 * 
 * Example 2: Input: "abc" Output: [] 
 * Explanation: We have "a","b" and "c" but no large group.
 * 
 * Example 3: Input: "abcdddeeeeaabbbcd" Output: [[3,5],[6,9],[12,14]]
 * 
 * Note: 1 <= S.length <= 1000
 * 
 * @author qiminghao
 *
 */
public class PositionsOfLargeGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositionsOfLargeGroups obj = new PositionsOfLargeGroups();
		String s = "abcdddeeeeaabbbcd";
		List<List<Integer>> res = obj.largeGroupPositions(s);
		System.out.println(res);
	}

	public List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> res = new ArrayList<>();
		int start = 0, end = 1;
		while (end < S.length()) {
			for (; end < S.length() && S.charAt(end) == S.charAt(start); end++)
				;
			if (end - start >= 3) {
				List<Integer> tmp = new ArrayList<>();
				tmp.add(start);
				tmp.add(end - 1);
				res.add(tmp);
			}
			start = end;
		}
		return res;
	}

}
