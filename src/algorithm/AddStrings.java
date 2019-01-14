package algorithm;

/**
 * 415. Add Strings
 * 
 * Given two non-negative integers num1 and num2 represented as string, return
 * the sum of num1 and num2.
 * 
 * Note:
 * 
 * 1. The length of both num1 and num2 is < 5100.
 * 
 * 2. Both num1 and num2 contains only digits 0-9.
 * 
 * 3. Both num1 and num2 does not contain any leading zero.
 * 
 * 4. You must not use any built-in BigInteger library or convert the inputs to
 * integer directly.
 * 
 * @author qiminghao
 *
 */
public class AddStrings {

	public static void main(String[] args) {
		AddStrings obj = new AddStrings();
		String num1 = "0";
		String num2 = "0";
		String res = obj.addStrings(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + res);
		num1 = "9";
		num2 = "1";
		res = obj.addStrings(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + res);
		num1 = "999";
		num2 = "12";
		res = obj.addStrings(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + res);
	}

	public String addStrings(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		StringBuilder n1 = new StringBuilder(num1).reverse();
		StringBuilder n2 = new StringBuilder(num2).reverse();
		int C = 0;
		for (int i = 0; i < Math.max(num1.length(), num2.length()); i++) {
			int a1 = i < num1.length() ? n1.charAt(i) - '0' : 0;
			int a2 = i < num2.length() ? n2.charAt(i) - '0' : 0;
			int sum = a1 + a2 + C;
			C = sum / 10;
			sb.append(sum % 10);
		}
		if (C != 0) {
			sb.append(C);
		}
		return sb.reverse().toString();
	}

}
