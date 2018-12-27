package algorithm;


/**
 * 905. Sort Array By Parity
 * 
 * Given an array A of non-negative integers, return an array consisting of all
 * the even elements of A, followed by all the odd elements of A.
 * 
 * You may return any answer array that satisfies this condition.
 * 
 * Example 1: Input: [3,1,2,4] Output: [2,4,3,1] 
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * 
 * Note: 1 <= A.length <= 5000; 0 <= A[i] <= 5000
 * 
 * @author qiminghao
 *
 */
public class SortArrayByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArrayByParity obj = new SortArrayByParity();
		int[] A = new int[] { 3, 1, 2, 4 };
		int[] res = obj.sortArrayByParity(A);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}

	public int[] sortArrayByParity(int[] A) {
		int i = 0, j = A.length - 1;
		while (i < j) {
			while (i < j && A[i] % 2 == 0) i++;
			while (i < j && A[j] % 2 != 0) j--;
			if (i < j && A[i] % 2 != 0 && A[j] % 2 == 0) {
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
		}
		return A;
	}

}
