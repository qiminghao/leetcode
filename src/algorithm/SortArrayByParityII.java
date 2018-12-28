package algorithm;

/**
 * 922. Sort Array By Parity II
 * 
 * Given an array A of non-negative integers, half of the integers in A are odd,
 * and half of the integers are even.
 * 
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is
 * even, i is even.
 * 
 * You may return any answer array that satisfies this condition.
 * 
 * Example 1: Input: [4,2,5,7] Output: [4,5,2,7] 
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 * 
 * Note: 
 * 1. 2 <= A.length <= 20000 
 * 2. A.length % 2 == 0 
 * 3. 0 <= A[i] <= 1000
 * 
 * @author qiminghao
 *
 */
public class SortArrayByParityII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArrayByParityII obj = new SortArrayByParityII();
		int[] A = new int[] { 4, 2, 5, 7 };
		int[] res = obj.sortArrayByParityII(A);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public int[] sortArrayByParityII(int[] A) {
		int i = 0, j = 1;
		while (i < A.length && j < A.length) {
			while (i < A.length && A[i] % 2 == 0) i += 2;
			while (j < A.length && A[j] % 2 != 0) j += 2;
			if (i < A.length && j < A.length) {
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
		}
		return A;
	}

}
