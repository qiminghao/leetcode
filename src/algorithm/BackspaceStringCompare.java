package algorithm;

/**
 * 844. Backspace String Compare
 * 
 * Given two strings S and T, return if they are equal when both are typed into
 * empty text editors. # means a backspace character.
 * 
 * Example 1: Input: S = "ab#c", T = "ad#c" Output: true
 * Example 2: Input: S = "ab##", T = "c#d#" Output: true
 * Example 3: Input: S = "a##c", T = "#a#c" Output: true
 * Example 4: Input: S = "a#c", T = "b" Output: false
 * 
 * @author qiminghao
 *
 */
public class BackspaceStringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackspaceStringCompare obj = new BackspaceStringCompare();
		String S = "ab#c";
		String T = "ad#c";
		boolean res = obj.backspaceCompare(S, T);
		System.out.println(res);
		S = "ab##";
		T = "c#d#";
		res = obj.backspaceCompare(S, T);
		System.out.println(res);
		S = "a##c";
		T = "#a#c";
		res = obj.backspaceCompare(S, T);
		System.out.println(res);
		S = "a#c";
		T = "b";
		res = obj.backspaceCompare(S, T);
		System.out.println(res);
	}

	public boolean backspaceCompare(String S, String T) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != '#') {
				sb1.append(S.charAt(i));
			} else if (sb1.length() != 0) {
				sb1.deleteCharAt(sb1.length() - 1);
			}
		}
		for (int i = 0; i < T.length(); i++) {
			if (T.charAt(i) != '#') {
				sb2.append(T.charAt(i));
			} else if (sb2.length() != 0) {
				sb2.deleteCharAt(sb2.length() - 1);
			}
		}
		return sb1.toString().equals(sb2.toString());
	}

}
