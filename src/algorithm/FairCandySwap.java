package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 888. Fair Candy Swap
 * 
 * Alice and Bob have candy bars of different sizes: A[i] is the size of the
 * i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of
 * candy that Bob has.
 * 
 * Since they are friends, they would like to exchange one candy bar each so
 * that after the exchange, they both have the same total amount of candy. (The
 * total amount of candy a person has is the sum of the sizes of candy bars they
 * have.)
 * 
 * Return an integer array ans where ans[0] is the size of the candy bar that
 * Alice must exchange, and ans[1] is the size of the candy bar that Bob must
 * exchange.
 * 
 * If there are multiple answers, you may return any one of them. It is
 * guaranteed an answer exists.
 * 
 * Example 1: Input: A = [1,1], B = [2,2] Output: [1,2]
 * 
 * Example 2: Input: A = [1,2], B = [2,3] Output: [1,2]
 * 
 * Example 3: Input: A = [2], B = [1,3] Output: [2,3]
 * 
 * Example 4: Input: A = [1,2,5], B = [2,4] Output: [5,4]
 * 
 * @author qiminghao
 *
 */
public class FairCandySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FairCandySwap obj = new FairCandySwap();
		int[] A = new int[] { 1, 2, 5 };
		int[] B = new int[] { 2, 4 };
		int[] res = obj.fairCandySwap(A, B);
		System.out.println("[" + res[0] + ", " + res[1] + "]");
	}

	public int[] fairCandySwap(int[] A, int[] B) {
		int i = 0, j = 0, diff = 0;
		Set<Integer> set = new HashSet<>();
		for (int x : A) {
			diff += x;
		}
		for (int x : B) {
			diff -= x;
			set.add(x);
		}
		for (int x : A) {
			if (set.contains(x - diff / 2)) {
				i = x;
				j = x - diff / 2;
				break;
			}
		}
		return new int[] { i, j };
	}

}
