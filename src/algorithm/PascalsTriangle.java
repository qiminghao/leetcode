package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * 
 * Given a non-negative integer numRows, generate the first numRows of Pascal's
 * triangle.
 * 
 * @author qiminghao
 *
 */
public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalsTriangle obj = new PascalsTriangle();
		int numRows = 5;
		List<List<Integer>> res = obj.generate(numRows);
		System.out.println(res);
	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> cur = new ArrayList<>();
			if (i != 0) {
				List<Integer> pre = res.get(i - 1);
				for (int j = 0; j < pre.size(); j++) {
					cur.add(pre.get(j) + (j > 0 ? pre.get(j - 1) : 0));
				}
			}
			cur.add(1);
			res.add(cur);
		}
		return res;
	}

}
