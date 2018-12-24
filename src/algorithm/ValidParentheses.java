package algorithm;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1: Input: "()" Output: true
 * Example 2: Input: "()[]{}" Output: true
 * Example 3: Input: "(]" Output: false
 * Example 4: Input: "([)]" Output: false
 * Example 5: Input: "{[]}" Output: true
 * 
 * @author qiminghao
 *
 */
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses obj = new ValidParentheses();
		String s = "";
		boolean res = obj.isValid(s);
		System.out.println(res);
	}

	public boolean isValid(String s) {
		if (s == null || s.length() == 0)
			return true;
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
				continue;
			}
			if ((stack.lastElement() == '(' && s.charAt(i) == ')') || (stack.lastElement() == '[' && s.charAt(i) == ']')
					|| (stack.lastElement() == '{' && s.charAt(i) == '}')) {
				stack.pop();
			} else {
				stack.push(s.charAt(i));
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}
}
