package algorithm;

/**
 * 171. Excel Sheet Column Number
 * 
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 * 
 * Example 1: Input: "A" Output: 1
 * 
 * Example 2: Input: "AB" Output: 28
 * 
 * Example 3: Input: "ZY" Output: 701
 * 
 * @author qimin
 *
 */
public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelSheetColumnNumber obj = new ExcelSheetColumnNumber();
		String s = "A";
		int res = obj.titleToNumber(s);
		System.out.println(res);
	}

	public int titleToNumber(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			res = res * 26 + s.charAt(i) - 'A' + 1;
		}
		return res;
	}

}
