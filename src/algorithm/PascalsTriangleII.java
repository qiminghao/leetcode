package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 * 
 * Given a non-negative index k where k ¡Ü 33, return the kth index row of the
 * Pascal's triangle. Note that the row index starts from 0.
 * 
 * Example: Input: 3 Output: [1,3,3,1]
 * 
 * Follow up: Could you optimize your algorithm to use only O(k) extra space?
 * 
 * @author qiminghao
 *
 */
public class PascalsTriangleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalsTriangleII obj = new PascalsTriangleII();
		for (int i = 0; i <= 33; i++) {
			System.out.println(obj.getRow(i));
		}
	}

	public List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<>();
		double denominator = 1, numerator = 1;
		res.add(1);
		for (int i = 1; i <= rowIndex; i++) {
			denominator *= i;
			numerator *= (rowIndex + 1 - i);
			numerator /= denominator;
			denominator = 1;
			res.add((int) numerator);
		}
		return res;
	}

}
