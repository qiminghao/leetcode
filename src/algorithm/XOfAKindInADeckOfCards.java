package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 914. X of a Kind in a Deck of Cards
 * 
 * Example 1: Input: [1,2,3,4,4,3,2,1] Output: true Explanation: Possible
 * partition [1,1],[2,2],[3,3],[4,4]
 * 
 * Example 2: Input: [1,1,1,2,2,2,3,3] Output: false Explanation: No possible
 * partition.
 * 
 * Example 3: Input: [1] Output: false Explanation: No possible partition.
 * 
 * Example 4: Input: [1,1] Output: true Explanation: Possible partition [1,1]
 * 
 * Example 5: Input: [1,1,2,2,2,2] Output: true Explanation: Possible partition
 * [1,1],[2,2],[2,2]
 * 
 * @author qiminghao
 *
 */
public class XOfAKindInADeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XOfAKindInADeckOfCards obj = new XOfAKindInADeckOfCards();
		int[] deck = new int[] { 1, 2, 3, 4, 4, 3, 2, 1 };
		boolean res = obj.hasGroupsSizeX(deck);
		System.out.println(res);
		deck = new int[] { 1, 1, 1, 2, 2, 2, 3, 3 };
		res = obj.hasGroupsSizeX(deck);
		System.out.println(res);
		deck = new int[] { 1 };
		res = obj.hasGroupsSizeX(deck);
		System.out.println(res);
		deck = new int[] { 1, 1 };
		res = obj.hasGroupsSizeX(deck);
		System.out.println(res);
		deck = new int[] { 1, 1, 2, 2, 2, 2 };
		res = obj.hasGroupsSizeX(deck);
		System.out.println(res);
	}

	public boolean hasGroupsSizeX(int[] deck) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int x : deck) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		int res = -1;
		for (int x : map.values()) {
			if (res == -1) {
				res = x;
			} else {
				res = gcd(res, x);
			}
		}
		return res >= 2;
	}

	public int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

}
