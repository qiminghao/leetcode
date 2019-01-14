package algorithm;

/**
 * 345. Reverse Vowels of a String
 * 
 * Write a function that takes a string as input and reverse only the vowels of
 * a string.
 * 
 * Example 1: Input: "hello" Output: "holle"
 * 
 * Example 2: Input: "leetcode" Output: "leotcede"
 * 
 * Note: The vowels does not include the letter "y".
 * 
 * @author qiminghao
 *
 */
public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		ReverseVowelsOfAString obj = new ReverseVowelsOfAString();
		String s = "hello";
		String res = obj.reverseVowels(s);
		System.out.println(res);
		s = "leetcode";
		res = obj.reverseVowels(s);
		System.out.println(res);
		s = "a.";
		res = obj.reverseVowels(s);
		System.out.println(res);
		s = "aA";
		res = obj.reverseVowels(s);
		System.out.println(res);
	}

	public String reverseVowels(String s) {
		if (s == null || s.length() == 0)
			return "";
		String vowels = "aeiouAEIOU";
		StringBuilder sb = new StringBuilder();
		int i = 0, j = s.length() - 1;
		while (i < s.length() || j >= 0) {
			while (i < s.length()) {
				if (!vowels.contains(s.charAt(i) + "")) {
					sb.append(s.charAt(i));
					i++;
				} else {
					break;
				}
			}
			while (j >= 0 && !vowels.contains(s.charAt(j) + "")) {
				j--;
			}
			if (j >= 0)
				sb.append(s.charAt(j));
			i++;
			j--;
		}
		return sb.toString();
	}

}
