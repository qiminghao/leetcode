package algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 819. Most Common Word
 * 
 * Given a paragraph and a list of banned words, return the most frequent word
 * that is not in the list of banned words. It is guaranteed there is at least
 * one word that isn't banned, and that the answer is unique. Words in the list
 * of banned words are given in lowercase, and free of punctuation. Words in the
 * paragraph are not case sensitive. The answer is in lowercase.
 * 
 * Example: Input: paragraph = "Bob hit a ball, the hit BALL flew far after it
 * was hit." banned = ["hit"] Output: "ball"
 * 
 * Note:
 * 
 * 1 <= paragraph.length <= 1000.
 * 
 * 1 <= banned.length <= 100.
 * 
 * 1 <= banned[i].length <= 10.
 * 
 * The answer is unique, and written in lowercase (even if its occurrences in
 * paragraph may have uppercase symbols, and even if it is a proper noun.)
 * 
 * paragraph only consists of letters, spaces, or the punctuation symbols !?',;.
 * 
 * There are no hyphens or hyphenated words.
 * 
 * Words only consist of letters, never apostrophes or other punctuation
 * symbols.
 * 
 * @author qiminghao
 *
 */
public class MostCommonWord {

	public static void main(String[] args) {
		MostCommonWord obj = new MostCommonWord();
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = new String[] { "hit" };
		String res = obj.mostCommonWord(paragraph, banned);
		System.out.println(res);
	}

	public String mostCommonWord(String paragraph, String[] banned) {
		paragraph = paragraph.toLowerCase();
		Map<String, Integer> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		for (String b : banned) {
			set.add(b);
		}
		int start = 0, max = -1;
		String res = "";
		while (start < paragraph.length()) {
			while (start < paragraph.length() && !Character.isAlphabetic(paragraph.charAt(start))) {
				start++;
			}
			int end = start;
			while (end < paragraph.length() && Character.isAlphabetic(paragraph.charAt(end))) {
				end++;
			}
			String key = paragraph.substring(start, end);
			if (!set.contains(key)) {
				map.put(key, map.getOrDefault(key, 0) + 1);
				if (map.get(key) > max) {
					res = key;
					max = map.get(key);
				}
			}
			start = end;
		}
		return res;
	}

}
